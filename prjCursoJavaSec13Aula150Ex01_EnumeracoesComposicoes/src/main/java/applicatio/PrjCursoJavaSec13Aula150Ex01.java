package applicatio;

import entities.Departament;
import entities.HourContract;
import entities.Worker;
import entitiesEnum.WorkerLevel;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.Locale;

public class PrjCursoJavaSec13Aula150Ex01 {

    public static void main(String[] args) throws ParseException {
        Locale.setDefault(Locale.US);
        Scanner sc = new Scanner(System.in);
        SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
        
        System.out.print("Enter departament's name: ");
        String departamentName = sc.nextLine();
        System.out.println("Enter work data: ");
        System.out.print("Name: ");
        String workerName = sc.nextLine();
        System.out.print("Level: ");
        String workerLevel = sc.nextLine();
        System.out.print("Base Salary: ");
        double baseSalary = sc.nextDouble();
        
        // Ao instanciar um novo Worker, é necessário instanciar um novo Departament pois se trata de uma outra classe com relacionamento na classe Worker
        Worker worker = new Worker(workerName, WorkerLevel.valueOf(workerLevel), baseSalary, new Departament(departamentName));
        
        System.out.print("How many contracts to this worker? ");
        int n = sc.nextInt();
        
        for (int i=1; i<=n; i++){
            System.out.println("Enter contract #"+i+" data: ");
            System.out.print("Date (DD/MM/YYYY): ");
            Date contractDate = sdf.parse(sc.next());//No inicio do código, foi instanciado um simpleDateFormat para alterar o formato da data
            System.out.print("Value per hour: ");
            double valuePerHour = sc.nextDouble();
            System.out.print("Duration (hours): ");
            int hours = sc.nextInt();
            HourContract contract = new HourContract(contractDate, valuePerHour, hours);
            worker.addContract(contract);
        }
        
        System.out.println("");
        System.out.print("Enter month and year to calculate income (MM/YYYY): ");
        String monthAndYear = sc.next();
        //Abaixo segue uma outra forma de capturar mes e ano de uma determinada data, porem, desta vez, sem usar a classe Calendar, como foi usado na classe Worker 
        int month = Integer.parseInt(monthAndYear.substring(0,2));
        int year = Integer.parseInt(monthAndYear.substring(3));
        System.out.println("Name: "+worker.getName());
        System.out.println("Departament: "+worker.getDepartament().getName());
        System.out.println("Income for "+monthAndYear+": "+ String.format("%.2f", worker.income(year, month)));
        
        sc.close();
    }
}
