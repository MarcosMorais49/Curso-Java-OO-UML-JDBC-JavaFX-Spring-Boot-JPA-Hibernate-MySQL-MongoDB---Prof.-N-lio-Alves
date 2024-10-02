package application;

import db.DB;
import db.DBException;
import db.DbIntegrityException;
import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.logging.Level;
import java.util.logging.Logger;

public class Prjcursojavasec21aula269Jdbc {
    
    public static void main(String[] args) {
        
        Connection conn = null;
        Statement st = null;
        try {
            conn = DB.getConnection();
            
            conn.setAutoCommit(false);
            
            st = conn.createStatement();
            
            int rows1 = st.executeUpdate("UPDATE seller SET BaseSalary = 2090 WHERE departmentId = 1;");
            
            /*int x = 1;
            if (x < 2){
                throw  new SQLException("Fake Error");
            }*/
            
            int rows2 = st.executeUpdate("UPDATE seller SET BaseSalary = 3090 WHERE departmentId = 2;");
            
            conn.commit();
            
            System.out.println("Rows1 = "+rows1);
            System.out.println("Rows2 = "+rows2);
        }
        catch (SQLException e){
            try {
                conn.rollback();
                throw new DBException("Transaction rolled back! Caused by: " + e.getMessage()  );
            } catch (SQLException e1) {
                throw new DBException("Error trying rollback! Caused by: "+ e1.getMessage());
            }
        }
        finally {
            DB.closeStatement(st);
            DB.closeConnection();
        }
        
    }  
}
