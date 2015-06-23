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
public class LoteDto extends DTO{
    private int id;
    private int id_finca;
    private String fecha_siembra;
    private String Descripcion;
    private int area;

    public LoteDto(int id) {
        getTabla("lote");
        this.id = id;
    }

    public LoteDto(int id, int id_finca, String fecha_siembra, String Descripcion, int area) {
        getTabla("lote");
        getColumnaString("id");
        this.id = id;
        getColumnaString("id_finca");
        this.id_finca = id_finca;
        getColumnaString("fecha_siembra");
        this.fecha_siembra = fecha_siembra;
        getColumnaString("Descripcion");
        this.Descripcion = Descripcion;
        getColumnaString("area");
        this.area = area;
    }

    public int getId() {
        return id;
    }

    public int getId_finca() {
        return id_finca;
    }

    public String getFecha_siembra() {
        return fecha_siembra;
    }

    public String getDescripcion() {
        return Descripcion;
    }

    public int getArea() {
        return area;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setId_finca(int id_finca) {
        this.id_finca = id_finca;
    }

    public void setFecha_siembra(String fecha_siembra) {
        this.fecha_siembra = fecha_siembra;
    }

    public void setDescripcion(String Descripcion) {
        this.Descripcion = Descripcion;
    }

    public void setArea(int area) {
        this.area = area;
    }
    
}
