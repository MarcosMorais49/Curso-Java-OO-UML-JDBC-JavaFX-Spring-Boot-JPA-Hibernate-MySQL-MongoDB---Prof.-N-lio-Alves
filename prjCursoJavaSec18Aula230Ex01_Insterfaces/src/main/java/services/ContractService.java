package services;

import entities.Contract;
import entities.Installment;
import java.util.ArrayList;
import java.util.Calendar;
import java.util.Date;
import java.util.List;

public class ContractService {
    
    private OnlinePaymentService onlinePaymentService;

    public ContractService(OnlinePaymentService onlinePaymentService){
        this.onlinePaymentService = onlinePaymentService;
    }
    
    public void processContract(Contract contract, Integer months){
        
        double value = contract.getTotalValue() / months; 
        
        for (int i = 1; i <= months; i++){
            Date date = contract.getDate();
            Calendar cal = Calendar.getInstance();
            cal.setTime(contract.getDate());
            cal.add(Calendar.MONTH, i);
            Date dueDate = cal.getTime();
                             
            double valueInterest = onlinePaymentService.interest(value, i);
            double valueTax = onlinePaymentService.paymentFee(valueInterest);
            
            Installment installment = new Installment(dueDate, valueTax);
            contract.getInstallments().add(installment);            
        }
    }
}
