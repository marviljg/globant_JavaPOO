/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.g8_e13;

import Entidad.Curso;
import Servicio.servicioCurso;

/**
 *
 * @author jpc
 */
public class G8_e13 {

    public static void main(String[] args) {
        System.out.println("Hello World!");
        
        servicioCurso serviciosAlumn = new servicioCurso();
        Curso cursoUno = new Curso();
        
        serviciosAlumn.crearCurso(cursoUno);
        System.out.println("Info curso: ");
        System.out.println(cursoUno.toString());
        System.out.println("Alumnos del curso: ");
        serviciosAlumn.imprimirAlumnos(cursoUno);
        serviciosAlumn.calcularGananciaSemanal(cursoUno);
    }
}
