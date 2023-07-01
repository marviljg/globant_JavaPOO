package com.mycompany.g8_e7;

import Entidad.Persona;
import Servicio.PersonaService;

/**
 *
 * @author jpc
 */
public class G8_e7 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        PersonaService serviciosPersona = new PersonaService();

        Persona[] persArray = new Persona[4];
        double[] arrIMC = new double[4];
        boolean[] arrEDAD= new boolean[4];
        
        for (int i = 0; i < persArray.length; i++) {
            // Crea cada Persona y la guarda en un indice del arreglo Persona
            persArray[i] = serviciosPersona.crearPersona();
            
            // Va guardando en cada indice los IMC
            arrIMC[i] = serviciosPersona.calcularIMC(persArray[i]);
            
            // Va guardando en cada indice las edades
            arrEDAD[i] = serviciosPersona.esMayorDeEdad(persArray[i]);
        }
        
        toPrint(persArray);
        contarIMC(arrIMC);
        contarEDAD(arrEDAD);
    }
    
    private static void toPrint(Persona[] arregloPERSONAS){
        for (int i = 0; i < arregloPERSONAS.length; i++) {
            System.out.println(arregloPERSONAS[i].toString());
        }
    }
    
    private static void contarIMC(double[] arregloIMC){
        int debajo=0, ideal=0, sobre=0;
        
        for (int i = 0; i < arregloIMC.length; i++) {
            if (arregloIMC[i]==-1) {
                debajo++;
            } else if (arregloIMC[i]==0) {
                ideal++;
            }else{
                sobre++;
            }    
        }
        
        System.out.println("#Gente debajo del peso: "+debajo);
        System.out.println("#Gente ideal del peso: "+ideal);
        System.out.println("#Gente sobre del peso: "+sobre);
    }
    
    private static void contarEDAD(boolean[] arregloEDAD){
        int mayor=0, menor=0;
        for (int i = 0; i < arregloEDAD.length; i++) {
            if (arregloEDAD[i]==true) {
                mayor++;
            }else{
                menor++;
            }
        }
        System.out.println("#Gente mayor de edad: "+mayor);
        System.out.println("#Gente menor de edad: "+menor);
    }
}
