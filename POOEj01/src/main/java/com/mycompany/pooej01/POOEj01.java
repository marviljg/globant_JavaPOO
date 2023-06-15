package com.mycompany.pooej01;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author jpc
 */
public class POOEj01 {

    public static void main(String[] args) {
        // Se instancia con el constructor vacio
        Persona primeraPersona = new Persona();
        // Pasamos parámetros con el método set
        primeraPersona.setNombre("Anna Karerina");
        primeraPersona.setEdad(24);
        primeraPersona.setSexo('M');
        
        // Se instancia con el constructor por parámetros
        Persona segundaPersona = new Persona("Juan Rulfo", 63, 'H');
        
        // Obteniendo valores con get
        System.out.println("Con getter: "+primeraPersona.getNombre()+primeraPersona.getEdad()+primeraPersona.getSexo());
        
        // Obteniendo valores con método de clase toString()
        System.out.println("Con toString(): "+segundaPersona.toString());
        
        // Se crea una tercera persona, pero desde la clase Service
        // ES SOLO UNA CLASE INTERMEDIA ENTRE "Persona" Y LA INFO DESDE MAIN
        PersonaService persServicio = new PersonaService();
        
        // Alojamos el retorno del método en un objeto tipo
        // Persona; porqué es el tipo que retorna el método
        Persona terceraPersona = persServicio.crearPersona();
        System.out.println("Nombre por get dado en Service");
        System.out.println("Nombre: "+terceraPersona.getNombre());
        
        persServicio.mostrarConGet(terceraPersona);
    }
}
