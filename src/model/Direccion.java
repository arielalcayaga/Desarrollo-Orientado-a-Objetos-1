/**
Clase con composición Dirección
 */
package model;

/**
 * Atributos Clase Dirección
 */
public class Direccion {
    private String calle;
    private int numeroCasa;
    private String comuna;
    private String ciudad;

    /**
     * Constructor clase Dirección
     *
     * @param calle      calle persona
     * @param numeroCasa numero de casa persona
     * @param comuna     comuna de persona
     * @param ciudad     ciudad de persona
     */
    public Direccion(String calle, int numeroCasa, String comuna, String ciudad) {
        this.calle = calle;
        this.numeroCasa = numeroCasa;
        this.comuna = comuna;
        this.ciudad = ciudad;
    }

    /**
     * Getters y Setters
     */
    public String getCalle() {
        return calle;
    }

    public void setCalle(String calle) {
        this.calle = calle;
    }

    public int getNumeroCasa() {
        return numeroCasa;
    }

    public void setNumeroCasa(int numeroCasa) {
        this.numeroCasa = numeroCasa;
    }

    public String getComuna() {
        return comuna;
    }

    public void setComuna(String comuna) {
        this.comuna = comuna;
    }

    public String getCiudad() {
        return ciudad;
    }

    public void setCiudad(String ciudad) {
        this.ciudad = ciudad;
    }

    /**
     * Método mostrarInformacionCale
     */
    public void mostrarInformacionCalle() {
        System.out.println("Calle: " + calle);
        System.out.println("Número casa: " + numeroCasa);
        System.out.println("Comuna: " + comuna);
        System.out.println("Ciudad: " + ciudad);
    }
}

