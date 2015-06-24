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
public class LineaDto extends DTO{
    private int id_linea;
    private int id_lote;

    public LineaDto() {
    }

    public LineaDto(int id_linea) {
        getTabla("linea");
        this.id_linea = id_linea;
    }    

    public LineaDto(int id_linea, int id_lote) {
        getTabla("linea");
        getColumnaString("id_linea");
        this.id_linea = id_linea;
        getColumnaString("id_lote");
        this.id_lote = id_lote;
    }

    public int getId_linea() {
        return id_linea;
    }

    public int getId_lote() {
        return id_lote;
    }

    public void setId_linea(int id_linea) {
        this.id_linea = id_linea;
    }

    public void setId_lote(int id_lote) {
        this.id_lote = id_lote;
    }
    
}
