package model;

public class ServicioTuristico {

    // atributosscomunes a todos los servicios turísticos
    private String nombre;
    private double duracionHoras;

    // constructor
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

    @Override
    public String toString() {
        return "ServicioTuristico{nombre='" + nombre + "', duracionHoras=" + duracionHoras + "}";
    }
}
