/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.siatemaacademico0.decano;

/**
 *
 * @author HP
 */
public interface IDecanos {
    public boolean AgregarDecanos(Decano decano);
    public void imprimirDatos ();
    public boolean actualizarDecano (int iD, Decano decano);
    public boolean eliminarDecano (int iD);
    public boolean buscarProfesor(int id);
}
