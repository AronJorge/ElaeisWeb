/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.DAO;
import Modelo.Dto.DetalleCensoProduccionDto;
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
public class DetalleCensoProduccionDao implements Obligacion<DetalleCensoProduccionDto> {

    private final DAO dao = new DAO();

    @Override
    public boolean create(DetalleCensoProduccionDto c) {
        String[] param = {Integer.toString(c.getCensoProduccion_id()), Integer.toString(c.getNinflorecenciasfemeninas()),
            Integer.toString(c.getNracimos()), Integer.toString(c.getPalma_id()), Integer.toString(c.getTrabajador_id()), Integer.toString(c.getTrabajador_usuario_id())};
        return dao.executeUpdate(c.sqlInsert(), param);
    }

    @Override
    public boolean delete(DetalleCensoProduccionDto c) {
        String[] param = {Integer.toString(c.getId())};
        return dao.executeUpdate(c.sqlDelete(), param);
    }

    @Override
    public boolean update(DetalleCensoProduccionDto c) {
        String[] param = {Integer.toString(c.getCensoProduccion_id()), Integer.toString(c.getNinflorecenciasfemeninas()),
            Integer.toString(c.getNracimos()), Integer.toString(c.getPalma_id()), Integer.toString(c.getTrabajador_id()), Integer.toString(c.getTrabajador_usuario_id()),Integer.toString(c.getId())};
        return dao.executeUpdate(c.sqlUpdate(), param);
    }

    @Override
    public DetalleCensoProduccionDto read(DetalleCensoProduccionDto c) {
        DetalleCensoProduccionDto detalle= null;
         String[] param = {Integer.toHexString(c.getId())};
         ResultSet result = dao.executeQuery(c.sqlRead(), param);
        try {
            while (result.next()) {
                detalle = new DetalleCensoProduccionDto(result.getInt(1), result.getInt(2), result.getInt(3), result.getInt(4), result.getInt(5), result.getInt(6), result.getInt(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetalleCensoProduccionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return detalle;
    }

    @Override
    public List<DetalleCensoProduccionDto> readall(DetalleCensoProduccionDto c) {
        ArrayList<DetalleCensoProduccionDto> listDeatalle = new ArrayList<>();
        ResultSet res;
        res = dao.executeQuery(c.sqlReadall(), null);
        try {
            while (res.next()) {
                listDeatalle.add(new DetalleCensoProduccionDto(res.getInt(1), res.getInt(2), res.getInt(3), res.getInt(4), res.getInt(5), res.getInt(6), res.getInt(7)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(DetalleCensoProduccionDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listDeatalle;
    }
}
