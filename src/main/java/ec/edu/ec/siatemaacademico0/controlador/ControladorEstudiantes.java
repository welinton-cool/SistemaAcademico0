/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.siatemaacademico0.controlador;

import ec.edu.ec.siatemaacademico0.estudiantes.Estudiante;
import ec.edu.ec.siatemaacademico0.estudiantes.Estudiantes;
import ec.edu.ec.siatemaacademico0.estudiantes.IEstudiantes;
import ec.edu.ec.siatemaacademico0.vista.VEstudiantes;

/**
 *
 * @author HP
 */
public class ControladorEstudiantes {
   private VEstudiantes vistaEstudiantes;
    private NotificadorMensaje notificadorMensaje;
    private IEstudiantes iEstudiantes;

    public ControladorEstudiantes(VEstudiantes vistaEstudiantes) {
        this.vistaEstudiantes = vistaEstudiantes;
        this.notificadorMensaje = new NotificadorMensaje();
        this.iEstudiantes = new Estudiantes(10);
    }

    public void procesoControladorEstudiantes() {
        try {
            String nombreEstudiante = vistaEstudiantes.getNombre();
            String correoPersonalEstudiante = vistaEstudiantes.getCorreoPersonal();
            String cedulaEstudiante = vistaEstudiantes.getCedula();
            String correoInstitucionalEstudiante = vistaEstudiantes.getCorreoInstitucional();
            int idEstudiante = Integer.parseInt(vistaEstudiantes.getId());
            int codigoEstudiante = Integer.parseInt(vistaEstudiantes.getCodigo());

            Estudiante nuevoEstudiante = new Estudiante(
                    codigoEstudiante,
                    correoInstitucionalEstudiante,
                    nombreEstudiante,
                    idEstudiante,
                    nombreEstudiante,
                    cedulaEstudiante
            );
            boolean agregar = iEstudiantes.agregarEstudiantes(nuevoEstudiante);
            if (agregar == true) {
                notificadorMensaje.mostrarMensaje("Estudiante Agregado Exito");
                iEstudiantes.imprimirDato();
                
            }
        } catch (Exception e) {
            e.printStackTrace();
            notificadorMensaje.mostrarMensaje("Error al agregar el estudiante");
        }
    }

    public void procesoBuscarEstudiantes() {
        try {
            int iDEstudiante = Integer.parseInt(vistaEstudiantes.getBuscar());
            Estudiante estudianteBuscado = iEstudiantes.buscarEstudiante(iDEstudiante);
            if (estudianteBuscado != null) {
                 notificadorMensaje.mostrarMensaje("Estudiante encontrado");
                 vistaEstudiantes.setCedula(estudianteBuscado.getCedula());
                 vistaEstudiantes.setCodigo(String.valueOf(estudianteBuscado.getCodigo()));
                 vistaEstudiantes.setCorreo(estudianteBuscado.getCorreo());
                 vistaEstudiantes.setCorreoI(estudianteBuscado.getCorreoInstitucional());
                 vistaEstudiantes.setId(String.valueOf(estudianteBuscado.getId()));
                 vistaEstudiantes.setNombre(estudianteBuscado.getNombre());
                
                
            }else{
                notificadorMensaje.mostrarMensaje("Estudiante no encontrado");
            }
        } catch (Exception e) {
            notificadorMensaje.mostrarMensaje("Error al buscar el estudiante verifique que el codigo este correcto");
        }
    }

    public void procesoControladorEliminarEstudiantes() {
        try {
            int iDEstudiante = Integer.parseInt(vistaEstudiantes.getBuscar());
            Estudiante estudianteBuscado = iEstudiantes.buscarEstudiante(iDEstudiante);
            if (estudianteBuscado != null) {
                iEstudiantes.eliminarEstudiante(iDEstudiante);
                notificadorMensaje.mostrarMensaje("Estudiante eliminado");
            }
        } catch (Exception e) {
            notificadorMensaje.mostrarMensaje("Error al eliminar el estudiante");
        }
    }

    public void procesoControladorActualizarEstudiantes() {
        try {
            int idEstudiante = Integer.parseInt(vistaEstudiantes.getBuscar());

            Estudiante estudianteBuscado = iEstudiantes.buscarEstudiante(idEstudiante);
            if (estudianteBuscado != null) {
                String nombreEstudiante = vistaEstudiantes.getNombre();
                String correoPersonalEstudiante = vistaEstudiantes.getCorreoPersonal();
                String cedulaEstudiante = vistaEstudiantes.getCedula();
                String correoInstitucionalEstudiante = vistaEstudiantes.getCorreoInstitucional();
                int codigoEstudiante = Integer.parseInt(vistaEstudiantes.getCodigo());

                Estudiante estudianteActualizado = new Estudiante(
                        codigoEstudiante,
                        correoInstitucionalEstudiante,
                        nombreEstudiante,
                        idEstudiante,
                        nombreEstudiante,
                        cedulaEstudiante);

                iEstudiantes.actualizarEstudiante(idEstudiante, estudianteActualizado);

                notificadorMensaje.mostrarMensaje("Estudiante actualizado con éxito");
                iEstudiantes.imprimirDato();

            } else {
                notificadorMensaje.mostrarMensaje("No se encontró el estudiante con ID: " + idEstudiante);
            }

        } catch (NumberFormatException ex) {
            notificadorMensaje.mostrarMensaje("ID o Codigo inválido. Verifica los datos numéricos.");
        } catch (Exception e) {
            e.printStackTrace();
            notificadorMensaje.mostrarMensaje("Error al actualizar el estudiante");
        }
    }

}  

