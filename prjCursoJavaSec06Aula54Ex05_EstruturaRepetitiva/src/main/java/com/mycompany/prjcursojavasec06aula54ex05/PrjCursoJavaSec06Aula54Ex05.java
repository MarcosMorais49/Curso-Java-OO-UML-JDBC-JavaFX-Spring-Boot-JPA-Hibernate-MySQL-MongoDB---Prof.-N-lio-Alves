package com.mycompany.prjcursojavasec06aula54ex05;

import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec06Aula54Ex05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int soma=0;
        
        System.out.println("Digite um número inteiro para saber seu fatorial:");
        int num = sc.nextInt();
        soma = num;
        for (int i=num; i>1; i--){
            soma = soma*(i-1);
        }
        System.out.println("O fatorial de "+num+" é: "+soma);
    }
}
