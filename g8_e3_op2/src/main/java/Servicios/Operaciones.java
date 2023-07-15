/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicios;

import Entidades.Calculadora;
import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class Operaciones {
    
    Scanner entrada = new Scanner(System.in);
    
    public Calculadora cargarNumeros(){
        Calculadora cargaCompletada = new Calculadora();
        System.out.println("Valor del numero 1: ");
        cargaCompletada.setN1(entrada.nextInt());
        System.out.println("Valor del numero 2: ");
        cargaCompletada.setN2(entrada.nextInt());
        return cargaCompletada;
    }
    
    public void Sumar(Calculadora op){
        System.out.println("Suma de los números: "+(op.getN1()+op.getN2()));
    }
    
    public void Restar(Calculadora op){
        System.out.println("Resta de los números: "+(op.getN1()-op.getN2()));
    }
    
    public void Multiplicar(Calculadora op){
        if(op.getN1()==0 || op.getN2()==0){
            System.out.println("Uno de los multiplicadores es 0,");
            System.out.println("operación invalida");
        }else{
            System.out.println("Multiplicacion de los numeros: ");
            System.out.println(op.getN1()*op.getN2());
        }
    }
    
    public void Dividir(Calculadora op){
        if(op.getN2()==0){
            System.out.println("El divisor es 0,");
            System.out.println("operación invalida");
        }else{
            System.out.println("Division de los numeros: ");
            System.out.println((double)op.getN1()/op.getN2());
        }
    }
}
