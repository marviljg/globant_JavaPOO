/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Meses;
import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class MesesService {
    
    private Scanner entrada = new Scanner(System.in);
    
    public Meses cargarMeses(){
        Meses mesesCreados = new Meses();
        return mesesCreados;
    }
    
    public void jugar(Meses lista){
        int randomNumber = (int) (Math.random() * 12);
        int i=3;
        boolean triger = false;
        String paraAdivinar = lista.getMeses()[randomNumber];
        System.out.println("(HINT) A adivinar: "+paraAdivinar);
        String op="";
        
        while (i>0 && triger==false) {            
            System.out.println("¿Que mes podria ser?: ");
            op = entrada.nextLine().toLowerCase();
            if (op.equals(paraAdivinar)) {
                System.out.println("¡Adivinaste! el mes era: "+paraAdivinar);
                triger = true;
            }else{
                i--;
                System.out.println("Fallaste... te quedan "+i+" intentos");
            }
        }
        
    }
}
