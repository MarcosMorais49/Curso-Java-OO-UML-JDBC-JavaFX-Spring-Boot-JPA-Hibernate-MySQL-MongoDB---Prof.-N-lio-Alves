package com.mycompany.prjcursojavasec06aula49ex01;

import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec06Aula49Ex01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        int senha = 0;
        while (senha != 2002){
            System.out.print("Digite a senha: ");
            senha = sc.nextInt();
            if (senha == 2002){
                System.out.println("Acesso Permitido");
            }
            else {
                System.out.println("Senha Inválida  ");
            }
        }
    }
}
