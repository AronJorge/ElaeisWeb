/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.DAO;
import Modelo.Dto.LineaDto;
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
public class LineaDAO implements Obligacion<LineaDto>{
    private final DAO dao = new  DAO();

    @Override
    public boolean create(LineaDto c) {
        String[] param = {Integer.toString(c.getId_linea()),Integer.toString(c.getId_lote())};
        return dao.executeUpdate(c.sqlInsert(), param);
    }

    @Override
    public boolean delete(LineaDto c) {
        String[] param = {Integer.toString(c.getId_linea())};
        return dao.executeUpdate(c.sqlDelete(), param);
    }

    @Override
    public boolean update(LineaDto c) {
        String[] param = {Integer.toString(c.getId_lote()),Integer.toString(c.getId_linea())};
        return dao.executeUpdate(c.sqlUpdate(), param);
    }

    @Override
    public LineaDto read(LineaDto c) {
        LineaDto linea = null;
        ResultSet result;
        String[] param = {Integer.toString(c.getId_linea())};
        result = dao.executeQuery(c.sqlInsert(), param);
        try {
            while (result.next()) {
                linea = new LineaDto(result.getInt(1), result.getInt(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LineaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return linea;
    }

    @Override
    public List<LineaDto> readall(LineaDto c) {
        ArrayList<LineaDto> listLinea =  new ArrayList<>();
        ResultSet res;
        res = dao.executeQuery(c.sqlReadall(), null);
        try {
            while (res.next()) {
                listLinea.add(new LineaDto(res.getInt(1), res.getInt(2)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LineaDAO.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listLinea;
    }
    
}
