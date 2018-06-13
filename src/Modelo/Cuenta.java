/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Modelo;

/**
 *
 * @author kelly
 */
public abstract class Cuenta {
    public String cedula;
    public String nombre;
    public int numeroDecuenta;

    public Cuenta() {
    }

    public String getCedula() {
        return cedula;
    }

    public void setCedula(String cedula) {
        this.cedula = cedula;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getNumeroDecuenta() {
        return numeroDecuenta;
    }

    public void setNumeroDecuenta(int numeroDecuenta) {
        this.numeroDecuenta = numeroDecuenta;
    }
    
    String crearCuenta(){
        return getClass().getName();
        
    }
    void deposito();
    void retiro();
}
