package entities;

import entitiesEnum.WorkerLevel;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class Worker {
    private String name;
    private WorkerLevel level;
    private Double baseSalary;
    
    private Departament departament; //Criando a associação 1P/1 com a classe departament
    private List<HourContract> contracts = new ArrayList<>(); //Criando a associação 1p/* (Varios) contratos
    
//    List<HourContract> list = new ArrayList<>();
//    Calendar calendario = Calendar.getInstance();
//    calendario.setTime(date);
//    SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
    
    public Worker(){
    }

    //Gerar o construtor sem selecionar os campos do tipo Lista. Nesse caso, "Contratos"
    public Worker(String name, WorkerLevel level, Double baseSalary, Departament departament) {
        this.name = name;
        this.level = level;
        this.baseSalary = baseSalary;
        this.departament = departament;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public WorkerLevel getLevel() {
        return level;
    }

    public void setLevel(WorkerLevel level) {
        this.level = level;
    }

    public Double getBaseSalary() {
        return baseSalary;
    }

    public void setBaseSalary(Double baseSalary) {
        this.baseSalary = baseSalary;
    }

    public Departament getDepartament() {
        return departament;
    }

    public void setDepartament(Departament departament) {
        this.departament = departament;
    }

    public List<HourContract> getContracts() {
        return contracts;
    }

    @Override
    public String toString() {
        return "Worker{" + "name=" + name + ", level=" + level + ", baseSalary=" + baseSalary + '}';
    }
    
    public void addContract(HourContract contract){
        contracts.add(contract);
    }
    
    public void removeContract(HourContract contract){
        contracts.remove(contract);
    }
    
    public double income(int year, int month){
        double sum = baseSalary;
        Calendar cal = Calendar.getInstance();
        for (HourContract c : contracts){
            cal.setTime(c.getDate());
            int c_year = cal.get(Calendar.YEAR);
            int c_month = 1+ cal.get(Calendar.MONTH);
            if (c_year == year && c_month == month){
                sum += c.totalValue();
            }
        }
        return sum;
    }
}
