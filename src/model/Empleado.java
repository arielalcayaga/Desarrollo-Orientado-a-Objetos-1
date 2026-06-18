package model;
/**
 * clase con herencia Empleado
 */

public class Empleado extends Persona {
    /**
     * Atributos propios clase Empleado
     */
    private String cargo;
    private String jerarquia;
    private int sueldo;

    /**
     * Constructor Empleado
     *
     * @param nombre    nombre empleado
     * @param edad      edad empleado
     * @param esHombre  ¿Es Hombre?
     * @param rut       rut empleado
     * @param direccion dirección empleado
     * @param cargo     cargo empleado
     * @param jerarquia jerarquía dentro de la empresa (Jefe, subalterno)
     * @param sueldo    sueldo en pesos empleado
     */
    public Empleado(String nombre, int edad, boolean esHombre, String rut, Direccion direccion, String cargo, String jerarquia, int sueldo) {
        super(nombre, edad, esHombre, rut, direccion);
        this.cargo = cargo;
        this.jerarquia = jerarquia;
        this.sueldo = sueldo;
    }

    /**
     * Getters y Setters
     *
     */
    public String getCargo() {
        return cargo;
    }

    public void setCargo(String cargo) {
        this.cargo = cargo;
    }

    public String getJerarquia() {
        return jerarquia;
    }

    public void setJerarquia(String jerarquia) {
        this.jerarquia = jerarquia;
    }

    public int getSueldo() {
        return sueldo;
    }

    public void setSueldo(int sueldo) {
        this.sueldo = sueldo;
    }

    /*
    Sobreescribe el metodo mostrarInformacion clase Persona
     */

    public String mostrarInformacion(){
    super.mostrarInformacion();
        System.out.println("Cargo:" + cargo);
        System.out.println("Jerarquía: " + jerarquia);
        System.out.println("Sueldo: $ " + sueldo);
        return "";
    }

    /**
     * Metodo @Override para imprimir infórmación
     * empleados mediante "System.out.println"
     */
    @Override
    public String toString() {
      return mostrarInformacion();
    }
    }