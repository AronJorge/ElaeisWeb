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
public class DetalleCensoProduccionDto extends DTO{
    private int id ;
    private int censoProduccion_id ;
    private int Ninflorecenciasfemeninas;
    private int Nracimos;
    private int palma_id ;
    private int trabajador_id ;
    private int trabajador_usuario_id ;

    public DetalleCensoProduccionDto() {
    }

    public DetalleCensoProduccionDto(int id) {
        getTabla("DetalleCensoProduccionDto");
        this.id = id;
    }

    public DetalleCensoProduccionDto(int id, int censoProduccion_id, int Ninflorecenciasfemeninas, int Nracimos, int palma_id, int trabajador_id, int trabajador_usuario_id) {
        getTabla("DetalleCensoProduccionDto");
        getColumnaString("id");
        this.id = id;
        getColumnaString("censoProduccion_id");
        this.censoProduccion_id = censoProduccion_id;
        getColumnaString("Ninflorecenciasfemeninas");
        this.Ninflorecenciasfemeninas = Ninflorecenciasfemeninas;
        getColumnaString("Nracimos");
        this.Nracimos = Nracimos;
        getColumnaString("palma_id");
        this.palma_id = palma_id;
        getColumnaString("trabajador_id");
        this.trabajador_id = trabajador_id;
        getColumnaString("trabajador_usuario_id");
        this.trabajador_usuario_id = trabajador_usuario_id;
    }

    public int getId() {
        return id;
    }

    public int getCensoProduccion_id() {
        return censoProduccion_id;
    }

    public int getNinflorecenciasfemeninas() {
        return Ninflorecenciasfemeninas;
    }

    public int getNracimos() {
        return Nracimos;
    }

    public int getPalma_id() {
        return palma_id;
    }

    public int getTrabajador_id() {
        return trabajador_id;
    }

    public int getTrabajador_usuario_id() {
        return trabajador_usuario_id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setCensoProduccion_id(int censoProduccion_id) {
        this.censoProduccion_id = censoProduccion_id;
    }

    public void setNinflorecenciasfemeninas(int Ninflorecenciasfemeninas) {
        this.Ninflorecenciasfemeninas = Ninflorecenciasfemeninas;
    }

    public void setNracimos(int Nracimos) {
        this.Nracimos = Nracimos;
    }

    public void setPalma_id(int palma_id) {
        this.palma_id = palma_id;
    }

    public void setTrabajador_id(int trabajador_id) {
        this.trabajador_id = trabajador_id;
    }

    public void setTrabajador_usuario_id(int trabajador_usuario_id) {
        this.trabajador_usuario_id = trabajador_usuario_id;
    }
    
    
}
