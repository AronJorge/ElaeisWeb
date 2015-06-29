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
public class TipoUsuarioDto extends DTO{
    private int id;
    private String nombre;

    public TipoUsuarioDto() {
    }
    
    public TipoUsuarioDto(int id) {
        getTabla("tipousuario");
        getColumnaString("id");
        this.id = id;
    }

    public TipoUsuarioDto(int id, String nombre) {
        getTabla("tipousuario");
        this.id = id;
        getColumnaString("id");
        this.nombre = nombre;
        getColumnaString("nombre");
    }

    public int getId() {
        return id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }
            
}
