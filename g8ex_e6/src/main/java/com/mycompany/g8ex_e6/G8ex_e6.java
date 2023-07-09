/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g8ex_e6;

import Entidad.Ahorcado;
import Servicio.AhorcadoService;

/**
 *
 * @author jpc
 */
public class G8ex_e6 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        AhorcadoService servicios = new AhorcadoService();
        Ahorcado ahorcadoUno = servicios.crearJuego();
        
        servicios.juego(ahorcadoUno);
    }
}
