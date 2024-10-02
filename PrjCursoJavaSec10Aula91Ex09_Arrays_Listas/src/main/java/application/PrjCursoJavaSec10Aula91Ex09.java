package application;

import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec10Aula91Ex09 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas pessoas você vai digitar?");
        int pessoas = sc.nextInt();
        
        int[] vetIdade = new int[pessoas];
        String[] vetNome = new String[pessoas];
        int maisVelha = -1, idadeMaisVelha = 0;
        
        for (int i=0; i<vetIdade.length; i++){
            System.out.printf("Dados da %dª pessoa: %n",(i+1));
            System.out.print("Nome: ");
            sc.nextLine();
            vetNome[i] = sc.nextLine();
            System.out.print("Idade: ");
            vetIdade[i] = sc.nextInt();
            if (vetIdade[i]>idadeMaisVelha){
                maisVelha = i;
                idadeMaisVelha = vetIdade[i];
            }
        }
        System.out.printf("PESSOA MAIS VELHA: %s",vetNome[maisVelha]);
        sc.close();
    }
}
