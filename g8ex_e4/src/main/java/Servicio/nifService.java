/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.NIF;
import java.util.HashSet;
import java.util.Scanner;
import java.util.Set;

/**
 *
 * @author jpc
 */
public class nifService {
    private Scanner ent = new Scanner(System.in);
    
    private String[] letras = {"T", "R", "W", "A", "G", "M", "Y", "F", "P", "D",
        "X", "B", "N", "J", "Z", "S", "Q", "V", "H", "L", "C", "K", "E"};
    
    public NIF crearNIF(){
        NIF nifCreado = new NIF();
        System.out.println("Ingrese su DNI (8 digitos)");
        //String dniAux = ent.nextLine();
        String dniAux = "00395469";
        nifCreado.setDni(dniAux);
        String dniSinCerosIniciales = dniAux.replaceFirst("^0+", "");
        long dniAuxLONG = Long.parseLong(dniSinCerosIniciales);
        nifCreado.setLetra(letras[(int)dniAuxLONG%23]);
        return nifCreado;
    }
    
    public void mostrarNIF(NIF nifUsar){
        StringBuilder sb = new StringBuilder();
        sb.append(nifUsar.getDni());
        sb.append("-");
        sb.append(nifUsar.getLetra());
        System.out.println("NIF: "+sb);
    }
}
