/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author jpc
 */
public class Movil {
    //Un solo movil por objeto instanciado
    private String marca;
    private float precio;
    private String modelo;
    private byte memoriaRAM;
    private short almacenamiento;
    //En cada indice va un unico digito.
    private int[] codigo = new int[7];

    public Movil() {
    }

    public Movil(String marca, float precio, String modelo, byte memoriaRAM, short almacenamiento) {
        this.marca = marca;
        this.precio = precio;
        this.modelo = modelo;
        this.memoriaRAM = memoriaRAM;
        this.almacenamiento = almacenamiento;
    }

    public String getMarca() {
        return marca;
    }

    public void setMarca(String marca) {
        this.marca = marca;
    }

    public float getPrecio() {
        return precio;
    }

    public void setPrecio(float precio) {
        this.precio = precio;
    }

    public String getModelo() {
        return modelo;
    }

    public void setModelo(String modelo) {
        this.modelo = modelo;
    }

    public byte getMemoriaRAM() {
        return memoriaRAM;
    }

    public void setMemoriaRAM(byte memoriaRAM) {
        this.memoriaRAM = memoriaRAM;
    }

    public short getAlmacenamiento() {
        return almacenamiento;
    }

    public void setAlmacenamiento(short almacenamiento) {
        this.almacenamiento = almacenamiento;
    }

    public int[] getCodigo() {
        return codigo;
    }

    public void setCodigo(int[] codigo) {
        this.codigo = codigo;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("Movil{");
        sb.append("marca=").append(marca);
        sb.append(", precio=").append(precio);
        sb.append(", modelo=").append(modelo);
        sb.append(", memoriaRAM=").append(memoriaRAM);
        sb.append(", almacenamiento=").append(almacenamiento);
        sb.append(", codigo=").append(codigo);
        sb.append('}');
        return sb.toString();
    }

    
    
    
    
}
