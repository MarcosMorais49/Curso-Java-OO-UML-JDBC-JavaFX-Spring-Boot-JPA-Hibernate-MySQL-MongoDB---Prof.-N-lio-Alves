package application;

import entities.Client;
import entities.Order;
import entities.OrderItem;
import entities.Product;
import entitiesEnum.OrderStatus;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;
import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec13Aula153Ex01 {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.println("Enter client data: ");
        System.out.print("Name: ");
        String name = sc.nextLine();
        System.out.print("Email: ");
        String email = sc.nextLine();
        System.out.print("Birth date (DD/MM/YYYY): ");
        Date birthDate = sdf.parse(sc.nextLine());
        
        Client client = new Client(name, email, birthDate);
        
        System.out.println("Enter Order data: ");
        System.out.print("Status: ");
        OrderStatus status =OrderStatus.valueOf( sc.nextLine());
        
        Calendar calendar = Calendar.getInstance();
        Order order = new Order(calendar.getTime(), OrderStatus.PROCESSING, client);
        
        System.out.print("How many items to this order? ");
        int quantity = sc.nextInt();
        for(int i=1; i<=quantity; i++){
            System.out.println("Enter #"+i+" item data: ");
            System.out.print("Product name: ");
            sc.nextLine();
            String productName = sc.nextLine();
            System.out.print("Product price: ");
            double productPrice = sc.nextDouble();
            System.out.print("Quantity: ");
            int productQuantity = sc.nextInt();
            
            Product product = new Product(productName, productPrice);
            
            OrderItem orderItem = new OrderItem(productQuantity, productPrice, product);
            
            order.addItem(orderItem);
        }
        
        System.out.println("");
        System.out.println("ORDER SUMMARY: ");
        System.out.println(order.toString());
        
        sc.close();
    }
}
