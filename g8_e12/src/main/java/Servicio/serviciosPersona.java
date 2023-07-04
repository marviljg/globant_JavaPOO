/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Persona;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class serviciosPersona {
    
    Scanner entrada = new Scanner(System.in);
    
    public Persona crearPersona(){
        Persona personaCreada = new Persona();
        
        System.out.println("¿Nombre de la persona?");
        //String name = entrada.nextLine();
        String name = "José Martínez";
        personaCreada.setNombre(name);
        System.out.println("Año de nacimiento: aaa" );
//        int anio=entrada.nextInt();
        int anio = 1989;
        System.out.println("Mes de nacimiento: mm" );
//        int mes=entrada.nextInt();
        int mes=04;
        System.out.println("Dia de nacimiento: dd" );
//        int dia=entrada.nextInt();
        int dia=16;
        Date fechaAux = new Date(anio-1900, mes-1, dia);
        personaCreada.setFechaNacimiento(fechaAux);
        return personaCreada;
    }
    
    public void calcularEdad(Persona pers){
        Date fechaActual = new Date();
        System.out.println("Años de la persona: ");
        System.out.println(fechaActual.getYear()-pers.getFechaNacimiento().getYear());
    }
    
    public boolean menorQue(int edad, Persona pers){
        boolean veredict=false;
        Date fechaActual = new Date();
        int valAux = fechaActual.getYear()-pers.getFechaNacimiento().getYear();
        if (valAux>edad) {
            veredict=true;
        }
        return veredict;
    }
    
    public void mostrarPersona(Persona pers){
        System.out.println("Datos de la persona: ");
        System.out.println(pers.toString());
    }
}
