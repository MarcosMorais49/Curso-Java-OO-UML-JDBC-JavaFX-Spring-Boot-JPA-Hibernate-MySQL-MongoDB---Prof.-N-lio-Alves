package application;

import entities.Pessoa;
import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec10Aula91Ex03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        System.out.println("Quantas pessoas serão inseridas?");
        int qtd = sc.nextInt();
        
        Pessoa[] pessoa = new Pessoa[qtd];
        for (int i=0; i<pessoa.length; i++){
            pessoa[i] = new Pessoa();
            
            System.out.println("Dados da "+(i+1)+"ª Pessoa: ");
            System.out.print("Nome: ");
            sc.nextLine();
            pessoa[i].setNome(sc.nextLine());
            System.out.print("Idade: ");
            pessoa[i].setIdade(sc.nextInt());
            System.out.print("Altura: ");
            pessoa[i].setAltura(sc.nextDouble());
        }
        double alturaMedia = 0;
        int menores = 0;
        for (int i=0; i<pessoa.length; i++){
            alturaMedia += pessoa[i].getAltura();
            if (pessoa[i].getIdade()<16){
                menores += 1;
            }
        }
        
        System.out.println("");
        System.out.printf("Altura Média: %.2f%n",alturaMedia/pessoa.length);
        double menoresPercent = (menores*100)/pessoa.length;
        System.out.printf("Pessoas com menos de 16 anos: %.1f%% %n",menoresPercent);
        for (int i=0; i<pessoa.length; i++){
            if (pessoa[i].getIdade()<16){
                System.out.println(pessoa[i].getNome());
            }
        }
        sc.close();
    }
}
