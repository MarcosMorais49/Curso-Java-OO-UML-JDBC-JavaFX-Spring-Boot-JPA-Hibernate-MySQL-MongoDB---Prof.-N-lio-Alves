/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Marcinha
 */
public class Student {
    public String name;
    public double nota1;
    public double nota2;
    public double nota3;
    
    public double media(){
        return nota1+nota2+nota3;
    }
    
    public void aprovado(){
        if (this.media() >= 60){
            System.out.println("PASS");
        }
        else {
            System.out.println("FAILED");
            System.out.printf("MISSING %.2f POINTS %n", 60-this.media());
        }
    }

}
