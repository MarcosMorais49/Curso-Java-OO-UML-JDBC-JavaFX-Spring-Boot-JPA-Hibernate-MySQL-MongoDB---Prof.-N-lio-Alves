package application;

import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec10Aula91Ex06 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos valores terá cada vetor? ");
        int qtd = sc.nextInt();
        
        int[] vetA = new int[qtd];
        int[] vetB = new int[qtd];
        int[] vetC = new int[qtd];
        System.out.println("Digite os valores do vetor A:");
        for (int i=0; i<vetA.length; i++){
            vetA[i] = sc.nextInt();
        }
        
        System.out.println("Digite os valores do vetor B:");
        for (int i=0; i<vetB.length; i++){
            vetB[i] = sc.nextInt();
        }
        
        System.out.println("Vetor Resultante: ");
        for (int i=0; i<vetA.length; i++){
            vetC[i] = vetA[i]+vetB[i];
            System.out.println(vetC[i]);
        }
        sc.close();
    }
}
