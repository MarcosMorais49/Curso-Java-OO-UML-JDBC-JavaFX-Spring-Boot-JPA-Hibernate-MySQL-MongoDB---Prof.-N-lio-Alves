package application;

import entities.CarRental;
import entities.Vehicle;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;
import java.util.Scanner;
import services.BrazilTaxServices;
import services.RentalServices;

public class PrjCursoJavaSec18Aula225Ex01 {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        DateTimeFormatter fmt = DateTimeFormatter.ofPattern("dd/MM/yyyy HH:mm");
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy HH:mm");
        
        try{
            System.out.println("Entre com os dados do aluguel: ");
            System.out.print("Modelo do carro: ");
            String model = sc.nextLine();
            System.out.print("Retirada (dd/mm/aaaa hh:mm)");
            LocalDateTime start = LocalDateTime.parse(sc.nextLine(), fmt);
            System.out.print("Entrega (dd/mm/aaaa hh:mm)");
            LocalDateTime finish = LocalDateTime.parse(sc.nextLine(), fmt);
            System.out.print("Entre com o preço por hora: ");
            Double pricePerHour = sc.nextDouble();
            System.out.print("Entre com o preço por dia: ");
            Double pricePerDay = sc.nextDouble();
      
            CarRental cr = new CarRental(start, finish, new Vehicle(model));
            
            RentalServices rentalService = new RentalServices(pricePerDay, pricePerHour, new BrazilTaxServices());
            
            rentalService.processInvoice(cr);
            
            System.out.println("Fatura: ");
            System.out.println("Pagamento básico: " + cr.getInovice().getBasicPayment());
            System.out.println("imposto: " + cr.getInovice().getTax());
            System.out.println("Pagamento total: "+cr.getInovice().getTotalPayment());
        } 
        catch (RuntimeException e){
            System.out.println("Error: " + e.getMessage());
        }
        finally{
            sc.close();
        }
    }
}
