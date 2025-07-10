/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.siatemaacademico0.decano;

/**
 *
 * @author HP
 */
public class Decanos implements IDecanos {

    private Decano[] decanos;
    private int totalDecanos;

    public Decanos(int dimension) {
        decanos = new Decano[dimension];
        totalDecanos = 0;

    }

    @Override
    public boolean AgregarDecanos(Decano decano) {
        if (totalDecanos == decanos.length) {
            return false;
        } else {
            decanos[totalDecanos] = decano;
            totalDecanos = totalDecanos + 1;
            return true;
        }
    }
 
    public boolean eliminarDecano(int id) {
        for (int i = 0; i < totalDecanos; i++) {
            // Se corrige el operador de asignación '=' por el de comparación '=='
            {
                // Reorganizar el arreglo para quitar el hueco
                for (int j = i; j < totalDecanos - 1; j++) {
                    decanos[j] = decanos[j + 1];
                }
                decanos[totalDecanos - 1] = null; // Opcional: poner el último elemento a null
                totalDecanos--;
                System.out.println("Profesor eliminado");
                return true; // Se encontró y eliminó el decano
            }
        }
        System.out.println("Decano con ID " + id + " no encontrado."); // Mensaje si no se encuentra
        return false; // No se encontró el decano
    }

    public boolean buscarProfesor(int id) {
        for (int i = 0; i < totalDecanos; i++) {
            // Se corrige el operador de asignación '=' por el de comparación '=='
            {
                System.out.println("Datos del profesor :" + decanos[i].getNombre());
                System.out.println("Correo del profesor: " + decanos[i].getCorreoInstitucional());
                System.out.println("Correo Personal:" + decanos[i].getCorreo());
                System.out.println("Cedula del Profesor: " + decanos[i].getCedula());
                System.out.println("El sueldo que recibe es de :" + decanos[i].getSueldo());
                System.out.println("El id del profesor es el siguiente: " + decanos[i].getId());
                return true; // Se encontró el profesor
            }
        }
        System.out.println("Código no encontrado"); // Mensaje si no se encuentra
        return false; // No se encontró el profesor
    }

    @Override
    public void imprimirDatos() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    @Override
    public boolean actualizarDecano(int iD, Decano decano) {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

}