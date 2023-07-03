package com.mycompany.ejemplojavautildate;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;

public class StringToDate {
    
    public static void main(String[] args) {
        
        Scanner entrada = new Scanner(System.in);
        
        //Esto especifica el formato
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd");
        
        //Se debe de rodear con un try/catch
        try {
            //Date fecha = formato.parse("1989-04-16");
            //Igresado por el usuario
            System.out.println("Ingresa fecha con formato yyyy-MM-dd");
            Date fecha = formato.parse(entrada.next());
            //Sun Apr 16 00:00:00 CST 1989
            System.out.println("Print de date: "+fecha);
            //1989-04-16
            System.out.println("Print desde format: "+formato.format(fecha));
            
            Date fecha2 = formato.parse(entrada.next());
            
            //Comparar fechas, con retorno booleano
            if (fecha.after(fecha2)) {
                System.out.println("Fecha 1 es mayor que la 2");
            }
            
            //Comparar fechas, con retorno numerico
            if (fecha.compareTo(fecha2)>0) {
                System.out.println("Fecha 1 es mayor que fecha 2");
            }
            
        } catch (ParseException ex) {
            Logger.getLogger(StringToDate.class.getName()).log(Level.SEVERE, null, ex);
        }
        

    }
}

