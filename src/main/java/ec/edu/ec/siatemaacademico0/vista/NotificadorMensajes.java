/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ec.edu.ec.siatemaacademico0.vista;

import javax.swing.JOptionPane;

/**
 *
 * @author HP
 */
public class NotificadorMensajes {

   public void mostrarMensaje(String mensaje){
        JOptionPane.showMessageDialog(null, mensaje, "informacion", JOptionPane.INFORMATION_MESSAGE);
    }
    
}
