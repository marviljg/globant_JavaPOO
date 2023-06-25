package com.mycompany.mascotapp.entidades;

/**
 *
 * @author jpc
 */
public class Mascota {
    
    private String nombre;
    private String apodo;
    // conejo, gato, perro, loro, carpincho.
    private String tipo;
    private String color;
    private int edad;
    private boolean cola;
    private String raza;
    // Atributo para pasear
    private int energia;
    
    // El constructor vacio es el por ddefecto,
    // no es neecesario declararlo
    public Mascota( ) {
        energia = 1000;
    }

    // Este es un tipo de constructor explicito.
    public Mascota(String nombre, String apodo, String tipo, String color, int edad, boolean cola, String raza) {
        this.nombre = nombre;
        this.apodo = apodo;
        this.tipo = tipo;
        this.color = color;
        this.edad = edad;
        this.cola = cola;
        this.raza = raza;
        energia = 1000;
    }  

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getApodo() {
        return apodo;
    }

    public void setApodo(String apodo) {
        this.apodo = apodo;
    }

    public String getTipo() {
        return tipo;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public boolean isCola() {
        return cola;
    }

    public void setCola(boolean cola) {
        this.cola = cola;
    }

    public String getRaza() {
        return raza;
    }

    public void setRaza(String raza) {
        this.raza = raza;
    }

    public int getEnergia() {
        return energia;
    }

    public void setEnergia(int energia) {
        this.energia = energia;
    }
    
    // Cada que se paea, restara energía.
    public int pasear(int energiaRestar){
        //Como no es redundante, podemos usar "energia"
        //energia=energia-energiaRestar;
        energia-=energiaRestar;
        return energia;
    }
    
    // Cada que se paea, restara energía.
    // E.g. de sobrecarga de métodos.
    /**
     * Funcion para pasear, resta energia con cada vuelta.
     * @param energiaRestar
     * @param vueltas
     * @return energia
     */
    public int pasear(int energiaRestar, int vueltas){
        for (int i = 0; i < vueltas; i++) {
            energia-=energiaRestar;
        }
        return energia;
    }

    @Override
    public String toString() {
        return "Mascota{" + "nombre=" + nombre + ", apodo=" + apodo + ", tipo=" + tipo + ", color=" + color + ", edad=" + edad + ", cola=" + cola + ", raza=" + raza + ", energia=" + energia + '}';
    }
        
}
