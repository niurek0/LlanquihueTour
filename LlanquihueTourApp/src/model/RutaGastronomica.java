package model;

//  Subclase RutaGastronomica hereda de ServicioTuristico los atributos "nombre" y "duracionHoras",y agrega su propio atributo específico: numeroDeParadas.

public class RutaGastronomica extends ServicioTuristico {

    // atributo específico de esta subclase
    private int numeroDeParadas;

    //Constructor: llama al constructor de la superclase con super(...)

    public RutaGastronomica(String nombre, double duracionHoras, int numeroDeParadas) {
        super(nombre, duracionHoras); // Llama al constructor de ServicioTuristico
        this.numeroDeParadas = numeroDeParadas;
    }

    // Getter y Setter del atributo propio
    public int getNumeroDeParadas() {
        return numeroDeParadas;
    }

    public void setNumeroDeParadas(int numeroDeParadas) {
        this.numeroDeParadas = numeroDeParadas;
    }

    // toString mostrando atributos propios y heredados.
    @Override
    public String toString() {
        return "[Ruta Gastronómica]" +
                "\n  Nombre        : " + getNombre() +
                "\n  Duración      : " + getDuracionHoras() + " horas" +
                "\n  N° de paradas : " + numeroDeParadas;
    }
}
