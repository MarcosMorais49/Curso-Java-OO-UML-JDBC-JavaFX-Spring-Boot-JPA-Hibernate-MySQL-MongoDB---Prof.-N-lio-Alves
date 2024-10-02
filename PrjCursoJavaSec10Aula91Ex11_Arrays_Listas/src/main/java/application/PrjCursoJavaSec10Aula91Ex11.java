package application;

import entities.Pessoas;
import java.util.Locale;
import java.util.Scanner;
       
public class PrjCursoJavaSec10Aula91Ex11 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        double maiorAltura=0, menorAltura=9999999, mediaAltura=0;
        int qtdMulheres=0, qtdHomens=0;
        
        System.out.println("Quantas pessoas serão digitadas?");
        int qtd = sc.nextInt();
        
        Pessoas[] pessoas = new Pessoas[qtd];
        for (int i=0; i<pessoas.length; i++){
            pessoas[i] = new Pessoas();
            System.out.printf("Altura da %dª pessoa: ",(i+1));
            pessoas[i].setAltura(sc.nextDouble());
            System.out.printf("Genero da %dª pessoa: ",(i+1));
            sc.nextLine();
            pessoas[i].setGenero(sc.nextLine().charAt(0));
            if (pessoas[i].getAltura()>maiorAltura){
                maiorAltura = pessoas[i].getAltura();
            }
            if (pessoas[i].getAltura()< menorAltura){
                menorAltura = pessoas[i].getAltura();
            }
            if (pessoas[i].getGenero() == 'F' || pessoas[i].getGenero() == 'f'){
                mediaAltura += pessoas[i].getAltura();
                qtdMulheres += 1;
            }
            else if (pessoas[i].getGenero() == 'M' || pessoas[i].getGenero() == 'm'){
                qtdHomens += 1;
            }
        }
        System.out.printf("MENOR ALTURA: %.2f%n",menorAltura);
        System.out.printf("MAIOR ALTURA: %.2f%n", maiorAltura);
        System.out.printf("MEDIA DAS ALTURAS DAS MULHERES: %.2f%n",mediaAltura/qtdMulheres);
        System.out.printf("NUMERO DE HOMENS: %d%n",qtdHomens);
        sc.close();
    }
}
