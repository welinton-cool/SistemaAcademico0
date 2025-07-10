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
     private int codigo;

    public Estudiante(int codigo, String correoInstitucional, int id, String nombre, String correoPersonal, String cedula) {
        super(correoInstitucional, id, nombre, correoPersonal, cedula);
        this.codigo = codigo;
    }
  
    
    public int getCodigo() {
        return codigo;
    }

    public void setCodigo(int codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        return "Estudiante{" + "codigo=" + codigo + '}';
    }

    
    
   public void imprimir() {
        System.out.println("----- Estudiante -----");
        System.out.println("Nombre: " + nombre);
        System.out.println("Cédula: " + cedula);
         String CorreoPersonal = null;
        
        System.out.println("CorreoPersonal: " + CorreoPersonal);
}
}

    
    
}