/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

package proyecto01;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.SQLException;
import java.sql.*;


/**
 * 
 * @author Sammy Guergachi <sguergachi at gmail.com>
 */
public class conexion {
    
       
    //String de conexión para añadir la URL o la ruta donde se encuentra la BD
    String strConexionBD="jdbc:sqlite:C:\\Users\\scm93\\OneDrive\\Documentos\\NetBeansProjects\\Proyecto01\\Resources\\librarybd.s3db";
    
    Connection conn=null;
    
    //Constructor para conectarse a la BD
    public conexion(){
    
        try {
            Class.forName("org.sqlite.JDBC");
            
            //Para manipular la conexión se usará el objeto conn. Con la siguiente línea, le indicamos donde está la bd
            conn= DriverManager.getConnection(strConexionBD);
            System.out.println("Conexión establecida");
        } catch (Exception e) {
            System.out.println("Ha habido un error de conexión: "+e);
        }
    
}
    public int ejecutarSentenciaSQL(String sentenciaSQL){
        
        
        try {
            /*
            El PreparedStatement nos permite ejecutar sentencias sql.
            */
            PreparedStatement pstm=conn.prepareStatement(sentenciaSQL);
            pstm.execute();
            return 1;
            
        } catch (SQLException e) {
            
            System.out.println("Error de conexión: "+ e);
            return 0;
        }
        
    
}
    public ResultSet consultarRegistros(String sentenciaSQL){
        try {
            PreparedStatement pstm=conn.prepareStatement(sentenciaSQL);
            ResultSet respuesta = pstm.executeQuery();
            return respuesta;
            
            
        } catch (Exception e) {
            
            System.out.println(e);
            return null;
        }
        
    }
}
