package Entidad;

import java.util.Scanner;

/**
 *
 * @author jpc
 */


public class Rectangulo {
    
    private static Scanner entrada = new Scanner(System.in);

    private int base;
    private int altura;

    public Rectangulo() {
    }

    public Rectangulo(int base, int altura) {
        this.base = base;
        this.altura = altura;
    }

    //Crear Rectangulo con datos del usuario
    /**
     * Desde la misma clae, pide los atributos base y altura,
     * los pasa como parámetros para la instancia de un nuevo 
     * objeto, y lo regresa con esos valores.
     * @return unObjetoClaseRectangulo
     */
    public static Rectangulo crearRectanguloUser(){
        System.out.println("¿Base del rectangulo?: ");
        int bas = entrada.nextInt();
        
        System.out.println("¿Altura del rectangulo?: ");
        int alt = entrada.nextInt();
        
        //Crea el objeto rectangulo
        return new Rectangulo(bas, alt);
    }
    public int getBase() {
        return base;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }
    
    public void superficie(Rectangulo rec){
        System.out.println("Superficie es: ");
        System.out.println(rec.getBase()*rec.getAltura());
    }
    
    public void perimetro(Rectangulo rec){
        System.out.println("Perimetro es: ");
        System.out.println(rec.getAltura()*2+rec.getBase()*2);
    }
    
    public void dibujar(Rectangulo rec){
        for (int i = 0; i < rec.getAltura(); i++) {
            for (int j = 0; j < rec.getBase(); j++) {
                System.out.print("* ");
            }
        System.out.println(" ");
        }
    }
}
