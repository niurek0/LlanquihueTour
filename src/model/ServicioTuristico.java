package model;

// Superclase ServicioTuristico contiene los atributos y metodos a todos los servicios turísticos.

public class ServicioTuristico {

    // Atributos comunes a todos los servicios turísticos
    private String nombre;
    private double duracionHoras;

    /**
     * Constructor de la superclase.
     * Las subclases llamarán a este constructor usando super(...).
     */
    public ServicioTuristico(String nombre, double duracionHoras) {
        this.nombre = nombre;
        this.duracionHoras = duracionHoras;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public double getDuracionHoras() {
        return duracionHoras;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setDuracionHoras(double duracionHoras) {
        this.duracionHoras = duracionHoras;
    }

    /**
     * toString() base: las subclases lo sobrescribirán con @Override
     * para agregar su información específica.
     */
    @Override
    public String toString() {
        return "ServicioTuristico{nombre='" + nombre + "', duracionHoras=" + duracionHoras + "}";
    }
}
