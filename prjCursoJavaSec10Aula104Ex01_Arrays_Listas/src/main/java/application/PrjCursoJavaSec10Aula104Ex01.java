package application;

import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec10Aula104Ex01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.print("Informe o número de linhas da matriz: ");
        int l = sc.nextInt();
        System.out.print("Informe o número de colunas da matriz: ");
        int c = sc.nextInt();
        
        Integer[][] mat = new Integer[l][c];
        for (int i=0; i<l; i++){
            for (int j=0; j<c; j++){
                System.out.print("Digite um número inteiro para a posição "+i+","+j+" da matriz: ");
                mat[i][j] = sc.nextInt();
            }
        }
        System.out.print("Qual número deseja localizar na matriz? ");
        int localizar = sc.nextInt();
        
        for (int i=0; i<mat.length; i++){
            for (int j=0; j<mat[i].length; j++){
                if (mat[i][j] == localizar){
                    System.out.println("");
                    System.out.println("Position "+i+","+j+":");
                    
                    if (j-1 >= 0){
                        System.out.println("Left: "+mat[i][(j-1)]);
                    }
                    if (j+1 < c){
                        System.out.println("Right: "+mat[i][(j+1)]);
                    }
                    if (i-1 >= 0){
                        System.out.println("Up: "+mat[i-1][(j)]);
                    }
                    if (i+1 < l){
                        System.out.println("Down: "+mat[i+1][(j)]);
                    }
                }
            }
        }
        sc.close();
    }
}
