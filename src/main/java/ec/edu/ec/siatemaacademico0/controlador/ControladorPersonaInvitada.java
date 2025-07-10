/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.siatemaacademico0.controlador;

import ec.edu.ec.siatemaacademico0.personasinvitadas.IPersonasInvitadas;
import ec.edu.ec.siatemaacademico0.personasinvitadas.PersonaInvitada;
import ec.edu.ec.siatemaacademico0.personasinvitadas.PersonasInvitadas;
import ec.edu.ec.siatemaacademico0.vista.NotificadorMensaje;
import ec.edu.ec.siatemaacademico0.vista.VPersonasInvitadas;

/**
 *
 * @author KARLA
 */
public class ControladorPersonaInvitada {
 private VPersonasInvitadas vistaPersonaInvitada;
    private NotificadorMensaje notificarMensaje;
    private IPersonasInvitadas iPersonasInvitadas;

    public ControladorPersonaInvitada(VPersonasInvitadas vistaPersonaInvitada) {
        this.vistaPersonaInvitada = vistaPersonaInvitada;
        this.iPersonasInvitadas = new PersonasInvitadas(10);
        this.notificarMensaje = new NotificadorMensaje();

    }

    public void procesoControladorPersonaInvitada() {
        try {
            String nombrePersonaInvitada = vistaPersonaInvitada.getNombre();
            String correoPersonaInvitada = vistaPersonaInvitada.getCorreo();
            String cedulaPersonaInvitada = vistaPersonaInvitada.getCedula();
            String descripcionPersonaInvitada = vistaPersonaInvitada.getDescripcion();
            int idPersonaInvitada = Integer.parseInt(vistaPersonaInvitada.getId());

            PersonaInvitada nuevaPersonaInvitada = new PersonaInvitada(
                    nombrePersonaInvitada,
                    idPersonaInvitada,
                    correoPersonaInvitada,
                    cedulaPersonaInvitada,
                    descripcionPersonaInvitada
            );

            boolean agregar = iPersonasInvitadas.agregarpersonaInvitada(nuevaPersonaInvitada);
            if (agregar == true) {
                notificarMensaje.mostrarMensaje("Persona Agregada exitosamente");
                iPersonasInvitadas.imprimirDatos();
            }
        } catch (Exception e) {
            e.printStackTrace();
            notificarMensaje.mostrarMensaje("Error al agregar a la persona");
        }
    }

    public void procesoBuscarPersona() {
        try {
            int idPersonaInvitada = Integer.parseInt(vistaPersonaInvitada.getBuscar());
            boolean PersonaBuscada = iPersonasInvitadas.buscarPersonaInvitada(idPersonaInvitada);
            if (PersonaBuscada == true) {
                notificarMensaje.mostrarMensaje("Persona encontrada");
            } else {
                notificarMensaje.mostrarMensaje("Persona no encontrada");
            }
        } catch (Exception e) {
            notificarMensaje.mostrarMensaje("Error en el codigo");
        }
    }

    public void procesoEliminarPersona() {
        try {
            int idPersonaInvitada = Integer.parseInt(vistaPersonaInvitada.getBuscar());
            boolean PersonaBuscada = iPersonasInvitadas.buscarPersonaInvitada(idPersonaInvitada);
            //Profesor eliminarProfesor = new Profesor(0," "," ",  0, " ", " ");
            if (PersonaBuscada == true) {
                iPersonasInvitadas.eliminarPersonaInvitada(idPersonaInvitada);
                notificarMensaje.mostrarMensaje("Persona Eliminada");
            }
        } catch (Exception e) {
            notificarMensaje.mostrarMensaje("Error al eliminar a la Persona Invitada");
        }
    }

    public void procesoActualizarPersona() {
        try {
            int idPersonaInvitada = Integer.parseInt(vistaPersonaInvitada.getBuscar());

            boolean x = iPersonasInvitadas.buscarPersonaInvitada(idPersonaInvitada);
            if (x) {
                String nombrePersonaInvitada = vistaPersonaInvitada.getNombre();
                String correoPersonaInvitada = vistaPersonaInvitada.getCorreo();
                String cedulaPersonaInvitada = vistaPersonaInvitada.getCedula();
                String descripcionPersonaInvitada = vistaPersonaInvitada.getDescripcion();

                PersonaInvitada personaActualizada = new PersonaInvitada(
                        nombrePersonaInvitada,
                        idPersonaInvitada,
                        correoPersonaInvitada,
                        cedulaPersonaInvitada,
                        descripcionPersonaInvitada);
                iPersonasInvitadas.actualizarPersonaInvitada(idPersonaInvitada, personaActualizada);
                notificarMensaje.mostrarMensaje("Informacion actualizada correctamente");

            } else {
                notificarMensaje.mostrarMensaje("No se encontró profesor con ID: " + idPersonaInvitada);
            }
        } catch (NumberFormatException ex) {
            notificarMensaje.mostrarMensaje("ID invalido. Verifica los datos numéricos.");
        } catch (Exception e) {
            e.printStackTrace();
            notificarMensaje.mostrarMensaje("Error al actualizar a la persona invitada");
        }
    }
   
}
