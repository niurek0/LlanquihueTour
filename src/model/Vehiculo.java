package model;

// hereda: codigo, descripcion (de RecursoAgencia)

public class Vehiculo extends RecursoAgencia {

    private String patente;

    public Vehiculo(String codigo, String descripcion, String patente) {
        super(codigo, descripcion);
        this.patente = patente;
    }

    // Getter y Setter
    public String getPatente() { return patente; }
    public void setPatente(String patente) { this.patente = patente; }

    @Override
    public void mostrarResumen() {
        System.out.println(obtenerResumen());
    }

    @Override
    public String obtenerResumen() {
        return "[Vehículo]\n" +
               "  Código      : " + getCodigo() + "\n" +
               "  Descripción : " + getDescripcion() + "\n" +
               "  Patente     : " + patente;
    }

    @Override
    public String toString() {
        return obtenerResumen();
    }
}
