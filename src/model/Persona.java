package model;

public class Persona {

    private String nombre;
    private String rut;
    private String correo;
    private Direccion direccion;

    public Persona(String nombre, String rut, String correo, Direccion direccion) {
        this.nombre = nombre;
        this.rut = rut;
        this.correo = correo;
        this.direccion = direccion;
    }

    public String getNombre() { return nombre; }
    public void setNombre(String nombre) { this.nombre = nombre; }

    public String getRut() { return rut; }
    public void setRut(String rut) { this.rut = rut; }

    public String getCorreo() { return correo; }
    public void setCorreo(String correo) { this.correo = correo; }

    public Direccion getDireccion() { return direccion; }
    public void setDireccion(Direccion direccion) { this.direccion = direccion; }

    @Override
    public String toString() {
        return "Persona{" +
               "nombre='" + nombre + '\'' +
               ", rut='" + rut + '\'' +
               ", correo='" + correo + '\'' +
               ", direccion=" + direccion +
               '}';
    }
}
