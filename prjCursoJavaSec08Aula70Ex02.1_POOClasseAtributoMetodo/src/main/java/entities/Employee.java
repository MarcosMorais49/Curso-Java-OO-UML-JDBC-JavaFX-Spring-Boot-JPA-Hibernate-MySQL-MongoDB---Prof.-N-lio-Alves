/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package entities;

/**
 *
 * @author Marcinha
 */
public class Employee {
    public String name;
    public double grossSalary;
    public double tax;
    
    public double NetSalary(){
        return grossSalary - tax;
    }
    
    public void IncreaseSalary(double percentage){
        grossSalary = grossSalary+(grossSalary * (percentage/100))-tax;
    }
}
