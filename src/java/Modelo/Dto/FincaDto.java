/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo.Dto;

import Modelo.DTO;

/**
 *
 * @author jorge
 */
public class FincaDto extends DTO{
    private int id;
    private String Nic;
    private String nombre;
    private String direccion;
    private String telefono;
    private String email;
    private boolean regustofedepalma;

    public FincaDto() {
    }

    public FincaDto(int id) {
        getTabla("finca");
        this.id = id;
    }

    public FincaDto(int id, String Nic, String nombre, String direccion, String telefono, String email, boolean regustofedepalma) {
        getTabla("finca");
        getColumnaString("id");
        this.id = id;
        getColumnaString("Nic");
        this.Nic = Nic;
        getColumnaString("nombre");
        this.nombre = nombre;
        getColumnaString("direccion");
        this.direccion = direccion;
        getColumnaString("telefono");
        this.telefono = telefono;
        getColumnaString("email");
        this.email = email;
        getColumnaString("regustofedepalma");
        this.regustofedepalma = regustofedepalma;
    }

    public int getId() {
        return id;
    }

    public String getNic() {
        return Nic;
    }

    public String getNombre() {
        return nombre;
    }

    public String getDireccion() {
        return direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public String getEmail() {
        return email;
    }

    public int isRegustofedepalma() {
        if (regustofedepalma) {
            return 1;
        }else{
            return 0;
        }       
    }

    public void setId(int id) {
        this.id = id;
    }

    public void setNic(String Nic) {
        this.Nic = Nic;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setRegustofedepalma(boolean regustofedepalma) {
        this.regustofedepalma = regustofedepalma;
    }
        
}
