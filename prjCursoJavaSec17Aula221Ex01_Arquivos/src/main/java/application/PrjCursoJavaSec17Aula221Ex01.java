package application;

import entities.Product;
import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class PrjCursoJavaSec17Aula221Ex01 {

    public static void main(String[] args) {
        
        String path = "C:\\Users\\Marcinha\\Documents\\in.txt";
        List<Product> list = new ArrayList<>();
    
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();

            while (line != null){
            
                String[] descricao = line.split(",");
                String name = descricao[0];
                double price = Double.parseDouble(descricao[1]);
                int quantity = Integer.parseInt(descricao[2]);
                Product product = new Product(name, price, quantity);
                
                list.add(product);
                
                line = br.readLine();
            }
            
            String saida = "C:\\Users\\Marcinha\\Documents\\out.txt";
            try (BufferedWriter bw = new BufferedWriter(new FileWriter(saida))){           
            for (Product p : list){
                bw.write(p.toString());
                bw.newLine();
            }
        }
        }
        catch(IOException e){
                System.out.println("Error: "+e.getMessage());
        }
    }
}
