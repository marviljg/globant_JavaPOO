/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g8ex_e3;

import Entidad.Raices;
import Servicio.RaicesService;

/**
 *
 * @author jpc
 */
public class G8ex_e3 {

    public static void main(String[] args) {
        RaicesService serviciosRaiz = new RaicesService();
        System.out.println("Crar objeto Raices");
        Raices rUno = serviciosRaiz.crearRaices();
        
        double[] soluciones = new double[2];
        
        double discriminante = serviciosRaiz.getDiscriminante(rUno);
        System.out.println("Valor del discriminante: "+discriminante);
        
        boolean tieneRaices = serviciosRaiz.tieneRaices(discriminante);
        System.out.println("¿tieneRaices?: "+tieneRaices);
        
        boolean tieneRaiz = serviciosRaiz.tieneRaiz(discriminante);
        System.out.println("¿tieneRaiz?: "+tieneRaiz);
        
        //obtenerRaices
        if (tieneRaices==true) {
            System.out.println("Soluciones: ");
            //imprimir las dos posibles soluciones
            soluciones = serviciosRaiz.obtenerRaices(rUno, discriminante);
            System.out.println("Solucion 1: ");
            System.out.println(soluciones[0]);
            System.out.println("Solucion 2: ");
            System.out.println(soluciones[1]);
        }
        //Caso de una unica solucion
        if (tieneRaiz==true) {
            System.out.println("Solucion unica: ");
            soluciones = serviciosRaiz.obtenerRaices(rUno, discriminante);
            System.out.println(soluciones[0]);
        }
    }
}
