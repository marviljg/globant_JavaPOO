package com.mycompany.g8_e6;

import Entidad.Cafetera;
import Servicio.CafeteraService;

/**
 *
 * @author jpc
 */
public class G8_e6 {

    public static void main(String[] args) {
        System.out.println("Cafetera");
        
        Cafetera cUno = new Cafetera();
        CafeteraService cafeServicios = new CafeteraService();
        
        System.out.println("*Se llena.");
        cafeServicios.llenarCafetera(cUno);
        
        System.out.println("*Servir una taza.");
        cafeServicios.servirTaza(cUno);
        
        System.out.println("*Se vacia.");
        cafeServicios.vaciarCafetera(cUno);
        
        System.out.println("(SE VACIO) Servir una taza.");
        cafeServicios.servirTaza(cUno);
        
        System.out.println("*Agregar café.");
        cafeServicios.agregarCafe(cUno);
        
        System.out.println("(AGREGADO) Servir una taza.");
        cafeServicios.servirTaza(cUno);
    }
}
