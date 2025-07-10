/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.siatemaacademico0.estudiantes;

/**
 *
 * @author HP
 */
public interface IEstudiantes {

    public boolean agregarEstudiantes(Estudiante estudiante);
    public void imprimirDato ();
    public boolean eliminarEstudiante (int id);
     public Estudiante buscarEstudiante(int id);
    public boolean actualizarEstudiante (int id, Estudiante estudiante);
}
