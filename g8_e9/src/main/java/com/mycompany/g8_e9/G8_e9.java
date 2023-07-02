/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g8_e9;

import Entidad.Matematica;

/**
 *
 * @author jpc
 */
public class G8_e9 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        Matematica matUno = new Matematica();
        
        double num1 = Math.random() * 9 + 1;
        double num2 = Math.random() * 9 + 1;
        matUno.setN1(num1);
        matUno.setN2(num2);
        System.out.println(matUno.toString());
        
        double mayor = matUno.devolverMayor(matUno);
        System.out.println("Numero mayor: "+mayor);
        
        matUno.calcularPotencia(matUno);
        matUno.calculaRaiz(matUno);
    }
}
