package com.mycompany.mascotapp;

import com.mycompany.mascotapp.entidades.Mascota;
import com.mycompany.mascotapp.servicios.ServicioMascota;
import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class MascotAPP {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in);
        
// Interacción entre Main y Mascotas; crear objeto
        Mascota m1 =  new Mascota();
        System.out.println("Inicio: "+m1.toString());
        // No es necesario guardar el cambio al objeto
        m1.pasear(870);
        System.out.println("Despues: "+m1.toString());
        
        // Trabajando con el método del Servicio
        // para crear objetos.
        ServicioMascota sm = new ServicioMascota();
        // Ya tenemos acceso a los métodos que tiene ese
        // servicio.
        // crearMascota() retornara un tipo Mascota 
        // plt corresponde con lo que se crea donde devolvera 
        // Lo que devuelva crearMascota() se guarda en m2
        Mascota m2 = sm.crearMascota();
        System.out.println("m2: "+m2.toString());
        
        // Ejemplificando el garbage collector
        // cuando una clase se deja de usar 
        // se elimina y no ocupara memoria
        Mascota m3 = new Mascota();
        m3 = null;
        
        // Ejemplificacion de paso por ref. en Clases
        // (que es lo que pasa por defecto)
        modificador(10, m1);
        System.out.println("Despues: "+m1.toString());
    }
    
    public static void modificador(int num, Mascota m){
        m.setApodo("Se cambio desde método");
    }
}
