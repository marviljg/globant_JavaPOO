/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g8ex_e5;

import Entidad.Meses;
import Servicio.MesesServicio;
import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author jpc
 */
public class G8ex_e5 {

    public static void main(String[] args) {
        
        MesesServicio servicios = new MesesServicio();
        System.out.println("Cargar meses: " );
        Meses listaMeses = servicios.cargarMeses();
        System.out.println("Meses cargados." );
        
        System.out.println("Jugar");
        servicios.adivinarMes(listaMeses);
    }
}
