package model;

/**
 * Subclase ExcursionCultural.
 * Hereda de ServicioTuristico y agrega el atributo específico: lugarHistorico.
 */
public class ExcursionCultural extends ServicioTuristico {

    // Atributo específico de esta subclase
    private String lugarHistorico;

    /**
     * Constructor: usa super(...) para inicializar los atributos de la superclase.
     */
    public ExcursionCultural(String nombre, double duracionHoras, String lugarHistorico) {
        super(nombre, duracionHoras); // Llama al constructor de ServicioTuristico
        this.lugarHistorico = lugarHistorico;
    }

    // Getter y Setter del atributo propio
    public String getLugarHistorico() {
        return lugarHistorico;
    }

    public void setLugarHistorico(String lugarHistorico) {
        this.lugarHistorico = lugarHistorico;
    }

    // mostrando atributos propios y heredados.
    @Override
    public String toString() {
        return "[Excursión Cultural]" +
                "\n  Nombre          : " + getNombre() +
                "\n  Duración        : " + getDuracionHoras() + " horas" +
                "\n  Lugar histórico : " + lugarHistorico;
    }
}
