/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package clase1;

//VARIABLES

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;

/**
 *
 * @author ACV2
 */
public class conexion { 
   
    Connection con;
  
    String user="root";
    String password="";
    String driver="com.mysql.cj.jdbc.Driver";
    String url="jdbc:mysql://localhost:3306/prueba";
    
public conexion ()
    {
        try {
            Class.forName(driver);
            con = DriverManager.getConnection(url,user,password);
            System.out.println("conexion exitosa");
            
            
        } catch (SQLException | ClassNotFoundException e) { 
            System.out.println("fallo de conexion, error: "+e.getMessage());
            
            
        }
    }
    
}
