package com.mycompany.prjcursojavasec08aula70ex03;

import entities.Student;
import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec08Aula70Ex03 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        Student student = new Student();
        System.out.println("Digite o nome do aluno: ");
        student.name = sc.nextLine();
        System.out.println("Informe a nota do primeiro trimestre:");
        student.nota1 = sc.nextDouble();
        System.out.println("Informe a nota do segundo trimestre:");
        student.nota2 = sc.nextDouble();
        System.out.println("Informe a nota do terceiro trimestre:");
        student.nota3 = sc.nextDouble();
        
        System.out.printf("FINAL GRADE : %.2f%n",student.media());
        student.aprovado();
        sc.close();
    }
}
