/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g8_e2;

import Entidad.Circunferencia;
import Servicio.ServiciosCirculo;

/**
 *
 * @author PCTaller
 */
public class G8_e2 {

    public static void main(String[] args) {
        ServiciosCirculo servCirculo = new ServiciosCirculo();
        Circunferencia c1 = new Circunferencia(0);
        
        c1 = servCirculo.crearCircunferencia();
        
        servCirculo.Area(c1);
        servCirculo.Perimetro(c1);
    }
}
