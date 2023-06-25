package com.mycompany.g8_e4;

import Entidad.Rectangulo;
import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class G8_e4 {

    private Scanner entrada = new Scanner(System.in);
    public static void main(String[] args) {
        System.out.println("NULL");
        Rectangulo n1 = Rectangulo.crearRectanguloUser();
        
        System.out.println("Dibujo del rectangulo: ");
        System.out.println("");
        n1.dibujar(n1);
        n1.superficie(n1);
        n1.perimetro(n1);
        
        //Repasar como desde una propia clase se pueden crear clases
    }
}
