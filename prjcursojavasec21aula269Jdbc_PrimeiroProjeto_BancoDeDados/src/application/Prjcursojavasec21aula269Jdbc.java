package application;

import db.DB;
import java.sql.Connection;

public class Prjcursojavasec21aula269Jdbc {

    public static void main(String[] args) {
        
        Connection conn = DB.getConnection();
        
        DB.closeConnection();   
        
    }
    
}
