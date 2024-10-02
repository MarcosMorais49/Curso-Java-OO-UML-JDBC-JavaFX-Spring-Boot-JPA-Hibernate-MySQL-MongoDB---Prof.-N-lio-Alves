package application;

import entities.Employee;
import entities.OutsourceEmployee;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec14Aula162Ex01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<Employee> list = new ArrayList<>();
        
        System.out.print("Enter the number of employees: ");
        int numberEmployees = sc.nextInt();        
        for(int i = 0; i < numberEmployees; i++){
            System.out.println("Employee #"+(i+1)+" data: ");
            System.out.print("Outsourced (y/n)?");
            char outsourced = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String empName = sc.nextLine();
            System.out.print("Hours: ");
            int empHours = sc.nextInt();
            System.out.print("Value per hour: ");
            double empValue = sc.nextDouble();

            if (outsourced == 'y' || outsourced == 'Y'){
                System.out.print("Additional Charge: ");
                double empAdditionalCharge = sc.nextDouble();
                OutsourceEmployee outsourceEmployee = new OutsourceEmployee(empAdditionalCharge, empName, empHours, empValue);
                list.add(outsourceEmployee);
            }
            else {
                Employee employee = new Employee(empName, empHours, empValue);
                list.add(employee);
            }
        }
        System.out.println("");
        System.out.println("PAYMENTS: ");
        for (Employee emp : list){
            System.out.println(emp.getName()+" - $"+String.format("%.2f", emp.payment()));
        }        
        sc.close();
    }
}
