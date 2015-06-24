/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.DAO;
import Modelo.Dto.censoProduccionDto;
import Modelo.Obligacion;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 *
 * @author jorge private int id; private String fechahorainicio; private int
 * porcentajemuestra; private int totalmuestra; private String fechafinal;
 * private int pesoproracimo;
 */
public class censoProduccionDao implements Obligacion<censoProduccionDto> {

    private final DAO dao = new DAO();    

    @Override
    public boolean create(censoProduccionDto c) {
        String[] param = {c.getFechahorainicio(), Integer.toString(c.getPorcentajemuestra()), Integer.toString(c.getTotalmuestra()), c.getFechafinal(), Integer.toString(c.getPesoproracimo())};
        return dao.executeUpdate(c.sqlInsert(), param);
    }

    @Override
    public boolean delete(censoProduccionDto c) {
        String[] param = {Integer.toString(c.getId())};
        return dao.executeUpdate(c.sqlDelete(), param);
    }

    @Override
    public boolean update(censoProduccionDto c) {
        String[] param = {c.getFechahorainicio(), Integer.toString(c.getPorcentajemuestra()), Integer.toString(c.getTotalmuestra()), c.getFechafinal(), Integer.toString(c.getPesoproracimo()), Integer.toString(c.getId())};
        return dao.executeUpdate(c.sqlUpdate(), param);
    }

    @Override
    public censoProduccionDto read(censoProduccionDto c) {
        censoProduccionDto censo = null;
        String[] param = {Integer.toString(c.getId())};
        ResultSet result;
        result = dao.executeQuery(c.sqlReadall(), param);
        try {
            while (result.next()) {
                censo = new censoProduccionDto(result.getInt(1), result.getString(2), result.getInt(3), result.getInt(4), result.getString(5), result.getInt(6));
            }
        } catch (SQLException ex) {
            Logger.getLogger(censoProduccionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return censo;
    }

    @Override
    public List<censoProduccionDto> readall(censoProduccionDto c) {
        ArrayList<censoProduccionDto> lisCenso = new ArrayList<>();
        ResultSet res;
        res = dao.executeQuery(c.sqlReadall(), null);
        try {
            while (res.next()) {
                lisCenso.add(new censoProduccionDto(res.getInt(1), res.getString(2), res.getInt(3), res.getInt(4), res.getString(5), res.getInt(6)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(censoProduccionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return lisCenso;
    }

}
