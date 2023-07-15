/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g8_e3_op2;

import Entidades.Calculadora;
import Servicios.Operaciones;

/**
 *
 * @author jpc
 */
public class G8_e3_op2 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Operaciones oper = new Operaciones();
        Calculadora calUno = oper.cargarNumeros();
        System.out.println("Comprobacion de carga: ");
        System.out.println(calUno.toString());
        oper.Restar(calUno);
        oper.Sumar(calUno);
        oper.Multiplicar(calUno);
        oper.Dividir(calUno);
    }
}
