/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.siatemaacademico0.personalacademico;

import ec.edu.ec.siatemaacademico0.empleados.Empleado;

/**
 *
 * @author HP
 */
public class PersonalAcademico extends Empleado {

    public PersonalAcademico(double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
    }

    
    // public abstract boolean verificarCedula(); 
    
    @Override
    public String toString() {
        return "personalAcademico{" + super.toString()+'}';
    }
    
    
    
}
