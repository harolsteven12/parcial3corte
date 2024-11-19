/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package claseprincipa;

/**
 *
 * @author Personal
 */
public class Estudiante {
    public String nombre;
    public String edad;
    public double promedio;

    public Estudiante(String nombre, String edad, double promedio) {
        this.nombre = nombre;
        this.edad = edad;
        this.promedio = promedio;
    }

    Estudiante(String nombre, int edad, double promedio) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    public String getNombre() {
        return nombre;
    }

    public String getEdad() {
        return edad;
    }

    public double getPromedio() {
        return promedio;
    }

    @Override
    public String toString() { 
        return "ClaseEtudiante{" +
                "nombre='" + nombre + '\'' +
                ", edad='" + edad + '\'' +
                ", promedio=" + promedio +
                '}';
    
 
      
   
   
        
        
  
    }

}
 