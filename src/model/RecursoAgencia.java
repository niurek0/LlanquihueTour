package model;


 // superclase abstracta

public abstract class RecursoAgencia implements Registrable {

    private String codigo;
    private String descripcion;

    public RecursoAgencia(String codigo, String descripcion) {
        this.codigo = codigo;
        this.descripcion = descripcion;
    }

    // Getters y Setters
    public String getCodigo() { return codigo; }
    public void setCodigo(String codigo) { this.codigo = codigo; }

    public String getDescripcion() { return descripcion; }
    public void setDescripcion(String descripcion) { this.descripcion = descripcion; }

    @Override
    public String toString() {
        return "Código: " + codigo + " | Descripción: " + descripcion;
    }
}
