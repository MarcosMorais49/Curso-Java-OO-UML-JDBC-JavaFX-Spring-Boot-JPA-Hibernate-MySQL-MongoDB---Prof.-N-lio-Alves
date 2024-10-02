package com.mycompany.prjcursojavasec05aula37ex05;

import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec05Aula37Ex05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe o código do produto: ");
        int cod = sc.nextInt();
        System.out.println("Informe a quantidade adquirida: ");
        int qtd = sc.nextInt();
        double total = 0;
        
        if (cod == 1){
           total = qtd * 4;   
        }
        else if (cod == 2){
            total = qtd * 4.5;
        }
        else if (cod == 3){
            total = qtd * 5;
        }
        else if (cod == 4){
            total = qtd * 2;
        }
        else if (cod == 5){
            total = qtd * 1.5;
        }
        else {
            qtd = 0;
        }
        if (qtd == 0) {
            System.out.println("Código Inválido");
        }
        else {
            System.out.println("TOTAL R$"+total);
        }
        sc.close();
    }
}
