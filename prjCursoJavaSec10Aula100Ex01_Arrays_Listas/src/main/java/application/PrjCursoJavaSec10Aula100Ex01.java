package application;

import entities.Employee;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;
import java.util.ArrayList;

public class PrjCursoJavaSec10Aula100Ex01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("How many employees wil be registred? ");
        int n = sc.nextInt();
        
        List<Employee> lista = new ArrayList<>();
        
        for (int i=0; i<n; i++){
            System.out.println("");
            System.out.println("Employee #"+(i+1)+": ");
            System.out.print("Id: ");
            int id = sc.nextInt();
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Salary: ");
            double salary = sc.nextDouble();
            
            lista.add(new Employee(id, name, salary));
        }
        System.out.println("");
        System.out.print("Enter the employee id that will have salary increase : ");
        int cod = sc.nextInt();
        int control = 0;
        
        for (Employee l : lista){
            if (l.getId() == cod){
                control = 1;
            }
        }
        
        if (control == 0){
            System.out.println("This id does not exist!");
        }
        
        for (Employee l : lista){
            if (l.getId() == cod){
                System.out.print("Enter the percentage: ");
                double percent = sc.nextDouble();
                double newSal = l.getSalary() + (l.getSalary()*percent/100);
                l.setSalary(newSal);
                control = 1;
            }
        }
        System.out.println("");
        System.out.println("List os employees: ");
        for (Employee l : lista){
            System.out.println(l);
        }
    }
}
