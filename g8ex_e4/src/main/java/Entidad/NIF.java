/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Entidad;

/**
 *
 * @author jpc
 */
public class NIF {
    private String dni;
    private String letra;

    public NIF() {
    }

    public NIF(String dni, String letra) {
        this.dni = dni;
        this.letra = letra;
    }

    public String getDni() {
        return dni;
    }

    public void setDni(String dni) {
        this.dni = dni;
    }

    public String getLetra() {
        return letra;
    }

    public void setLetra(String letra) {
        this.letra = letra;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append("NIF{");
        sb.append("dni=").append(dni);
        sb.append(", letra=").append(letra);
        sb.append('}');
        return sb.toString();
    }
    
}
