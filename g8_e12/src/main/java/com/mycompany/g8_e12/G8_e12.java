/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g8_e12;

import Entidad.Persona;
import Servicio.serviciosPersona;
import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class G8_e12 {

    public static void main(String[] args) {
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ejercicio 11. Checar como se uso Date en Services");
        serviciosPersona serviciosPers = new serviciosPersona();
        Persona persUno = serviciosPers.crearPersona();
        System.out.println("Info: "+persUno.toString());
        
        serviciosPers.calcularEdad(persUno);
        System.out.println("Ingresa la edad a comprobar: ");
//        int edad = entrada.nextInt();
        int edad = 55;
        boolean triger = serviciosPers.menorQue(edad, persUno);
        System.out.println("¿Mayor que la edad ingresada?: "+triger);
        
        serviciosPers.mostrarPersona(persUno);
    }
}
