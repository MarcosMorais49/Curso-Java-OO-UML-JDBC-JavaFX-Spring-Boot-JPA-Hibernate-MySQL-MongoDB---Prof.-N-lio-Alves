package application;

import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec10Aula91Ex02 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos números você vai digitar?");
        int qtd = sc.nextInt();
        
        double[] vet = new double[qtd];
        for (int i=0; i<vet.length; i++){
            System.out.println("Digite um número: ");
            vet[i] = sc.nextInt();
        }
        double soma = 0;
        System.out.print("VALORES: ");
        for (int i=0; i<vet.length; i++){
            System.out.printf(" %.1f",vet[i]);
            soma += vet[i];
        }
        System.out.println("");
        System.out.printf("SOMA: %.2f%n",soma);
        System.out.printf("MEDIA: %.2f%n",soma/vet.length);
        sc.close();
    }
}
