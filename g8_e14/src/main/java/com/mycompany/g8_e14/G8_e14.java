/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g8_e14;

import Entidad.Movil;
import Servicio.celularServicios;

/**
 *
 * @author jpc
 */
public class G8_e14 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        celularServicios servicios = new celularServicios();
        Movil movilUno = servicios.cargarCelular();
        System.out.println("Informacion del movil creado (COMPROBACION)");
        //String informacion=servicios.imprimirInformacion(movilUno);
        System.out.println(servicios.imprimirInformacion(movilUno));
    }
}
