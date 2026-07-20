package model;


// Subclase hereda de ServicioTuristico y agrega  atributo tipoEmbarcacion.

public class PaseoLacustre extends ServicioTuristico {

    private String tipoEmbarcacion;

    // Constructor
    public PaseoLacustre(String nombre, double duracionHoras, String tipoEmbarcacion) {
        super(nombre, duracionHoras); // Llama al constructor de ServicioTuristico
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    // Getter y Setter
    public String getTipoEmbarcacion() {
        return tipoEmbarcacion;
    }

    public void setTipoEmbarcacion(String tipoEmbarcacion) {
        this.tipoEmbarcacion = tipoEmbarcacion;
    }

    @Override
    public String toString() {
        return "[Paseo Lacustre]" +
                "\n  Nombre           : " + getNombre() +
                "\n  Duración         : " + getDuracionHoras() + " horas" +
                "\n  Tipo embarcación : " + tipoEmbarcacion;
    }
}
