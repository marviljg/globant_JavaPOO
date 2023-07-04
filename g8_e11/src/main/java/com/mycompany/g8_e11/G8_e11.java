/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g8_e11;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;
import java.util.Date;
import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class G8_e11 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        Scanner entrada = new Scanner(System.in);
        System.out.println("Ingresa el año: aaaa");
        //int anio = entrada.nextInt();
        int anio=1989;
        System.out.println("Ingresa el mes: mm");
        //int mes = entrada.nextInt();
        int mes=04;
        System.out.println("Ingresa el día: dd");
        //int dia = entrada.nextInt();
        int dia=16;
        Date fechaIngresada = new Date(anio-1900, mes, dia);
        System.out.println("Fecha ingresada: "+fechaIngresada);
        Date fechaActual = new Date();
        System.out.println("Fecha actual: "+fechaActual);
       
        System.out.println("Diferencia de años: "+(fechaActual.getYear()-fechaIngresada.getYear()));
        
        //FORMA 2: 
        LocalDate fechaIngresadaLD = LocalDate.of(anio, mes, dia);
        LocalDate fechaActualLD = LocalDate.now();

        // Calcular la diferencia en días
        long diferenciaEnDias = ChronoUnit.DAYS.between(fechaIngresadaLD, fechaActualLD);

        // Imprimir la diferencia en días
        System.out.println("La diferencia en días es: " + diferenciaEnDias);
    }
}
