/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.siatemaacademico0.empleados;

/**
 *
 * @author HP
 */
public  class Empleado extends PersonaInstitucional{
    
    //Atributos
    private double sueldo;

    //Constructor
    public Empleado(double sueldo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(correoInstitucional, nombre, id, correo, cedula);
        this.sueldo = sueldo;
    }

    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }
    
    // public abstract boolean verificarCedula ();

    @Override
    public String toString() {
        return "Empleado{" + "sueldo=" + sueldo + '}';
    }
   
    
    
    
}
