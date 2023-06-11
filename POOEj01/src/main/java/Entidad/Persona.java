
package Entidad;

/**
 *
 * @author jpc
 */
public class Persona {
    public String nombre;
    public int edad;
    public char sexo;

    // Este es un constructor vacio
    public Persona() {
    }

    // Este es un constructor por parámetros
    public Persona(String nombre, int edad, char sexo) {
        // Se usa this para los atributos (this.nombre)
        // del identificador del parámetro (E.g. int edad) 
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        this.edad = edad;
    }

    public char getSexo() {
        return sexo;
    }

    public void setSexo(char sexo) {
        this.sexo = sexo;
    }

    @Override
    public String toString() {
        return "Persona{" + "nombre=" + nombre + ", edad=" + edad + ", sexo=" + sexo + '}';
    }
    
         
}
