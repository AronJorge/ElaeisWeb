/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dto;

import Modelo.DTO;

/**
 *
 * @author jorge
 */
public class TrabajadorDto extends DTO{
    private int id ;
    private String nombre ;
    private String apellidos ;
    private int usuario_id ;
    private String direccion ;
    private String telefono;
    private String celular ;
    private String email ;

    public TrabajadorDto() {
    }

    public TrabajadorDto(int id) {
        getTabla("trabajador");
        this.id = id;
    }
    

    public TrabajadorDto(int id, String nombre, String apellidos, int usuario_id, String direccion, String telefono, String celular, String email) {
        getTabla("trabajador");
        getColumnaString("id");
        this.id = id;
        getColumnaString("nombre");
        this.nombre = nombre;
        getColumnaString("apellidos");
        this.apellidos = apellidos;
        getColumnaString("usuario_id");
        this.usuario_id = usuario_id;
        getColumnaString("direccion");
        this.direccion = direccion;
        getColumnaString("telefono");
        this.telefono = telefono;
        getColumnaString("celular");
        this.celular = celular;
        getColumnaString("email");
        this.email = email;
    }   

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public String getApellidos() {
        return apellidos;
    }

    public int getUsuario_id() {
        return usuario_id;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getCelular() {
        return celular;
    }

    public String getEmail() {
        return email;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setApellidos(String apellidos) {
        this.apellidos = apellidos;
    }

    public void setUsuario_id(int usuario_id) {
        this.usuario_id = usuario_id;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setCelular(String celular) {
        this.celular = celular;
    }

    public void setEmail(String email) {
        this.email = email;
    }
    
}
