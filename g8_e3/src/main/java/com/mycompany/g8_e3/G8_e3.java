/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g8_e3;

import Entidad.Operacion;

/**
 *
 * @author PCTaller
 */
public class G8_e3 {

    public static void main(String[] args) {
        System.out.println("Guia 8, Ejercicio 3");
        
        Operacion op1 = new Operacion();
        
        op1.crearOperacion(op1);
        op1.Sumar(op1);
        op1.Restar(op1);
        op1.Multiplicar(op1);
        op1.Dividir(op1);
    }
}
