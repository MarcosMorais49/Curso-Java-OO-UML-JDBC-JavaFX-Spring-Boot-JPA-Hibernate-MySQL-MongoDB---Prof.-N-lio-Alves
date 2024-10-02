package application;

import entities.Contract;
import entities.Installment;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;
import services.ContractService;
import services.PaypalService;

public class PrjCursoJavaSec18Aula230Ex01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        try{
            System.out.println("Entre com os dados do contrato:");
            System.out.print("Número: ");
            int num = sc.nextInt();
            sc.nextLine();
            System.out.print("Data (dd/mm/yyyy): ");
            Date data = sdf.parse(sc.nextLine());
            System.out.print("Valor do contrato: ");
            double valorContrato = sc.nextDouble();
            System.out.print("Entre com o número de parcelas: ");
            int parcelas = sc.nextInt();
            
            Contract contract = new Contract(num, data, valorContrato);
            PaypalService paypalService = new PaypalService();
            ContractService contractService = new ContractService(paypalService);
            contractService.processContract(contract, parcelas);
            
            System.out.println("");
            System.out.println("Parcelas:");
            for (Installment installment : contract.getInstallments()) {
                System.out.println(sdf.format(installment.getDueDate()) + " - " + installment.getAmount());
            }
            
        }
        catch (RuntimeException e){
            System.out.println("Error: "+e.getMessage());
        }
        catch (Exception e){
            System.out.println("Erro parsear data");
        }
        finally{
            sc.close();
        }
        
    }
}
