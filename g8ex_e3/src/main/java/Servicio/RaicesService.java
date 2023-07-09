/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Raices;
import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class RaicesService {
    
    private Scanner ent = new Scanner(System.in);
    
    public  Raices crearRaices(){
        Raices raizCreada = new Raices();
        System.out.println("Valor de a: ");
        raizCreada.setA(ent.nextDouble());
        System.out.println("Valor de a: ");
        raizCreada.setB(ent.nextDouble());
        System.out.println("Valor de a: ");
        raizCreada.setC(ent.nextDouble());
        return raizCreada;
    }
    
    public double getDiscriminante(Raices raiz){
        double discriminante=0;
        discriminante=(Math.pow(raiz.getB(), 2))-4*raiz.getA()*raiz.getC();
        System.out.println("Valor del discriminante calculado ");
        System.out.println(discriminante);
        return discriminante;
    }
    
    public boolean tieneRaices(double discriminante){
        boolean triger=false;
        if (discriminante>0) {
            triger=true;
        }
        return triger;
    }
    
    public boolean tieneRaiz(double discriminante){
        boolean triger=false;
        if (discriminante==0) {
            triger=true;
        }
        return triger;
    }
    
    public double[] obtenerRaices(Raices raiz, double discriminante){
        double[] aux = new double[2];
        aux[0]=(-1*raiz.getB()+Math.sqrt(discriminante))/(2*raiz.getA());
        aux[1]=(-1*raiz.getB()-Math.sqrt(discriminante))/(2*raiz.getA());
        return aux;
    }
}
