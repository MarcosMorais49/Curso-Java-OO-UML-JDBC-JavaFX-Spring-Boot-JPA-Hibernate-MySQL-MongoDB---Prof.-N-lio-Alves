package application;

import antities.Funcionario;
import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.InputMismatchException;
import java.util.List;

public class PrjCursoJavaSec18Aula235Ex01 {

    public static void main(String[] args) {
        
        List<Funcionario> list = new ArrayList<>();
        
        String path = "C:\\Users\\Marcinha\\Documents\\in.csv";

        
        try (BufferedReader br = new BufferedReader(new FileReader(path))){
            String aux = br.readLine();
            while (aux != null){
                String[] fields = aux.split(",");
                String name = fields[0];
                double value = Double.parseDouble(fields[1]);
                
                Funcionario funcionario = new Funcionario(name, value);
                list.add(funcionario);
     
                aux = br.readLine();
            }
        }
        catch (IOException e){
            System.out.println("Error : "+e.getMessage());
        }
        Collections.sort(list);
        for (Funcionario f : list){
            System.out.println(f.getName() + ", " + f.getSalary());
        }
    }
}
