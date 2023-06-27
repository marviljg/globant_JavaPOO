package com.mycompany.g8_e5;

import Entidad.Cuenta;

/**
 *
 * @author jpc
 */
public class G8_e5 {

    public static void main(String[] args) {
        System.out.println("Abajo es crear cuenta: ");
        //Devolvera una clase que se puede guardar en el objeto creado
        Cuenta c1 = Cuenta.crearCuenta();
        
        c1.ingresar(250,c1);
        c1.retirar(200,c1);
        c1.extraccionRapida(30,c1);
        c1.extraccionRapida(10,c1);
        c1.consultarSaldo(c1);
        c1.consultarDatos(c1);
    }
}
