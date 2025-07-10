/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.siatemaacademico0.personasservicios;

/**
 *
 * @author KARLA
 */
public class PersonalServicios  extends Empleado{
    
    private String gremio;

    public PersonalServicios(String gremio, double sueldo, String correoInstitucional, String nombre, int id, String correo, String cedula) {
        super(sueldo, correoInstitucional, nombre, id, correo, cedula);
        this.gremio = gremio;
    }

    public void setGremio(String gremio) {
        this.gremio = gremio;
    }

    public String getGremio() {
        return gremio;
    }
    

    @Override
    public String toString() {
        return "personalServivcios{" + "gremio=" + gremio + super.toString()+'}';
    }
    
}
