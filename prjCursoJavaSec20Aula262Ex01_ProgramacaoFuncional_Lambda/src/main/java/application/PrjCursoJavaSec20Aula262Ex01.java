package application;

import entities.Product;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class PrjCursoJavaSec20Aula262Ex01 {

    public static void main(String[] args) {
        
        List<Product> list = new ArrayList<>();
        
        String path = "C:\\Users\\Marcinha\\Documents\\in.csv";
        
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            
            String line = br.readLine();
            
            while(line != null){
                String[] name = line.split(",");
                Product product = new Product(name[0], Double.parseDouble(name[1]));
                list.add(product);
                line = br.readLine();
            }
            
            double avg = list.stream().map(p -> p.getPrice()).reduce(0.0, (x,y) -> x + y) / list.size();
            System.out.println("Average price: " + String.format("%.2f", avg));
            
            Comparator<String> comp = (s1,s2) -> s1.toUpperCase().compareTo(s2.toUpperCase());
            
            List<String> names = list.stream()
                    .filter(p -> p.getPrice() < avg)
                    .map(p -> p.getName())
                    .sorted(comp.reversed())
                    .collect(Collectors.toList());
            
            names.forEach(System.out::println);
        }
        catch (IOException e){
            System.out.println("Error: "+e.getMessage());
        }
    }
}
