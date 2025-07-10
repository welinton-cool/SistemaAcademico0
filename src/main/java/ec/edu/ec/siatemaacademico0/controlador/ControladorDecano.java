/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.siatemaacademico0.controlador;

import ec.edu.ec.siatemaacademico0.decano.Decano;
import ec.edu.ec.siatemaacademico0.decano.Decanos;
import ec.edu.ec.siatemaacademico0.decano.IDecanos;
import ec.edu.ec.siatemaacademico0.vista.NotificadorMensajes;
import ec.edu.ec.siatemaacademico0.vista.VDecano;

/**
 *
 * @author HP
 */
public class ControladorDecano {

    public static void procesoBuscarPersonaS() {
        throw new UnsupportedOperationException("Not supported yet."); // Generated from nbfs://nbhost/SystemFileSystem/Templates/Classes/Code/GeneratedMethodBody
    }

    private VDecano vistaDecano;
    private NotificadorMensajes notificarMensaje;
    private IDecanos iDecanos;

    public ControladorDecano(VDecano vistaDecano) {
        this.vistaDecano = vistaDecano;
        this.notificarMensaje = new NotificadorMensajes();
        this.iDecanos = new Decanos(10);
    }

    public void procesoControladorDecano() {
        try {
            String nombreDecano = vistaDecano.getNombreProfesor();
            String correoPersonalDecanos = vistaDecano.getCorreoPersonal();
            String cedulaDecanos = vistaDecano.getCedula();
            String correoInstitucionalDecanos = vistaDecano.getCorreoInstitucional();
            double sueldoDecano = Double.parseDouble(vistaDecano.getSuledo());
            int idDecano = Integer.parseInt(vistaDecano.getId());
            String nivelJerarquico = vistaDecano.getNivelJerarquico();

            Decano nuevoDecano = new Decano(
                    nivelJerarquico,
                    sueldoDecano,
                    correoInstitucionalDecanos,
                    nombreDecano,
                    idDecano,
                    nombreDecano,
                    cedulaDecanos);
            boolean agregar = iDecanos.AgregarDecanos(nuevoDecano);
            if (agregar == true) {
                notificarMensaje.mostrarMensajes("Profesor Agregado Exito");
                iDecanos.imprimirDatos();
            }
        } catch (Exception e) {
            e.printStackTrace();
            notificarMensaje.mostrarMensajes("Error al agregar el profesor");
        }
    }

    public void procesoBuscarDecano() {
        try {
            int idDecano = Integer.parseInt(vistaDecano.getBuscar());
            boolean decanoBuscado = iDecanos.buscarProfesor(idDecano);
            if(decanoBuscado == true){
                notificarMensaje.mostrarMensajes("Decano encontrado");
            }else{
                notificarMensaje.mostrarMensajes("Decano no encontrado");
            }            
        } catch (Exception e) {
            notificarMensaje.mostrarMensajes("Error en el codigo");
        }
    }

    public void procesoControladorEliminarProfesor() {
        try {
            int idDecano = Integer.parseInt(vistaDecano.getBuscar());
            boolean profesorBuscado = iDecanos.buscarProfesor(idDecano);
            //Profesor eliminarProfesor = new Profesor(0," "," ",  0, " ", " ");
            if (profesorBuscado == true) {
                iDecanos.eliminarDecano(idDecano);
                notificarMensaje.mostrarMensajes("Decano eliminado");
            }
        } catch (Exception e) {
            notificarMensaje.mostrarMensajes("Error al eliminar el Decano");
        }
    }

    public void procesoControladorActualizarProfesor() {
        try {
            int iDProfesor = Integer.parseInt(vistaDecano.buscar());

            boolean existe = iDecanos.buscarProfesor(iDProfesor);
            if (existe) {
                String nombreDecano = vistaDecano.getNombreProfesor();
                String correoPersonalDecano = vistaDecano.getCorreoPersonal();
                String cedulaDecano = vistaDecano.getCedula();
                String correoInstitucionalDecano = vistaDecano.getCorreoInstitucional();
                double sueldoDecano = Double.parseDouble(vistaDecano.getSuledo());
                int idDecano = Integer.parseInt(vistaDecano.getId());
                String nivelJerarquico = vistaDecano.getNivelJerarquico();

                Decano decanoActualizado = new Decano(
                        nivelJerarquico,
                        sueldoDecano,
                        correoInstitucionalDecano,
                        nombreDecano,
                        idDecano,
                        nombreDecano,
                        cedulaDecano);

                iDecanos.actualizarDecano(iDProfesor, decanoActualizado);

                notificarMensaje.mostrarMensajes("Profesor actualizado con éxito");

            } else {
                notificarMensaje.mostrarMensajes("No se encontró el decano con ID: " + iDProfesor);
            }

        } catch (NumberFormatException ex) {
            notificarMensaje.mostrarMensajes("ID o Sueldo inválido. Verifica los datos numéricos.");
        } catch (Exception e) {
            e.printStackTrace();
            notificarMensaje.mostrarMensajes("Error al actualizar el profesor");
        }
    }

}
