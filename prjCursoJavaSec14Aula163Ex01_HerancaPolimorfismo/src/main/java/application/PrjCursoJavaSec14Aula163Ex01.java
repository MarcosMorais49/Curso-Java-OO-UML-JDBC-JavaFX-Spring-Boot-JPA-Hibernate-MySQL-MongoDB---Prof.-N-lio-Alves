package application;

import entities.ImportedProduct;
import entities.Product;
import entities.UsedProduct;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec14Aula163Ex01 {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        List<Product> listProduct = new ArrayList<>();
        
        System.out.print("Enter the number of products: ");
        int quantProducts = sc.nextInt();
        
        for (int i=0; i<quantProducts; i++){
            System.out.print("Common, used or imported (c/u/i)? ");
            char type = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String prodName = sc.nextLine();
            System.out.print("Price: ");
            Double prodPrice = sc.nextDouble();
            Product product;
            if (type == 'i' || type == 'I'){
                System.out.print("Customs fee: ");
                Double prodCustomFee = sc.nextDouble();
                product = new ImportedProduct(prodCustomFee, prodName, prodPrice);
                listProduct.add(product);
            }
            else if (type == 'u' || type == 'U'){
                System.out.print("Manufacture date (DD/MM/YYYY): ");
                sc.nextLine();
                Date prodManufactureDate = sdf.parse(sc.nextLine());
                product = new UsedProduct(prodManufactureDate, prodName, prodPrice);
                listProduct.add(product);
            }
            else {
                product = new Product(prodName, prodPrice);
                listProduct.add(product);
            }
        }
        System.out.println("");
        System.out.println("PRICE TAGS: ");
        for (Product p : listProduct){
            System.out.println(p.priceTag());
        }
        
        sc.close();
    }
}
