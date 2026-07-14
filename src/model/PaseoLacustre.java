package model;

// subclase PaseoLacustre hereda de ServicioTuristico y agrega el atributo tipoEmbarcacion.

public class PaseoLacustre extends ServicioTuristico {

    // atributo específico de esta subclase
    private String tipoEmbarcacion;


    public PaseoLacustre(String nombre, double duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras); // Llama al constructor de ServicioTuristico
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    // Getter y Setter del atributo propio
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    // toString mostrando atributos propios y heredados.
    @Override
    public String toString() {
        return "[Paseo Lacustre]" +
                "\n  Nombre           : " + getNombre() +
                "\n  Duración         : " + getDuracionHoras() + " horas" +
                "\n  Tipo embarcación : " + tipoEmbarcacion;
    }
}
