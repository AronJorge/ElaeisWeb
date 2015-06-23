/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.DAO;
import Modelo.Dto.LoteDto;
import Modelo.Obligacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorge private int id; private int id_finca; private String
 * fecha_siembra; private String Descripcion; private int area;
 *
 */
public class LoteDao implements Obligacion<LoteDto> {

    private final DAO dao = new DAO();
    private Object result;

    @Override
    public boolean create(LoteDto c) {
        String[] param = {Integer.toString(c.getId_finca()), c.getFecha_siembra(), c.getDescripcion(), Integer.toString(c.getArea())};
        return dao.executeUpdate(c.sqlInsert(), param);
    }

    @Override
    public boolean delete(LoteDto c) {
        String[] param = {Integer.toString(c.getId())};
        return dao.executeUpdate(c.sqlDelete(), param);
    }

    @Override
    public boolean update(LoteDto c) {
        String[] param = {Integer.toString(c.getId_finca()), c.getFecha_siembra(), c.getDescripcion(), Integer.toString(c.getArea()), Integer.toString(c.getId())};
        return dao.executeUpdate(c.sqlUpdate(), param);
    }

    @Override
    public LoteDto read(LoteDto c) {
        LoteDto lote = null;
        ResultSet result;
        String[] param = {Integer.toString(c.getId())};
        result = dao.executeQuery(c.sqlRead(), param);
        try {
            while (result.next()) {
                lote = new LoteDto(result.getInt(1), result.getInt(2), result.getString(3), result.getString(4), result.getInt(5));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lote;
    }

    @Override
    public List<LoteDto> readall(LoteDto c) {
        ArrayList<LoteDto> listLote = new ArrayList<>();
        ResultSet res;
        res = dao.executeQuery(c.sqlReadall(), null);
        try {
            while (res.next()) {
                listLote.add(new LoteDto(res.getInt(1), res.getInt(2), res.getString(3), res.getString(4), res.getInt(5)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(LoteDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listLote;
    }

}
