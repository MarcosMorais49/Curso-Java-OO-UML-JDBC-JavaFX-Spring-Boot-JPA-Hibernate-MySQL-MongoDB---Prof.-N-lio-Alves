package db;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

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
    
}


/*
user=root
password=root
dburl=jdbc:mysql://localhost:3306/coursejdbc
useSSl=false
*/