package com.mycompany.prjcursojavasec06aula54ex06;

import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec06Aula54Ex06 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número para saber seus divisores: ");
        int num = sc.nextInt();
        
        for (int i=1; i<=num; i++){
            if (num%i == 0){
                System.out.println(i);
            }
        }
        sc.close();
    }
}
