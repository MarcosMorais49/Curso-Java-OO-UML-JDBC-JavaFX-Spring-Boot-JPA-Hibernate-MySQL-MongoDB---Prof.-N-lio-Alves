package application;

import entities.Company;
import entities.Individual;
import entities.TaxPayer;
import java.util.ArrayList;
import java.util.List;
import java.util.Locale;
import java.util.Scanner;

public class PrjCursoJavaSec14Aula166Ex01 {

    public static void main(String[] args) {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        
        List<TaxPayer> list = new ArrayList<>();
        
        System.out.print("Enter the number of tax payers: ");
        int num = sc.nextInt();
        
        for(int i=0; i<num; i++){
            System.out.println("Tax payer #"+(i+1)+" data: ");
            System.out.print("Individual or company? (i/c)? ");
            char op = sc.next().charAt(0);
            System.out.print("Name: ");
            sc.nextLine();
            String name = sc.nextLine();
            System.out.print("Anual Income: ");
            Double anualIncome = sc.nextDouble();
            if (op == 'i'){
                System.out.print("Healt Expenditures: ");
                double healtExpenditures = sc.nextDouble();
                TaxPayer taxPayer = new Individual(healtExpenditures, name, anualIncome);
                list.add(taxPayer);
            }
            else{
                System.out.print("Number of employees: ");
                int numberEmployees = sc.nextInt();
                TaxPayer taxPayer = new Company(numberEmployees, name, anualIncome);
                list.add(taxPayer);
            }
        }   
        System.out.println("");
        System.out.println("TAXES PAID: ");
        double totalTaxes = 0;
        for(TaxPayer t : list){
            System.out.println(t.getName()+String.format(": $ %.2f",t.tax()));
            totalTaxes += t.tax();
        }    
        System.out.println("");
        System.out.println(String.format("TOTAL TAXES: $ %.2f",totalTaxes));
        sc.close();
    }
}
