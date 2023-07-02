/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

import java.awt.image.ShortLookupTable;

/**
 *
 * @author jpc
 */
public class Matematica {
    private double n1;
    private double n2;

    public Matematica() {
    }

    public Matematica(double n1, double n2) {
        this.n1 = n1;
        this.n2 = n2;
    }

    public double getN1() {
        return n1;
    }

    public void setN1(double n1) {
        this.n1 = n1;
    }

    public double getN2() {
        return n2;
    }

    public void setN2(double n2) {
        this.n2 = n2;
    }

    public double devolverMayor(Matematica mat){
        return Double.max(mat.getN1(), mat.getN2());
    }
    
    //b) Método calcularPotencia() para calcular la potencia del mayor valor de la clase
    //elevado al menor número. Previamente se deben redondear ambos valores.
    public void calcularPotencia(Matematica mat){
        System.out.println("Potencia: ");
        System.out.println(Math.pow((int)Double.max(mat.getN1(), mat.getN2()), (int)Double.min(mat.getN1(), mat.getN2())));
    }
    
    //c) Método calculaRaiz(), para calcular la raíz cuadrada del menor de los dos valores.
    //Antes de calcular la raíz cuadrada se debe obtener el valor absoluto del número.
    public void calculaRaiz(Matematica mat){
        //Math.sqrt(Math.abs(Double.min(mat.getN1(), mat.getN2())));
        System.out.println("Raíz cuadrada del menor de los numeros: ");
        System.out.println(Math.sqrt(Math.abs(Double.min(mat.getN1(), mat.getN2()))));
    }
    
    @Override
    public String toString() {
        return "Matematica{" + "n1=" + n1 + ", n2=" + n2 + '}';
    }
}
