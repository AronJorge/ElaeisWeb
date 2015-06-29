/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import Modelo.Conexion;
import Modelo.Obligacion;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hammer
 */
public class DAO {     
    private static final Conexion con = Conexion.saberEstado("pgsql","localhost","5432" ,"produccion", "elaeisweb", "elaeisweb");
    private static  PreparedStatement ps;
   
    
    public boolean executeUpdate(String SQL,Object[] objeto) {       
        try {    
            ps = con.getCnn().prepareStatement(SQL);
            if (objeto != null) {
                for (int i = 0 , j=1; i < objeto.length; i++,j++) {             
                    ps.setObject(j, objeto[i]);                    
                }                    
            }
            if (ps.executeUpdate() > 0) {
                return true;
            }
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        } finally{
            con.cerrarConexion();
        }        
        return false;       
    }
    
    public ResultSet executeQuery(String SQL,Object[] objeto){
        ResultSet res = null;
        try {
            ps=con.getCnn().prepareStatement(SQL);
             if (objeto!=null) {
                for (int i = 0 , j=1; i < objeto.length; i++,j++) {             
                    ps.setObject(j, objeto[i]);                    
                }                    
            }
            res = ps.executeQuery();        
            
        } catch (SQLException ex) {
            Logger.getLogger(DAO.class.getName()).log(Level.SEVERE, null, ex);
        }finally{
            con.cerrarConexion();
        }
         return res;
    }
}
