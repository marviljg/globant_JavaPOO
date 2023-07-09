/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g8ex_e4;

import Entidad.NIF;
import Servicio.nifService;

/**
 *
 * @author jpc
 */
public class G8ex_e4 {

    public static void main(String[] args) {
        System.out.println("Servicios: ");
        nifService servicios = new nifService();
        NIF nifUno = servicios.crearNIF();
        servicios.mostrarNIF(nifUno);
        
    }
}
