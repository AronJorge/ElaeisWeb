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
import java.util.List;

/**
 *
 * @author hammer
 */
public class Test {

    public static void main(String[] args) {
//        UsuarioDao c = new UsuarioDao();
//        int p = 0;
//        TipoUsuarioDao t = new TipoUsuarioDao();
////        t.create(new TipoUsuarioDto(p, null));
////        t.delete(new TipoUsuarioDto(8,"jot"));
////        t.update(new TipoUsuarioDto(1,"2"));
//        t.read(new TipoUsuarioDto(2));
////
//        List<TipoUsuarioDto> listipo = t.readall(new TipoUsuarioDto(0, null));
//        for (TipoUsuarioDto listipo1 : listipo) {
//            System.out.println(listipo1.getId() + " " + listipo1.getNombre());
//        }

//        c.read(new UsuarioDto(2));
//        c.update(new UsuarioDto(1, "smit", "mia", 1));
//        UsuarioDto d = c.read(new UsuarioDto(1));        
//         System.out.println(d.getContraseña()+" "+d.getUsuario()+" "+d.getId());
//         List<UsuarioDto> lis = c.readall(new UsuarioDto(0, null, null, 0));
//        for (UsuarioDto li : lis) {
//            System.out.println("\n"+li.getId()+" "+li.getUsuario()+" "+li.getContraseña()+" "
//                    + ""+li.getTipousuario_id());
//        }
    TipoUsuarioDao tu= new TipoUsuarioDao();
    TipoUsuarioDto datos = tu.read(new TipoUsuarioDto(8, "administadores"));
        System.out.println(datos.getId()+"--"+datos.getNombre());
    TipoUsuarioDto dto =  new TipoUsuarioDto(0, "hola");
        //System.out.println(dto.sqlDelete());
    }

}
