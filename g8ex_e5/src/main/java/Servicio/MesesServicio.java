/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Meses;
import java.util.Calendar;
import java.util.Date;
import java.util.HashMap;
import java.util.Locale;
import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class MesesServicio {
    
    private Scanner scanner = new Scanner(System.in);
    
    public Meses cargarMeses(){
        
        Meses mesesAux = new Meses();
        
        HashMap<Integer, Date> monthMap = new HashMap<>();

        // Crear una instancia de Calendar para obtener las fechas
        Calendar calendar = Calendar.getInstance();

        // Iterar del 0 al 11 para asignar los meses a los números
        for (int i = 0; i < 12; i++) {
            // Establecer el mes en el Calendar
            calendar.set(Calendar.MONTH, i);

            // Obtener la fecha correspondiente al primer día del mes
            Date firstDayOfMonth = calendar.getTime();

            // Agregar la entrada al HashMap
            monthMap.put(i, firstDayOfMonth);
        }
        
        mesesAux.setMeses(monthMap);

        // Acceder a los meses utilizando los números
        for (int i = 0; i < 12; i++) {
            Date firstDayOfMonth = monthMap.get(i);
            calendar.setTime(firstDayOfMonth);

            // Obtener el nombre del mes y mostrarlo en la consola
            String monthName = calendar.getDisplayName(Calendar.MONTH, Calendar.LONG, Locale.getDefault());
            System.out.println("Número: " + i + ", Mes: " + monthName);
        }
        
        return mesesAux;
    }
    
    public boolean adivinarMes(Meses usarMeses){
        boolean triger = false;
        //Establecer mes aleatorio
        int randomNumber = (int) (Math.random() * 12);
        System.out.println("(HINT) El mes es: "+randomNumber);
        int i = 3;
        // Obtener fecha correspondiente al mes aleatorio
        Date randomMonth = usarMeses.getMeses().get(randomNumber);
        
        // Pedir al usuario ingresar un mes hasta que coincida con el mes aleatorio     
        while (i>0) {
            System.out.print("Ingrese el número del mes (1-12): ");
            int userGuess = scanner.nextInt()-1;

            // Comparar el mes ingresado por el usuario con el mes aleatorio
            if (userGuess == randomNumber) {
                triger = true;
                System.out.println("¡Adivinaste el mes!");
            } else {
                System.out.println("No es el mes correcto, intenta nuevamente.");
            }
            i--;
            System.out.println("Quedan "+i+" intentos.");
        }
        
        if(i>0){
            System.out.println("Adivinaste!");
            triger=true;
        }else{
            System.out.println("Fallaste adivinando");
        }

        scanner.close();
        return triger;
    }
    
}
