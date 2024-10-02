package application;

import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec10Aula91Ex01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
                
        System.out.println("Digite um número de 1 a 10.");
        int num = sc.nextInt();
        
        int[] vet = new int[num];
        for (int i=0; i<vet.length; i++){
            System.out.printf("Informe o %dº número do vetor: (Positivo ou negativo)",i+1);
            vet[i] = sc.nextInt();
        }
        
        System.out.println("");
        System.out.println("Números Negativos: ");
        for (int i=0; i<vet.length; i++){
            if (vet[i]<0){
                System.out.println(vet[i]);
            }
        }
        sc.close();
    }
}
