/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.mycompany.ejemplojavautildate;

import java.util.Date;

/**
 *
 * @author jpc
 */
public class DateRendimiento {
    
    public static void main(String[] args) {
        Date fechaInicio = new Date();
        
        long j=0;
        for (int i = 0; i < 999999999; i++) {
            j+=i;
        } 
        Date fechaFin = new Date();
        long tiempoTotal = fechaFin.getTime()- fechaInicio.getTime();
        System.out.println("Tiempo total transcurido: ");
        System.out.println(tiempoTotal);
    } 
}
