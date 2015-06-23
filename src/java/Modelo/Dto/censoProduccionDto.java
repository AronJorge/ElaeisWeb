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
public class censoProduccionDto extends DTO{
    private int id;
    private String fechahorainicio;
    private int porcentajemuestra;
    private int totalmuestra;
    private String fechafinal;
    private int pesoproracimo;

    public censoProduccionDto(int id) {
        getTabla("censoProduccion");
        this.id = id;
    }

    public censoProduccionDto(int id, String fechahorainicio, int porcentajemuestra, int totalmuestra, String fechafinal, int pesoproracimo) {
        getTabla("censoProduccion");
        getColumnaString("id");
        this.id = id;
        getColumnaString("fechahorainicio");
        this.fechahorainicio = fechahorainicio;
        getColumnaString("porcentajemuestra");
        this.porcentajemuestra = porcentajemuestra;
        getColumnaString("totalmuestra");
        this.totalmuestra = totalmuestra;
        getColumnaString("fechafinal");
        this.fechafinal = fechafinal;
        getColumnaString("pesoproracimo");
        this.pesoproracimo = pesoproracimo;
    }

    public int getId() {
        return id;
    }

    public String getFechahorainicio() {
        return fechahorainicio;
    }

    public int getPorcentajemuestra() {
        return porcentajemuestra;
    }

    public int getTotalmuestra() {
        return totalmuestra;
    }

    public String getFechafinal() {
        return fechafinal;
    }

    public int getPesoproracimo() {
        return pesoproracimo;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setFechahorainicio(String fechahorainicio) {
        this.fechahorainicio = fechahorainicio;
    }

    public void setPorcentajemuestra(int porcentajemuestra) {
        this.porcentajemuestra = porcentajemuestra;
    }

    public void setTotalmuestra(int totalmuestra) {
        this.totalmuestra = totalmuestra;
    }

    public void setFechafinal(String fechafinal) {
        this.fechafinal = fechafinal;
    }

    public void setPesoproracimo(int pesoproracimo) {
        this.pesoproracimo = pesoproracimo;
    }
    
}
