/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dto;

import Modelo.DTO;


/**
 * 
 * @author hammer
 */

public class UsuarioDto extends DTO{   
    private int id;
    private String usuario;
    private String contraseña;
    private String email;
    private String fechacreacion;

    public UsuarioDto(int id) {
        getTabla("usuario");
        this.id = id;
    }

    public UsuarioDto(int id, String usuario, String contraseña, String email, String fechacreacion) {
        getTabla("usuario");
        this.id = id;
        getColumnaString("usuario");
        this.usuario = usuario;
        getColumnaString("contrasena");
        this.contraseña = contraseña;
        getColumnaString("email");
        this.email = email;
        getColumnaString("fechacreacion");
        this.fechacreacion = fechacreacion;
        
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getUsuario() {
        return usuario;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getFechacreacion() {
        return fechacreacion;
    }

    public void setFechacreacion(String fechacreacion) {
        this.fechacreacion = fechacreacion;
    }
    
}
