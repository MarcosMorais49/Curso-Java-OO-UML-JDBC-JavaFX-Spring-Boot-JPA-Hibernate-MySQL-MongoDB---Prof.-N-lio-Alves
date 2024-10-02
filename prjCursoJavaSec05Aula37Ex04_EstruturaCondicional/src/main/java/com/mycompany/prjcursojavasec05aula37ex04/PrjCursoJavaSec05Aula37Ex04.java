package com.mycompany.prjcursojavasec05aula37ex04;

import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec05Aula37Ex04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Informe a hora inicial do jogo: ");
        int hInicial = sc.nextInt();
        int hFinal = sc.nextInt();
        int totHoras = 0;
        
        if (hFinal > hInicial){
            totHoras = hFinal - hInicial;
        }
        else if (hFinal == hInicial){
            totHoras = 24;
        }
        else {
            totHoras = (24 - hInicial + hFinal);
        }        
        System.out.println("O jogo durou "+totHoras+" horas.");
    }
}
