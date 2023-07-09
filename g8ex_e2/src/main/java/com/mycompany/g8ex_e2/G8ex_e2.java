/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g8ex_e2;

import Entidad.Puntos;
import Servicio.puntosService;

/**
 *
 * @author jpc
 */
public class G8ex_e2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        System.out.println("Crear los puntos");
        puntosService serviciosPuntos = new puntosService();
        Puntos pUno = serviciosPuntos.crearPuntos();
        System.out.println(pUno.toString());
        
        System.out.println("Calcular distancia: ");
        serviciosPuntos.calcularDistancia(pUno);
    }
}
