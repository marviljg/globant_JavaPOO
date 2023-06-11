package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class PersonaService {
    private Scanner entrada = new Scanner(System.in);
    
    // Es un método tipo persona; debe coincidir con el 
    // tipo de valor que retorna
    public Persona crearPersona(){
        // Se instancia un objeto tipo persona con 
        // sus atributos vacios
        Persona personaCompleta = new Persona();
        
        // Pedimos al usuario que se ingrese la información
        System.out.println("Ingresa el nombre de la persona");
        
        // Con el objeto, invocamos al método set y recibimos
        // la información con Scanner
        personaCompleta.setNombre(entrada.next());
        
        // Ya retornamos el objeto con sus atributos llenados.
        return personaCompleta;   
    }
}
