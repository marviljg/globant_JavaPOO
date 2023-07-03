package com.mycompany.ejemplojavautildate;

import com.sun.jdi.PathSearchingVirtualMachine;
import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class FechaConClaseCALENDAR {
    
    public static void main(String[] args) {
     
        //Es clase abstracta; no usa new sino .getInstance()
        Calendar calendario = Calendar.getInstance();
        
        //Esta es la fecha actual. La obtenemos de una
        //clase Calendar
        //La obtuvimos pasando a un tipo Date pero,
        //pudimos usar calendario.getTime() directo
        Date fecha = calendario.getTime();
        System.out.println("Fecha de calendar: "+fecha);
        System.out.println("Fecha de calendar: "+calendario.getTime());
        
        //Modificamos la fecha con parámetros
        calendario.set(2052, 8, 23, 16, 59, 32);
        //Ver detalles. E.g. mes empieza n 0, entre otros
        System.out.println("Fecha por parametros: "+calendario.getTime());
        
        //Colocando valores individuales como un setter
        //Calendar.set(Calendar.[TIEMPO], valor)
        calendario.set(Calendar.YEAR, 2032);
        calendario.set(Calendar.MONTH, 0);
        calendario.set(Calendar.DAY_OF_MONTH, 21);
        //24 ya cambia al siguiente día, 0 es el inicio del día
        calendario.set(Calendar.HOUR, 17);
        //Hora con formato AM/PM
        calendario.set(Calendar.HOUR, 7);
        calendario.set(Calendar.AM_PM, Calendar.PM);
        calendario.set(Calendar.MINUTE, 21);
        calendario.set(Calendar.SECOND, 10);
        System.out.println("Parametros individuales: "+calendario.getTime());
        
        //o, puede ser pasando a fecha
        Date fecha2 = calendario.getTime();
        System.out.println("Con clase tipo Date: "+fecha2);
        
        //Formateamos una salida
        SimpleDateFormat formato = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        //Con formato de 12 horas
        SimpleDateFormat formato2 = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss");
        //Pasamos el formato a un string
        String fechaConFormato = formato.format(fecha);
        System.out.println("Fecha con formato: "+fechaConFormato);
        
        String fechaConFormato2 = formato2.format(fecha);
        System.out.println("Fecha con formato: "+fechaConFormato2);
    }    
}
