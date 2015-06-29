/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

import java.util.List;

/**
 *
 * @author hammer
 tipos de datos enericos
 * @param <DTO>*/
public interface Obligacion <DTO>{
    public boolean create(DTO c);
    public boolean delete(DTO c);
    public boolean update(DTO c);
    
    public DTO read(DTO c);
    public List<DTO> readall(DTO c);
    
    
    
    
}
