/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Project/Maven2/JavaApp/src/main/java/${packagePath}/${mainClassName}.java to edit this template
 */

package aplication;

import entities.Employee;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author Marcinha
 */
public class PrjCursoJavaSec08Aula70Ex021 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Employee employee = new Employee();
        System.out.println("Informe o nome do funcionário: ");
        employee.name = sc.nextLine();
        System.out.println("Informe o salário bruto: ");
        employee.grossSalary = sc.nextDouble();
        System.out.println("Informe o valor do imposto ");
        employee.tax = sc.nextDouble();
        System.out.printf("Employee: %s , $%.2f%n%n", employee.name, employee.NetSalary());
        System.out.println("Which percentege to increase salary?");
        double percentage = sc.nextDouble();
        employee.IncreaseSalary(percentage);
        
        System.out.printf("Updated data: %s , $%.2f", employee.name, employee.grossSalary);
        sc.close();
    }
}
