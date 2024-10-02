package application;

import entities.Employee;
import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.stream.Collectors;

public class PrjCursoJavaSec20Aula263Ex01 {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        
        Locale.setDefault(Locale.US);
        
        List<Employee> list = new ArrayList<>();
        
        String path = "C:\\Users\\Marcinha\\Documents\\in.csv";
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            String line = br.readLine();
            
            while(line != null){
                String[] aux = line.split(",");
                Employee employee = new Employee(aux[0], aux[1], Double.parseDouble(aux[2]));
                list.add(employee);
                
                line = br.readLine();
            }
            
            System.out.print("Enter salary: ");
            double salary = sc.nextDouble();
            
            List<String> emails = list.stream().filter(e -> e.getSalary() > salary).map(e -> e.getEmail()).sorted().collect(Collectors.toList());
            System.out.println("Email of people whose salary is more than " + String.format("%.2f: ", salary));
            emails.forEach(System.out::println);
            
            Double sum = list.stream().filter(e -> e.getName().charAt(0) == 'M').map(s -> s.getSalary()).reduce(0.0, (x,y) -> x+y);
            System.out.println("Sum of salary of people whose name starts with 'M': " + String.format("%.2f", sum));
            
        }
        catch (IOException e) {
            System.out.println("Error: "+ e.getMessage());
        }
        sc.close();
    }
}
