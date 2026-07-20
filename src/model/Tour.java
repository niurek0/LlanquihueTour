package model;

public class Tour {

    // Atributos del tour
    private String nombre;
    private String tipo;        // Ej: "gastronómico", "lacustre", "cultural"
    private int duracionMinutos;

    // Constructor:
    public Tour(String nombre, String tipo, int duracionMinutos) {
        this.nombre = nombre;
        this.tipo = tipo;
        this.duracionMinutos = duracionMinutos;
    }

    // Getters
    public String getNombre() {
        return nombre;
    }

    public String getTipo() {
        return tipo;
    }

    public int getDuracionMinutos() {
        return duracionMinutos;
    }

    // Setters
    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public void setTipo(String tipo) {
        this.tipo = tipo;
    }

    public void setDuracionMinutos(int duracionMinutos) {
        this.duracionMinutos = duracionMinutos;
    }

    @Override
    public String toString() {
        return "Tour{" +
                "nombre='" + nombre + '\'' +
                ", tipo='" + tipo + '\'' +
                ", duracionMinutos=" + duracionMinutos +
                '}';
    }
}
