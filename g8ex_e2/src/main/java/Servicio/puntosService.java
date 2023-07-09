/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Puntos;
import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class puntosService {
    
    private Scanner entrada = new Scanner(System.in);
    
    public Puntos crearPuntos(){
        Puntos toCreate = new Puntos();
        System.out.println("Ingresa la coordenada X1: ");
        toCreate.setX1(entrada.nextInt());
        System.out.println("Ingresa la coordenada Y1: ");
        toCreate.setY1(entrada.nextInt());
        System.out.println("Ingresa la coordenada X2: ");
        toCreate.setX2(entrada.nextInt());
        System.out.println("Ingresa la coordenada Y2: ");
        toCreate.setY2(entrada.nextInt());
        return toCreate;
    }
    
    public void calcularDistancia(Puntos punto){
        double xResult = Math.pow(punto.getX2()-punto.getX1(), 2);
        double yResult = Math.pow(punto.getY2()-punto.getY1(), 2);
        System.out.println("La distancia entre los 2 puntos es: ");
        System.out.println(Math.sqrt(xResult+yResult));
    }
}
