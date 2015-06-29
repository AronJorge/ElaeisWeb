/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.DAO;
import Modelo.Dto.TipoUsuarioDto;
import Modelo.Obligacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorge
 */
public class TipoUsuarioDao implements Obligacion<TipoUsuarioDto>{
    
    private final DAO dao = new DAO();

    @Override
    public boolean create(TipoUsuarioDto c) {
        Object[] para = {c.getNombre()};
        return dao.executeUpdate(c.sqlInsert(),  para);
    }

    @Override
    public boolean delete(TipoUsuarioDto c) {
        Object[] param = {c.getId()};
        return dao.executeUpdate(c.sqlDelete(), param);
    }

    @Override
    public boolean update(TipoUsuarioDto c) {
        Object[] param = {c.getNombre(),c.getId()};
        return dao.executeUpdate(c.sqlUpdate(), param);
    }

    @Override
    public TipoUsuarioDto read(TipoUsuarioDto c) {
        TipoUsuarioDto tipo = null;
        Object[] param = {c.getId()};
        ResultSet result = dao.executeQuery(c.sqlRead(), param);
        try {
            while (result.next()) {
                tipo = new TipoUsuarioDto(result.getInt(1), result.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TipoUsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return tipo;
    }

    @Override
    public List<TipoUsuarioDto> readall(TipoUsuarioDto c) {
            ArrayList<TipoUsuarioDto> list = new ArrayList<>();
            ResultSet res;
            res = dao.executeQuery(c.sqlReadall(), null);
        try {
            while (res.next()) {
                list.add(new TipoUsuarioDto(res.getInt(1), res.getString(2)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(TipoUsuarioDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return list;
    }
    
}
