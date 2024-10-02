package application;

import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec10Aula91Ex05 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int maiorValor=0, posMaior=-1;
        
        System.out.println("Quantos números você vai digitar? ");
        int num = sc.nextInt();
        
        int[] vet = new int[num];
        for (int i=0; i<vet.length; i++){
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
            if (vet[i]>maiorValor){
                maiorValor = vet[i];
                posMaior = i;
            }
        }     
        System.out.println("");
        System.out.println("MAIOR VALOR = "+maiorValor);
        System.out.println("POSICAO DO MAIOR VALOR = "+posMaior);
        sc.close();
    }
}
