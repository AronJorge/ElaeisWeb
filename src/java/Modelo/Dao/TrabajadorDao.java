/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.DAO;
import Modelo.Dto.TrabajadorDto;
import Modelo.Obligacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * 
 * @author jorge
 */
public class TrabajadorDao implements Obligacion<TrabajadorDto>{
    private final DAO dao = new DAO(); 
    private Object result;

    @Override
    public boolean create(TrabajadorDto c) {
        String[] param = {c.getNombre(), c.getApellidos(),Integer.toString(c.getUsuario_id()),c.getDireccion(),c.getTelefono(),c.getCelular(),c.getEmail()};
        return dao.executeUpdate(c.sqlInsert(), param);
    }

    @Override
    public boolean delete(TrabajadorDto c) {
        String[] param = {Integer.toString(c.getId())};
        return dao.executeUpdate(c.sqlDelete(), param);
    }
    

    @Override
    public boolean update(TrabajadorDto c) {
        String[] param ={c.getNombre(), c.getApellidos(),Integer.toString(c.getUsuario_id()),c.getDireccion(),c.getTelefono(),c.getCelular(),c.getEmail(),Integer.toString(c.getId())};
        return dao.executeUpdate(c.sqlUpdate(), param);
    }  

    @Override
    public TrabajadorDto read(TrabajadorDto c) {
        TrabajadorDto traba = null;
        String[] param = {Integer.toString(c.getId())};
        ResultSet res;
        res = dao.executeQuery(c.sqlRead(), param);
        try {
            while (res.next()) {
                traba = new TrabajadorDto(res.getInt(1), res.getString(2), res.getString(3), res.getInt(4), res.getString(5), res.getString(6), res.getString(7), res.getString(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TrabajadorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return traba;
    }

    @Override
    public List<TrabajadorDto> readall(TrabajadorDto c) {
        ArrayList<TrabajadorDto> listraba = new ArrayList<>();
        ResultSet res;
        res = dao.executeQuery(c.sqlReadall(), null);
        try {
            while (res.next()) {
                listraba.add(new TrabajadorDto(res.getInt(1), res.getString(2), res.getString(3), res.getInt(4), res.getString(5), res.getString(6), res.getString(7), res.getString(7)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TrabajadorDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listraba;
    }

       
}
