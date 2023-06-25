/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.util.Scanner;

/**
 *
 * @author PCTaller
 */
public class Operacion {
    private int n1;
    private int n2;
    
    Scanner entrada = new Scanner(System.in);

    public Operacion() {
    }
    
    public Operacion(int n1, int n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public int getN1() {
        return n1;
    }

    public void setN1(int n1) {
        this.n1 = n1;
    }

    public int getN2() {
        return n2;
    }

    public void setN2(int n2) {
        this.n2 = n2;
    }
    
    public void crearOperacion(Operacion op){
        System.out.println("¿Numero 1?: ");
        op.setN1(entrada.nextInt());
        
        System.out.println("¿Numero 2?: ");
        op.setN2(entrada.nextInt());
    }
    
    public void Sumar(Operacion op){
        System.out.println("Suma de los números: "+(op.getN1()+op.getN2()));
    }
    
    public void Restar(Operacion op){
        System.out.println("Resta de los números: "+(op.getN1()-op.getN2()));
    }
    
    public void Multiplicar(Operacion op){
        if(op.getN1()==0 || op.getN2()==0){
            System.out.println("Uno de los multiplicadores es 0,");
            System.out.println("operación invalida");
        }else{
            System.out.println("Multiplicacion de los numeros: ");
            System.out.println(op.getN1()*op.getN2());
        }
    }
    
    public void Dividir(Operacion op){
        if(op.getN2()==0){
            System.out.println("El divisor es 0,");
            System.out.println("operación invalida");
        }else{
            System.out.println("Division de los numeros: ");
            System.out.println((double)op.getN1()/op.getN2());
        }
    }
}
