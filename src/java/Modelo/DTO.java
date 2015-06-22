/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author hammer
 */
public class DTO {
   private String campos;
   private String tabla;
   private int ncampos;
   
    public void getTabla(String tabla){
        this.tabla=tabla;
    }
    public void getColumnaString(String cam){
        campos+=cam+",";
        ncampos=ncampos+1;
    }
   
    private String setCamposString(String sql){
        sql=sql+this.campos.substring(4,this.campos.length()-1);
        return sql;
    }
    private String setValorString(String sql){
        for (int i = 0; i < ncampos; i++) {
            sql+="?,";
        }
        return sql.substring(0,sql.length()-1);
    }
    
    public String sqlInsert(){
        String sql ="Insert into "+this.tabla+"(";
        sql= setCamposString(sql).replace("id,", "")+") values (";
        sql = setValorString(sql)+")";        
        return sql;
    }
    
    public String sqlDelete(){
        return "DELETE FROM "+this.tabla+" UPDATE id=?";
    }
    
    public String sqlUpdate(){
        String sql ="UPDATE "+this.tabla+" SET ";
        sql =setCamposString(sql).replace("id,", "");
        sql=sql.replace(",", "=?,")+"=? WHERE id=?";                    
        return sql;
    }
    public String sqlRead(){
        return"SELECT * FROM "+this.tabla+" WHERE id=?";
    }
    public String sqlReadall(){
        return"SELECT * FROM "+this.tabla;
    }
}
