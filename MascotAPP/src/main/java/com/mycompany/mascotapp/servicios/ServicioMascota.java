package com.mycompany.mascotapp.servicios;

import com.mycompany.mascotapp.entidades.Mascota;
import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class ServicioMascota {
    
    // No es del todo buena practica, lo siguiente.
    private Scanner leer = new Scanner(System.in).useDelimiter("\n");
    
    public Mascota crearMascota(){
        System.out.println("Nombre: ");
        String nombre = leer.next();
        System.out.println("Tipo: ");
        String tipo = leer.next();
        System.out.println("Apoddo: ");
        String apodo = leer.next();
        // Como no necesitamos que exista instanciada 
        // la clase, podemos devolverla directamente.
        return new Mascota(nombre, apodo, tipo, "Morado", 3, true, "Tyranido");
    }
}
