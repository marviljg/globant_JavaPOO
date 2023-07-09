/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Ahorcado;
import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class AhorcadoService {
    
    private Scanner scanner = new Scanner(System.in);
    
    //Carga la palabra en el vector y numero de intentos. Retorna el objeto
    public Ahorcado crearJuego(){
        Ahorcado crearAhorcado = new Ahorcado();
        System.out.println("¿Palabra a utilizar?: ");
        //crearAhorcado.setPalabra(scanner.nextLine().toLowerCase());
        crearAhorcado.setPalabra("itzel");
        System.out.println("(HINT) Palabra a buscar: Itzel");
        System.out.println("¿Numero de intentos?: ");
        //crearAhorcado.setIntentos(scanner.nextInt());
        crearAhorcado.setIntentos(5);
        System.out.println("(HINT) #Intentos: 5");
        //scanner.next();
        return crearAhorcado;
    }
    
    public void juego(Ahorcado ahorcado){
        //Si buscar retorna falso, debe de restar 1 en intentos
        do {
            if(!buscar(ahorcado)){
            intentos(ahorcado);
            System.out.println("Palabras encontradas hasta ahora");
                System.out.println(ahorcado.getPoolEncontradas());
                if (ahorcado.getIntentos()==0) {
                    System.out.println("Se acabaron los intentos :(");
                }
            }else{
                System.out.println("¡La letra se encontro!");
                System.out.println("Palabras encontradas hasta ahora");
                System.out.println(ahorcado.getPoolEncontradas());
                System.out.println("Intentos restantes: "+ahorcado.getIntentos());
            }
            
            System.out.println("-------------------------------------------");
        } while (ahorcado.getIntentos()>0 && !comprobar(ahorcado));
    }
    
    public boolean buscar(Ahorcado ahorcado) {
        boolean encontrado = false;
        System.out.println("Ingresa una posible letra a buscar");
        String letra=scanner.nextLine().toLowerCase();
        
        //comprobar si ya se uso
        if (ahorcado.getPoolEncontradas().toLowerCase().contains(letra)) {
            System.out.println("La letra "+letra+" ya se intento");
        }else{
            if (ahorcado.getPalabra().contains(letra)) {
            encontrado = true;
            System.out.println("¡Se encontro una letra!, fue: "+letra);
            //Agregamos al pul de letras
            ahorcado.setPoolEncontradas(ahorcado.getPoolEncontradas()+letra);
            }else{
                System.out.println("La letra "+letra+" no esta dentro de "
                        + "la palabra dada.");
            }
        }
        return encontrado;
    }
    
    public void intentos(Ahorcado ahorcado){
        ahorcado.setIntentos(ahorcado.getIntentos()-1);
        System.out.println("Intentos restantes: "+ahorcado.getIntentos());
    }
    
    public boolean comprobar(Ahorcado ahorcado){
        //Palabra dada
        String palabra1 = ahorcado.getPalabra().toLowerCase();
        //Pool de letras encontradas
        String palabra2 = ahorcado.getPoolEncontradas().toLowerCase();
        
        char[] letrasPalabra1 = palabra1.toCharArray();
        
        /*NOTA*/
        //Buscara que cada caracter de la palabra dad exista en el pool 
        //de encontradas
        for (char letra : letrasPalabra1) {
            if (!palabra2.contains(String.valueOf(letra))) {
                return false;
            }
        }
        System.out.println("¡TODAS LAS PALABRAS FUERON ENCONTRADAS!");
        return true;
    }
       
}
