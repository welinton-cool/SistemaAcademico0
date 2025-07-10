/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.siatemaacademico0.empleados;

import ec.edu.ec.siatemaacademico0.personalinstitucional.PersonaInstitucional;

/**
 *
 * @author HP
 */
public class Empleado extends PersonaInstitucional {
    
    // Atributos
    private double sueldo;

    // Constructor
    public Empleado(double sueldo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(correoInstitucional, nombre, id, correo, cedula);
        this.sueldo = sueldo;
    }

    // Getter y Setter propios
    public double getSueldo() {
        return sueldo;
    }

    public void setSueldo(double sueldo) {
        this.sueldo = sueldo;
    }

    // Getters heredados, agregados para acceso directo
    public String getNombre() {
        return super.getNombre();
    }

    public String getCedula() {
        return super.getCedula();
    }

    public String getCorreo() {
        return super.getCorreo();
    }

    public String getCorreoInstitucional() {
        return super.getCorreoInstitucional();
    }

    public int getId() {
        return super.getId();
    }

    @Override
    public String toString() {
        return "Empleado{" +
               "nombre=" + getNombre() +
               ", cedula=" + getCedula() +
               ", correo=" + getCorreo() +
               ", correoInstitucional=" + getCorreoInstitucional() +
               ", id=" + getId() +
               ", sueldo=" + sueldo +
               '}';
    }
}