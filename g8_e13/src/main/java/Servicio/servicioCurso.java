/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Curso;
import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class servicioCurso {
    
    Scanner entrada = new Scanner(System.in);
    
    public void cargarAlumnos(Curso nombres){
        String[] auxNombres = new String[5];
        for (int i = 0; i < auxNombres.length; i++) {
            System.out.println("Nombre del alumno "+(i+1)+": ");
            auxNombres[i]=entrada.nextLine();
        }
        nombres.setAlumnos(auxNombres);
    }
    
    public void crearCurso(Curso curs){
        servicioCurso auxServices = new servicioCurso();
        
        System.out.println("Nombre del curso: ");
        curs.setNombreCurso(entrada.nextLine());
        
        System.out.println("Cantidad de horas por día: ");
        curs.setCantidadHorasPorDia(entrada.nextInt());
        
        System.out.println("Cantidad de horas por semana: ");
        curs.setCantidadDiasPorSemana(entrada.nextInt());
        
        System.out.println("Turno del curso: am/pm");
        curs.setTurno(entrada.nextLine());
        
        System.out.println("Precio por hora: ");
        curs.setPrecioPorHora(entrada.nextDouble());
        
        System.out.println("Nombres de los alumnos: ");
        auxServices.cargarAlumnos(curs);
    }
    
    public void calcularGananciaSemanal(Curso curs){
        double profits = curs.getCantidadHorasPorDia()*curs.getPrecioPorHora()*
                curs.getAlumnos().length*curs.getCantidadDiasPorSemana();
        System.out.println("Ganancias totales: "+profits);
    }
    
    public void imprimirAlumnos(Curso curso) {
        String[] auxArray = new String[5];
        auxArray=curso.getAlumnos();
        for (int i = 0; i < auxArray.length; i++) {
            System.out.println("Nombre del alumno "+(i+1)+": ");
            System.out.println(auxArray[i]);
        }
    }
}
