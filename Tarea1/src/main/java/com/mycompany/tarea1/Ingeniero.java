/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

/**
 *
 * @author ulacit
 */
public class Ingeniero extends Persona{
    
     public String telefono;
     
    public Ingeniero(String telefono, int Cedula, String Ubicacion) {
        super(Cedula, Ubicacion);
        this.telefono = telefono;
    }  

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    @Override
    public String toString() {
        return "Dependiente{" + "telefono=" + telefono + "Cedula=" + Cedula + "Ubicacion=" + Ubicacion + '}';
    }

}
