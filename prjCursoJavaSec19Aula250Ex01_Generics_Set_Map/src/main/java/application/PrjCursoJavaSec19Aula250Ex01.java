package application;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.TreeMap;

public class PrjCursoJavaSec19Aula250Ex01 {

    public static void main(String[] args) {
        
        String path = "C:\\Users\\Marcinha\\Documents\\in.txt";
        
        Map<String, Integer> votos  = new LinkedHashMap<>();
        
        try(BufferedReader br = new BufferedReader(new FileReader(path))){
            
            String line = br.readLine();
            
            while(line != null){
                String[] fields = line.split(",");
                String name = fields[0];
                int count = Integer.parseInt(fields[1]);
                
                if (votos.containsKey(name)){
                    int votesSoFar = votos.get(name);
                    votos.replace(name, count + votesSoFar);
                }
                else {
                    votos.put(name, count);
                }
                line = br.readLine();
            }
            
            for (String key : votos.keySet()){
                System.out.println(key + ": " + votos.get(key));
            }
        }
        catch (Exception e ){
            System.out.println("Error: "+e.getMessage());
        }
       
                
    }
}
