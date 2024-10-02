package application;

import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec10Aula91Ex10 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantos alunos serão digitados?");
        int qtd = sc.nextInt();
        
        String[] vetNomes = new String[qtd];
        double[] notas1 = new double[qtd];
        double[] notas2 = new double[qtd];
        
        for (int i=0; i<vetNomes.length; i++){
            System.out.printf("Digite o nome, primeira e segunda nota do %dº aluno: %n",(i+1));
            sc.nextLine();
            vetNomes[i] = sc.nextLine();
            notas1[i] = sc.nextDouble();
            notas2[i] = sc.nextDouble();
        }
        
        System.out.println("Alunos aprovados: ");
        for (int i=0; i<vetNomes.length; i++){
            if ((notas1[i]+notas2[i])/2 >=6){
                System.out.println(vetNomes[i]);
            }
        }
        sc.close();
    }
}
