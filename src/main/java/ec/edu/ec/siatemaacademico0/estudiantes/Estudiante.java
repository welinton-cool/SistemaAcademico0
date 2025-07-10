/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.siatemaacademico0.estudiantes;

/**
 *
 * @author HP
 */
public class Estudiante extends PersonaInstitucional{
    //Atributos
    private int codigo;

    public Estudiante(int codigo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(correoInstitucional, nombre, id, correo, cedula);
        this.codigo = codigo;
    }

    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + '}';
    } 
}


    
    
