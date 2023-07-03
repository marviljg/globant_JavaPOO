/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.ejemplojavautildate;

import java.text.SimpleDateFormat;
import java.util.Date;

public class EjemploJavaUtilDate {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        //Creamos instancias
        Date fecha = new Date();
        System.out.println("Date sin cambios: "+fecha);
        //Ddd Mmm dd hh:mm:ss DTM AAA
        //Estara en formato estandar en inglés
        
        //Se customiza con SimpleDateFormat
        //En SimpleDateFormat() va le formato a usar
        //Usaremos, aquí, un estandar
        SimpleDateFormat df = new SimpleDateFormat("EEEE dd 'de' MMMM, yyyy");
        //Asignamos para cambiar su formato de salida al dado
        //Se pone la salida en una String
        String fechaStr = df.format(fecha);
        //Ya dara la salida formateada
        System.out.println("fechaStr: "+fechaStr);
    }
}
