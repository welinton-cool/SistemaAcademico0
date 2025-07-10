/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.siatemaacademico0.decano;

import ec.edu.ec.siatemaacademico0.personalacademico.PersonalAcademico;

/**
 *
 * @author HP
 */
public class Decano extends PersonalAcademico {
    private String nivelJerarquico; 

    public Decano(String nivelJerarquico, double sueldo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(sueldo, correoInstitucional, id, nombre, correoPersonal, cedula);
        this.nivelJerarquico = nivelJerarquico;
    }

 
    

  
        this.nivelJerarquico = nivelJerarquico;
    

    

    public String getNivelJerarquico() {
        return nivelJerarquico;
    }

    public void setNivelJerarquico(String nivelJerarquico) {
        this.nivelJerarquico = nivelJerarquico;
    }
 

    @Override
    public String toString() {
        return "Decanos{" +
                "nivelJerarquico= " + nivelJerarquico +" " + super.toString() +
                '}';
    }
}



