/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package projetannuel;





import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;
import java.util.ArrayList;
import java.util.List;

public class ConnexionBDD {
    
     String filename= null;
    public static String path;
     Connection conn=null;
       
    public static Connection Conexion(){
       try {
    	 //Chargement du pilote JDBC pour MYSQL puis creation de la connection
    	   //DriverManager.registerDriver(new com.mysql.jdbc.Driver());
    	// ou bien 
          Class.forName("com.mysql.cj.jdbc.Driver");
       Connection conn = DriverManager.getConnection("jdbc:mysql://mysql-simarone.alwaysdata.net/simarone_pa", "simarone", "langagecwane2016.");
				if (conn!=null)
	System.out.println("Connexion Ã  la base de donnÃ©es a Ã©tÃ© Ã©tablie avec succÃ¨s");
				 else 
				System.out.println("ProblÃ¨me de connexion Ã  la base");
						
       return conn;
       
       }catch(Exception e) {
           System.out.println("--> SQLException : " + e) ;
           
       return null;
       }
    }
    
    
    
    
    
    
    
    
    
}

    
    
