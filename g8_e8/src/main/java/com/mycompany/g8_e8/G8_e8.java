/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g8_e8;

import Entidad.Cadena;
import Servicio.serviciosCadena;
import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class G8_e8 {
    
    private static Scanner entrada = new Scanner(System.in);
    
    public static void main(String[] args) {
        
        serviciosCadena servicios = new serviciosCadena();
        System.out.println("Ingresa la frase");
        //String frase = entrada.nextLine();
        String frase = "Hola, ¿Como estas?";
        
        Cadena cadUno = new Cadena (frase);
        //servicios.mostrarVocales(cadUno);
        //servicios.invertirFrase(cadUno);
        //servicios.vecesRepetido(cadUno);
        //servicios.compararLongitud(cadUno);
        //servicios.unirFrases(cadUno);
        //servicios.reemplazar(cadUno);
        servicios.contiene(cadUno);
    }
}
