package com.mycompany.prjcursojavasec06aula49ex03;

import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec06Aula49Ex03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int tipo = 0, alc = 0, gas = 0, die = 0;
        
        while (tipo != 4){
            System.out.println("Informe o tipo do combustível: ");
            tipo = sc.nextInt();
            
            if (tipo == 1){
                alc += 1;
            }
            else if (tipo == 2){
                gas += 1;            
            }
            else if (tipo == 3) {
                die += 1;
            }
        }
        System.out.printf("Muito Obrigado! %n"
                + "Alcool = %d %n"
                + "Gasolina = %d %n"
                + "Diesel = %d ", alc, gas, die);
        sc.close();
    }
    
}
