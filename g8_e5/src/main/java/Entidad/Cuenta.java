package Entidad;

import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class Cuenta {
    
    private static Scanner entrada = new Scanner(System.in);
    private int numeroCuenta;
    private double saldoActual;
    private long dni;

    public Cuenta() {
    }

    public Cuenta(int numeroCuenta, double saldoActual, long dni) {
        this.numeroCuenta = numeroCuenta;
        this.saldoActual = saldoActual;
        this.dni = dni;
    }

    public int getNumeroCuenta() {
        return numeroCuenta;
    }

    public void setNumeroCuenta(int numeroCuenta) {
        this.numeroCuenta = numeroCuenta;
    }

    public double getSaldoActual() {
        return saldoActual;
    }

    public void setSaldoActual(double saldoActual) {
        this.saldoActual = saldoActual;
    }

    public double getDni() {
        return dni;
    }

    public void setDni(long dni) {
        this.dni = dni;
    }
    
    public static Cuenta crearCuenta(){
        System.out.println("¿Numero de cuenta?: ");
        //int nC = entrada.nextInt();
        int nC = 2133033880;
        System.out.println("¿Saldo actual?: ");
        //int sA = entrada.nextInt();
        int sA = 900000;
        System.out.println("¿Numero de DNI?: ");
        //long nDNI = entrada.nextLong(); 
        int nDNI = 123456;
        return new Cuenta(nC, sA, nDNI);
    }
    
    public static void ingresar(double ingreso, Cuenta cN){
        System.out.println("(INGRESAR) Saldo anterior: "+cN.getSaldoActual());
        cN.setSaldoActual(ingreso+cN.getSaldoActual());
        System.out.println("(INGRESAR) Saldo nuevo: "+cN.getSaldoActual());
    }
    
    public static void retirar(double retiro, Cuenta cN){
        System.out.println("(RETIRAR) Saldo anterior: "+cN.getSaldoActual());
        cN.setSaldoActual(cN.getSaldoActual()-(int)retiro);
        System.out.println("(RETIRAR) Saldo nuevo: "+cN.getSaldoActual());
    }
    
    public static void extraccionRapida(double porcentaje,Cuenta cN){
        if (porcentaje>20){
            System.out.println("Cantidad incorrecta");
        }else{
            System.out.println("(EXTRAC RAPIDA) Saldo anterior: "+cN.getSaldoActual());
            System.out.println("Supuesto: "+(1-porcentaje/100));
            System.out.println("Supuesto: "+(porcentaje/100));
            cN.setSaldoActual((1-porcentaje/100)*cN.getSaldoActual());
            System.out.println("(EXTRAC RAPIDA) Saldo nuevo: "+cN.getSaldoActual());
        }
    }
    
    public static void consultarSaldo(Cuenta cN){
        System.out.println("Saldo actual: "+cN.getSaldoActual());
    }
    
    public static void consultarDatos(Cuenta cN){
        System.out.println("Datos de la cuenta: ");
        System.out.println(cN.toString());
    }

    @Override
    public String toString() {
        return "Cuenta{" + "numeroCuenta=" + numeroCuenta + ", saldoActual=" + saldoActual + ", dni=" + dni + '}';
    }
      
}
