package com.mycompany.prjcursojavasec05aula37ex02;

import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec05Aula37Ex02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite um número");
        int num = sc.nextInt();
        
        if (num % 2 == 0){
            System.out.println("PAR");
        }
        else{
            System.out.println("ÍMPAR");
        }
    }
}
