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
public class MaterialDto extends DTO {
    private int id;
    private String descripcion;

    public MaterialDto(int id) {
        getTabla("material");
        this.id = id;
    }

    public MaterialDto(int id, String descripcion) {
        getTabla("material");
        getColumnaString("id");
        this.id = id;
        getColumnaString("descripcion");
        this.descripcion = descripcion;
    }

    public int getId() {
        return id;
    }

    public String getDescripcion() {
        return descripcion;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setDescripcion(String descripcion) {
        this.descripcion = descripcion;
    }
    
}
