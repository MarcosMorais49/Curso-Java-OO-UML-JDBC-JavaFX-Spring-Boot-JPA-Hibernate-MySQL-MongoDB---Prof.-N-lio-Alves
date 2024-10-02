package application;

import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec10Aula91Ex04 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        int qtd =0;
        
        System.out.println("Quantos números você vai digitar? ");
        int num = sc.nextInt();
        int[] vet = new int[num];
        for (int i=0; i<vet.length; i++ ){
            System.out.print("Digite um número: ");
            vet[i] = sc.nextInt();
        }
        
        System.out.println("");
        System.out.println("Números Pares: ");
        for (int i=0; i<vet.length; i++){
            if (vet[i]%2 == 0){
                System.out.print(vet[i]+" ");
                qtd += 1;
            }    
        }
        System.out.println("");
        System.out.print("Quantidade de pares: "+qtd);
    }
}
