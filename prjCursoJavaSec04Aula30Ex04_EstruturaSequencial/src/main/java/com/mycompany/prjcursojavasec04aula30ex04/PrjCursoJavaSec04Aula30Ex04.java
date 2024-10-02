package com.mycompany.prjcursojavasec04aula30ex04;

import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec04Aula30Ex04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o número do funcionário: ");
        int num = sc.nextInt();
        System.out.print("Informe o número de horas trabalhadas: ");
        double horas = sc.nextDouble();
        System.out.print("Informe o valor por hora: ");
        double valor = sc.nextDouble();
        
        double soma = horas * valor;
        
        System.out.println("Number = "+num);
        System.out.printf("Salary: U$ %.2f", soma);
        
        sc.close();
    }
}
