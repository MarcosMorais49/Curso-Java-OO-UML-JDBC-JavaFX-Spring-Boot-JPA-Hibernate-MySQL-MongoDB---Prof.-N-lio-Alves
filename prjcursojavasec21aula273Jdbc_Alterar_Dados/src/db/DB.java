package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.Statement;
import java.sql.ResultSet;
import java.util.logging.Level;
import java.util.logging.Logger;

public class DB {
    
    private static Connection conn = null;
    
    private static final String url = "jdbc:mysql://localhost:3306/coursejdbc";
    private static final String user = "root";
    private static final String pass = "root";
    
    public static Connection getConnection(){
        try {
            if (conn == null){
                conn = DriverManager.getConnection(url, user, pass);
            }
            System.out.println(conn);
            return conn;
        }
        catch(SQLException e){
            throw new DBException(e.getMessage());
        }
    }
    
    public static void closeConnection(){
        try{
            if (conn != null){
                conn.close();
            }
        }
        catch (SQLException e){
            throw new DBException(e.getMessage());
        }
    }
    
    public static void closeStatement(Statement st){
        if (st != null){
            try {
                st.close();
            } catch (SQLException e) {
                throw new DBException(e.getMessage());
            }
        }
        
    }
    
    public static void closeResultSet(ResultSet rs){
        if (rs != null){
            try {
                rs.close();
            } catch (SQLException e) {
                throw new DBException(e.getMessage());
            }
        }
        
    }
}


/*
user=root
password=root
dburl=jdbc:mysql://localhost:3306/coursejdbc
useSSl=false
*/