/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package ec.edu.ec.siatemaacademico0.personasinvitadas;

/**
 *
 * @author KARLA
 */
public interface IPersonasInvitadas {
  public boolean agregarpersonaInvitada(PersonaInvitada personasInvitadas);
    public void imprimirDatos ();
    public boolean actualizarPersonaInvitada (int id, PersonaInvitada personasInvitadas );
    public boolean eliminarPersonaInvitada (int id);
    public boolean buscarPersonaInvitada (int id);
   
}
