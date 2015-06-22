/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;
import Modelo.DAO;
import Modelo.Dto.UsuarioDto;
import Modelo.Obligacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author hammer
 */
public class UsuarioDao implements Obligacion<UsuarioDto> {
    private final DAO dao = new DAO(); 
    private Object result;
    
    @Override
    public boolean create(UsuarioDto c) {
        String[] param={c.getUsuario(),c.getContraseña(),c.getEmail(),c.getFechacreacion()};
        return dao.executeUpdate(c.sqlInsert(), param);
        
    }

    @Override
    public boolean delete(UsuarioDto c) {  
        String[] param={Integer.toString(c.getId())};
        return dao.executeUpdate(c.sqlDelete(), param);
        
    }

    @Override
    public boolean update(UsuarioDto c) {
        String[] param={c.getUsuario(),c.getContraseña(),c.getEmail(),c.getFechacreacion(),Integer.toString(c.getId())};
        return dao.executeUpdate(c.sqlUpdate(), param);
        
    }

    @Override
    public UsuarioDto read(UsuarioDto c) {
        UsuarioDto u = null;
        String[] param={Integer.toString(c.getId())};
        ResultSet result = dao.executeQuery(c.sqlRead(), param);
        try {
            while (result.next()) {
                u = new UsuarioDto(result.getInt(1), result.getString("usuario"), result.getString("contrasena"), result.getString("email"), result.getString("fechareacion"));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return u;
                
    }

    @Override
    public List<UsuarioDto> readall(UsuarioDto c) {
        ArrayList<UsuarioDto> list = new ArrayList();
        ResultSet res;
        res = dao.executeQuery(c.sqlReadall(), null);
        try {
        while(res.next()){
                list.add(new UsuarioDto(res.getInt(1), res.getString(2), res.getString(3), res.getString(4), res.getString(5)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(UsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }  
        return list;
    }
    
}
