/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g8ex_e5_op2;

import Entidad.Meses;
import Servicio.MesesService;

/**
 *
 * @author jpc
 */
public class G8ex_e5_op2 {

    public static void main(String[] args) {
        MesesService servicios = new MesesService();
        System.out.println("Crear y cargar instancias");
        Meses listaMeses = servicios.cargarMeses();
        servicios.jugar(listaMeses);
    }
}
