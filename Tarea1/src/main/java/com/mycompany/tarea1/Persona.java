/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.tarea1;

/**
 *
 * @author ulacit
 */
public class Persona {
    
        public int Cedula;
        public String Ubicacion;
        
    
    public String getUbicacion() {
        return Ubicacion;
    }

    public void setUbicacion(String Ubicacion) {
        this.Ubicacion = Ubicacion;
    }

    public int getCedula() {
        return Cedula;
    }

    public void setCedula(int Cedula) {
        this.Cedula = Cedula;
    }
    
    public Persona(int Cedula, String Ubicacion) {
        this.Cedula = Cedula;
        this.Ubicacion = Ubicacion;
    }
               
}
