    /*
    * To change this license header, choose License Headers in Project Properties.
    * To change this template file, choose Tools | Templates
    * and open the template in the editor.
    */
    package Modelo;

import java.io.BufferedReader;
import java.io.File;
import java.io.InputStreamReader;
    import java.sql.Connection;
    import java.sql.DriverManager;
    import java.sql.SQLException;
    import java.util.logging.Level;
    import java.util.logging.Logger;
import javax.swing.JOptionPane;

/**
*
* @author hammer
*/
public final class Conexion {
    //private static String[] datosConfig = {"localhost","3306","elaeisweb", "root", "root"};//dase_datos, usuaro, contraseña 
    private static String[] datosConfig;
    private static String driver;
    public static Conexion instance;
    private Connection cnn;
    
    
    public void ejecutar(String archivo){
        File fichero = new File(archivo);
        archivo = fichero.getAbsolutePath();
        try {
            String comando;
            Process proceso = Runtime.getRuntime().exec(archivo);
            BufferedReader lector = new BufferedReader (new InputStreamReader (proceso.getInputStream()));
            while ((comando = lector.readLine()) != null) {
                System.out.println(comando);
            }
                lector.close();
            }catch (Exception err) {
                err.printStackTrace();
            }
    }
    
    private Conexion(){
       
        String[] driver = driver();
        try {
            Class.forName(driver[0]);
            cnn = DriverManager.getConnection(driver[1]+this.datosConfig[1]+":"+this.datosConfig[2]+"/"+this.datosConfig[3],this.datosConfig[4],this.datosConfig[5]);
             
        } catch (ClassNotFoundException | SQLException ex) {
            if (ex.getLocalizedMessage().indexOf("Unknown")!= -1) {
               ejecutar("test.bat");
                JOptionPane.showMessageDialog(null,"base de datos creada reinicia la aplicacion");
            }else{
            Logger.getLogger(Conexion.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    protected String[] driver(){
        String[] config = null;
        if("pgsql".equals(driver)){
            config = new String[]{"org.postgresql.Driver","jdbc:postgresql://"};            
        }
        if("mysql".equals(driver)){
            config = new String[]{"com.mysql.jdbc.Driver","jdbc:mysql://"};
        }              
      return config;  
    }
    
    public synchronized static Conexion saberEstado(String driver,String host,String puerto,String basedatos,String usuario,String contrasena){
            Conexion.driver =driver;
            String[] Datosp = {driver,host,puerto,basedatos, usuario, contrasena};
            Conexion.datosConfig=Datosp;
        if ( instance == null){
            instance = new Conexion();
        }   
        return instance;
    }

    public Connection getCnn() {
        return cnn;        
    }

    public void cerrarConexion(){
        Conexion.instance = null;
        Conexion.driver = null;
        Conexion.datosConfig = null;
    }
    
    
}
