/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dao;

import Modelo.DAO;
import Modelo.Dto.FincaDto;
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
 *  private int id;
    private String Nic;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private boolean regustofedepalma;
 */
public class FincaDao implements Obligacion<FincaDto>{
    private final DAO dao = new DAO();
    private Object result;

    @Override
    public boolean create(FincaDto c) {
        String[] param = {c.getNic(),c.getNombre(),c.getDireccion(),c.getTelefono(),c.getEmail(),/*Integer.toString(c.isRegustofedepalma())*/};
        return dao.executeUpdate(c.sqlInsert(), param);
    }

    @Override
    public boolean delete(FincaDto c) {
        String[] param = {Integer.toString(c.getId())};
        return dao.executeUpdate(c.sqlDelete(), param);
    }

    @Override
    public boolean update(FincaDto c) {
        String[] param = {c.getNic(),c.getNombre(),c.getDireccion(),c.getTelefono(),c.getEmail(),/*Integer.toString(c.isRegustofedepalma()),*/Integer.toString(c.getId())};    
        return  dao.executeUpdate(c.sqlUpdate(), param);
    }

    @Override
    public FincaDto read(FincaDto c) {
        FincaDto finca = null;
        ResultSet result;
        String[] param = {Integer.toString(c.getId())};
        result = dao.executeQuery(c.sqlRead(), param);
        try {
            while (result.next()) {
                finca = new FincaDto(result.getInt(1),result.getString(2),result.getString(3),result.getString(4),result.getString(5),result.getString(6),result.getBoolean(7));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FincaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return finca;
    }

    @Override
    public List<FincaDto> readall(FincaDto c) {
        ArrayList<FincaDto> listFinca = new ArrayList<>();
        ResultSet res;
        res = dao.executeQuery(c.sqlReadall(), null);
        try {
            while (res.next()) {
                listFinca.add(new FincaDto(res.getInt(1),res.getString(2),res.getString(3),res.getString(4),res.getString(5),res.getString(6),res.getBoolean(7)));
            }
        } catch (SQLException ex) {
            Logger.getLogger(FincaDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        return listFinca;
    }
    
}
