package application;

import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec10Aula91Ex08 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos elementos vai ter o vetor?");
        int qtd = sc.nextInt();
        
        int[] vet = new int[qtd];
        double media = 0;
        int tot = 0;
        for (int i=0; i<vet.length; i++){
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
            if (vet[i]%2 == 0){
                media += vet[i];   
                tot += 1;
            }
        }
        media = media/tot;
        if (tot>0){
            System.out.printf("MEDIA DOS PARES = %.1f%n",media);
        }
        else {
            System.out.println("NENHUM NUMERO PAR");
        }
        sc.close();
    }
}
