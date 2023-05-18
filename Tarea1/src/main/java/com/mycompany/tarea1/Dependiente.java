/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

/**
 *
 * @author ulacit
 */
public class Dependiente extends Persona {
    
   public String descripcionPuesto;

    public Dependiente(String descripcionPuesto, int Cedula, String Ubicacion) {
        super(Cedula, Ubicacion);
        this.descripcionPuesto = descripcionPuesto;
    }  

    public String getDescripcionPuesto() {
        return descripcionPuesto;
    }

    public void setDescripcionPuesto(String descripcionPuesto) {
        this.descripcionPuesto = descripcionPuesto;
    }

    @Override
    public String toString() {
        return "Dependiente{" + " descripcionPuesto=" + descripcionPuesto + " Cedula=" + Cedula + " Ubicacion=" + Ubicacion +'}';
    }
   
}
