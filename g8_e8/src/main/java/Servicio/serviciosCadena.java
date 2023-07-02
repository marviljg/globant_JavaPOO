/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Cadena;
import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class serviciosCadena {
    Scanner entrada = new Scanner(System.in);
    
    public void mostrarVocales(Cadena cad){
        int contador=0;
        String frase=cad.getFrase().toLowerCase();
        for (int i = 0; i < cad.getLongitudFrase(); i++) {
            if (frase.substring(i, i+1).contains("a") || frase.substring(i, i+1).contains("e") || 
                    frase.substring(i, i+1).contains("i") || frase.substring(i, i+1).contains("o")
                    || frase.substring(i, i+1).contains("u")) {
                contador++;
            }
        }
        System.out.println("Numero de vocales encontradas: "+contador);
    }
    
    public void invertirFrase(Cadena cad){
        StringBuilder invertida = new StringBuilder(cad.getFrase());
        System.out.println("Frase Invertida: ");
        System.out.println(invertida.reverse().toString());
    }
   
    public void vecesRepetido(Cadena cad){
        int contador=0;
        System.out.println("Ingresa caracter a buscar: ");
        String letra=entrada.nextLine();
        String frase = cad.getFrase().toLowerCase();
        
        for (int i = 0; i < cad.getLongitudFrase(); i++) {
            if (frase.substring(i, i+1).contains(letra)) {
                contador++;
            }
        }
        System.out.println("La letra "+letra+" se encontro "+contador+" veces.");
    }
            
    public void compararLongitud(Cadena cad) {
        System.out.println("2da frase a comparar");
        String frase2=entrada.nextLine();
        System.out.println(cad.getFrase().compareTo(frase2));
    }
    
    public void unirFrases(Cadena cad) {
        System.out.println("2da frase a uni");
        String frase2=entrada.nextLine();
        System.out.println(cad.getFrase().concat(frase2));
    }
    
    public void reemplazar(Cadena cad){
        System.out.println("Caracter de reemplazo");
        String caracter = entrada.nextLine();
        String nuevaFrase="";
        for (int i = 0; i < cad.getLongitudFrase(); i++) {
            if(cad.getFrase().toLowerCase().substring(i,i+1).equals("a")){
                nuevaFrase = nuevaFrase.concat(caracter);
            }else{
                nuevaFrase = nuevaFrase.concat(cad.getFrase().substring(i, i+1));
            }
        }
        System.out.println("Frase obtenida con el nuevo caracter: ");
        System.out.println(nuevaFrase);
    }
    
    public void contiene(Cadena cad) {
        System.out.println("Letra a buscar: ");
        String letra = entrada.nextLine();
        System.out.println("¿Contiene la frase?: ");
        System.out.println(cad.getFrase().contains(letra));
    }
}
