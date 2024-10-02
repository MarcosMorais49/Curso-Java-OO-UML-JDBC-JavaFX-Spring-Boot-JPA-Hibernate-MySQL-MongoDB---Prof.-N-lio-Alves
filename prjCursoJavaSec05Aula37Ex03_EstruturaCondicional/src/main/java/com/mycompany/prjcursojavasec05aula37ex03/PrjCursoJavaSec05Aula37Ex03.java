package com.mycompany.prjcursojavasec05aula37ex03;

import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec05Aula37Ex03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Digite dois números inteiros: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        
        if (a > b){
            if (a % b == 0){
                System.out.println("São Múltiplos");
            }
            else{
                System.out.println("Não são Múltiplos");
            }
        }
        else {
            if (b % a == 0){
                System.out.println("São Múltiplos");
            }
            else {
                System.out.println("Não são múltiplos");
            }
        }
    }
}
