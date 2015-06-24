/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.DAO;
import Modelo.Dto.MaterialDto;
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
public class MaterialDao implements Obligacion<MaterialDto>{
    private  final DAO dao = new DAO();

    @Override
    public boolean create(MaterialDto c) {
        String[] para = {Integer.toString(c.getId()),c.getDescripcion()} ;
        return dao.executeUpdate(c.sqlInsert(), para);
    }

    @Override
    public boolean delete(MaterialDto c) {
        String[] param = {Integer.toString(c.getId())};
        return dao.executeUpdate(c.sqlDelete(), param);
    }

    @Override
    public boolean update(MaterialDto c) {
        String[] param = {c.getDescripcion(),Integer.toString(c.getId())};
        return dao.executeUpdate(c.sqlUpdate(), param);
    }

    @Override
    public MaterialDto read(MaterialDto c) {
        MaterialDto material = null;
        ResultSet result;
        String[] param = {Integer.toString(c.getId())};
        result = dao.executeQuery(c.sqlRead(), param);
        try {
            while (result.next()) {
                material = new MaterialDto(result.getInt(1), result.getString(2));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaterialDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return material;
    }

    @Override
    public List<MaterialDto> readall(MaterialDto c) {
         ArrayList<MaterialDto> material = new ArrayList<>();
         ResultSet res;
         res = dao.executeQuery(c.sqlReadall(), null);
        try {
            while (res.next()) {
                material.add(new MaterialDto(res.getInt(1), res.getString(2)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(MaterialDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return material;
    }
    
}
