package model;

// Superclase abstracta

public abstract class Persona implements Registrable {

    // Atributos comunes a todas las personas del sistema
    private String nombre;
    private String rut;

    // Constructor, estos los llamo con super dentro de las subclases
    public Persona(String nombre, String rut) {
        this.nombre = nombre;
        this.rut = rut;
    }

    // Getters y Setters
    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    // las subclases agregan los valores necesarios luego
    @Override
    public String toString() {
        return "Nombre: " + nombre + " | RUT: " + rut;
    }
}
