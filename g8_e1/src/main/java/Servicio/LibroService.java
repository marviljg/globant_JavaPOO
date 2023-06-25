/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Libro;
import java.util.Scanner;

/**
 *
 * @author PCTaller
 */
public class LibroService {
    
    Scanner entrada = new Scanner(System.in);
    
    public Libro cargarLibro(){
        Libro libroCreado = new Libro();
        
        System.out.println("ISBN del libro: ");
        libroCreado.setIsbn(entrada.nextLine());
        
        System.out.println("Título del libro: ");
        libroCreado.setTitulo(entrada.nextLine());
        
        System.out.println("Autor del libro: ");
        libroCreado.setAutor(entrada.nextLine());
        
        System.out.println("#Paginas del libro: ");
        libroCreado.setNumPages(entrada.nextInt());
        
        return libroCreado;
    }
    
    public void mostrarLibro(Libro libroRequerido){
        System.out.println("Información del libro: ");
        System.out.println(libroRequerido.toString());
    }
}
