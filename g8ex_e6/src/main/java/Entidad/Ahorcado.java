/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author jpc
 */
public class Ahorcado {
     private String palabra;
     private int intentos;
     private int encontradas;
     private String poolEncontradas="";

    public Ahorcado() {
    }

    public Ahorcado(String palabra, int intentos) {
        this.palabra = palabra;
        this.intentos = intentos;
    }

    public String getPalabra() {
        return palabra;
    }

    public void setPalabra(String palabra) {
        this.palabra = palabra;
    }

    public int getIntentos() {
        return intentos;
    }

    public void setIntentos(int intentos) {
        this.intentos = intentos;
    }

    public int getEncontradas() {
        return encontradas;
    }

    public void setEncontradas(int encontradas) {
        this.encontradas = encontradas;
    }

    public String getPoolEncontradas() {
        return poolEncontradas;
    }

    public void setPoolEncontradas(String poolEncontradas) {
        this.poolEncontradas = poolEncontradas;
    }
     
}
