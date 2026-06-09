/**
 * Clase Principal Persona
 */

package model;

public class Persona {
    /*
    Atributos de la clase Persona
     */
    private String nombre;
    private int edad;
    private boolean esHombre;
    private String rut;

    /**
     * Composicion de clase Direccion
     */
    private Direccion direccion;

    /**
     * Constructor clase Persona
     * @param nombre nombre persona
     * @param edad edad persona en años
     * @param esHombre ¿es hombre?
     * @param rut rut persona
     * @param direccion direccion particular persona
     */
    public Persona(String nombre, int edad, boolean esHombre, String rut, Direccion direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.esHombre = esHombre;
        this.rut = rut;
        this.direccion = direccion;
    }

    /**
     * Getters y Setters
      *
     */
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

    public boolean isEsHombre() {
        return esHombre;
    }

    public void setEsHombre(boolean esHombre) {
        this.esHombre = esHombre;
    }

    public String getRut() {
        return rut;
    }

    public void setRut(String rut) {
        this.rut = rut;
    }

    public Direccion getDireccion() {
        return direccion;
    }

    public void setDireccion(Direccion direccion) {
        this.direccion = direccion;
    }

    /**
     * Método mostrar información
     */
    public String mostrarInformacion() {
        System.out.println("Empleado:");
        System.out.println("Nombre: " + nombre);
        System.out.println("Edad: " + edad);
        System.out.println("¿Es Hombre?: " + esHombre);
        System.out.println("Rut: " + rut);
        direccion.mostrarInformacionCalle();
        return "";
    }
}

