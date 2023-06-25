/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g8_e1;

import Entidad.Libro;
import Servicio.LibroService;

/**
 *
 * @author PCTaller
 */
public class G8_e1 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        LibroService serviciosLibro = new LibroService();
        Libro libro1 = serviciosLibro.cargarLibro();
        
        // Pedimos la información del libro
        serviciosLibro.mostrarLibro(libro1);
    }
}
