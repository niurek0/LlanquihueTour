package model;

 // Hereda de ServicioTuristico y agrega lugarHistorico.

public class ExcursionCultural extends ServicioTuristico {

    private String lugarHistorico;

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


    //Sobrescritura de toString() con @Override.

    @Override
    public String toString() {
        return "[Excursión Cultural]" +
                "\n  Nombre          : " + getNombre() +
                "\n  Duración        : " + getDuracionHoras() + " horas" +
                "\n  Lugar histórico : " + lugarHistorico;
    }
}
