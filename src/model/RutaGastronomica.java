package model;


public class RutaGastronomica extends ServicioTuristico {

    // atributo especifico de esta subclase
    private int numeroDeParadas;

    public RutaGastronomica(String nombre, double duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras); // llamamos al constructor de ServicioTuristico
        this.numeroDeParadas = numeroDeParadas;
    }

    // Getter y Setter del atributo propio
    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    @Override
    public String toString() {
        return "[Ruta Gastronómica]" +
                "\n  Nombre        : " + getNombre() +
                "\n  Duración      : " + getDuracionHoras() + " horas" +
                "\n  N° de paradas : " + numeroDeParadas;
    }
}
