
package Servicio;

import Entidad.Circunferencia;
import java.util.Scanner;
import java.lang.Math;

/**
 *
 * @author PCTaller
 */
public class ServiciosCirculo {
    
    private Scanner entrada = new Scanner(System.in);
    double pi = Math.PI;
    
    public Circunferencia crearCircunferencia(){
        System.out.println("¿Radio?: ");
        int radio=entrada.nextInt();
        Circunferencia circuloCreado = new Circunferencia(radio);
        return circuloCreado;
    }
    
    public void Area(Circunferencia circuloCalcular){
        System.out.println("Area del circulo: "+(pi*Math.pow(circuloCalcular.getRadio(), 2)));
    }
    
    public void Perimetro(Circunferencia circuloCalcular){
        System.out.println("Perimetro del circulo: "+(2*pi*circuloCalcular.getRadio()));
    }
}
