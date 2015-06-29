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
    private int tipousuario_id;

    public UsuarioDto(int id) {
        getTabla("usuario");
        this.id = id;
    }

    public UsuarioDto(int id, String usuario, String contraseña, int tipousuario_id) {
        getTabla("usuario");
        this.id = id;
        getColumnaString("usuario");
        this.usuario = usuario;
        getColumnaString("contrasena");
        this.contraseña = contraseña;
        getColumnaString("tipousuario_id");
        this.tipousuario_id = tipousuario_id;
        
    }

    public int getId() {
        return id;
    }

    public String getUsuario() {
        return usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public int getTipousuario_id() {
        return tipousuario_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setUsuario(String usuario) {
        this.usuario = usuario;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public void setTipousuario_id(int tipousuario_id) {
        this.tipousuario_id = tipousuario_id;
    }
    
}
