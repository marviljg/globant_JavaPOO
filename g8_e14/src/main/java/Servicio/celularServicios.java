/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Servicio;

import Entidad.Movil;
import java.util.Scanner;

/**
 *
 * @author jpc
 */
public class celularServicios {
    
    Scanner entrada = new Scanner(System.in);
    
    public Movil cargarCelular( ){
        Movil crearMovil = new Movil();
        
        System.out.println("Marca del celular: ");
        //crearMovil.setMarca(entrada.nextLine());
        crearMovil.setMarca("Google");
        
        System.out.println("Precio del celular: ");
        //crearMovil.setPrecio(entrada.nextFloat());
        //entrada.nextLine();
        crearMovil.setPrecio(4000);
        
        System.out.println("Modelo del celular: ");
//        crearMovil.setModelo(entrada.nextLine());
        crearMovil.setModelo("4 XL");
        
        System.out.println("Memoria ram del celular: ");
//        crearMovil.setMemoriaRAM(entrada.nextByte());
        crearMovil.setMemoriaRAM((byte)6);

        System.out.println("Almacenamiento del celular: ");
        //crearMovil.setAlmacenamiento(entrada.nextShort());
        crearMovil.setAlmacenamiento((short)64);
        
        ingresarCodigo(crearMovil);
        
        return crearMovil;
    }
    
    public void ingresarCodigo(Movil movilAux){
        int[] auxArray = new int[7];
        
        System.out.println("Codigo del celular (un digito a la vez)");
        for (int i = 0; i < auxArray.length; i++) {
            System.out.println("Codigo numero "+(i+1)+": ");
            auxArray[i]=entrada.nextInt();
        }
        movilAux.setCodigo(auxArray);
    }
    
    public String imprimirInformacion(Movil movilAux){
        StringBuilder sb = new StringBuilder();
        int[] auxArray = new int[7];
        auxArray=movilAux.getCodigo();
        
        sb.append("Movil{");
        sb.append("marca=").append(movilAux.getMarca());
        sb.append(", precio=").append(movilAux.getPrecio());
        sb.append(", modelo=").append(movilAux.getModelo());
        sb.append(", memoriaRAM=").append(movilAux.getMemoriaRAM());
        sb.append(", almacenamiento=").append(movilAux.getAlmacenamiento());
        
        sb.append(", codigo=");
        for (int i = 0; i < auxArray.length; i++) {
            sb.append(auxArray[i]);
        }
        sb.append('}');
        
        return sb.toString();       
    }
    
}
