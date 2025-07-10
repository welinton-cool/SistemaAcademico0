/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ec.siatemaacademico0.personasservicios;

/**
 *
 * @author KARLA
 */
public interface IPersonasServicios {
    public boolean agregarPersonalServicio(PersonalServicios  personalServicios);
    public void imprimirDatos ();
    public boolean actualizarPersonalServicio (int id, PersonalServicios  personalServicios );
    public boolean eliminarPersonasServicio(int id);
    public boolean buscarPersonasServicio(int id);

}
