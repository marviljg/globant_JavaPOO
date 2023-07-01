package Servicio;

import Entidad.Persona;
import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class PersonaService {
    
    public Persona crearPersona(){
        Scanner entrada= new Scanner(System.in);
        
        Persona personaCreada= new Persona();
        System.out.println("¿Nombre?: ");
        personaCreada.setNombre(entrada.nextLine());
        
        System.out.println("¿Edad?: ");
        personaCreada.setEdad(entrada.nextInt());
        entrada.nextLine();
        
        String sx;
        do {            
            System.out.println("¿Sexo?: h/m/o");
            sx = entrada.nextLine();
            sx=sx.toLowerCase();
            if (!(sx.equals("h") || sx.equals("m") || sx.equals("o"))) {
                System.out.println("Opcion incorrecta. Ingresa un valor valido");
            }else{
                personaCreada.setSexo(sx);
            }
        } while (!(sx.equals("h") || sx.equals("m") || sx.equals("o")));
        
        System.out.println("¿Peso?: -En kilogramos-");
        personaCreada.setPeso(entrada.nextDouble());
        
        System.out.println("¿Altura?: -En metros- ");
        personaCreada.setAltura(entrada.nextDouble());
        
        return personaCreada;
    }
    
    public double calcularIMC(Persona pers){
        double imc = pers.getPeso()/(pers.getAltura()*pers.getAltura());
        double val;
        
        if (imc<20) {
            System.out.println("Debajo de su peso");
            val=-1;
        }else if (imc<=25) {
            System.out.println("Peso ideal");
            val=0;
        }else{
            System.out.println("Sobrepeso");
            val=1;
        }
        return val;
    }
    
    public boolean esMayorDeEdad(Persona pers){
        boolean triger=false;
        if (pers.getEdad()>=18) {
            triger=true;
        }
        return triger;
    }
}
