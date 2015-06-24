/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Test;

import Modelo.Dao.TipoUsuarioDao;
import Modelo.Dao.UsuarioDao;
import Modelo.Dto.TipoUsuarioDto;
import Modelo.Dto.UsuarioDto;
import java.util.Iterator;
import java.util.List;

/**
 *
 * @author hammer
 */
public class Test {
    public static void main(String[] args) {
        UsuarioDao c= new UsuarioDao();
        
        c.read(new UsuarioDto(2));
        
        UsuarioDto d = c.read(new UsuarioDto(2));
         System.out.println(d.getId());
        
        
        
    }
    
}
