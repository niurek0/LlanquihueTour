package model;

public class GuiaTuristico extends Persona {

    private String especialidad; // Ej: "lacustre", "gastronómica", "cultural"

    public GuiaTuristico(String nombre, String rut, String especialidad) {
        super(nombre, rut); // Inicializa atributos de Persona
        this.especialidad = especialidad;
    }

    // Getter y Setter
    public String getEspecialidad() { return especialidad; }
    public void setEspecialidad(String especialidad) { this.especialidad = especialidad; }


    // contrato Registrable
    @Override
    public void mostrarResumen() {
        System.out.println(obtenerResumen());
    }

    // Resumen para UI
    @Override
    public String obtenerResumen() {
        return "[Guía Turístico]\n" +
               "  Nombre       : " + getNombre() + "\n" +
               "  RUT          : " + getRut() + "\n" +
               "  Especialidad : " + especialidad;
    }

    @Override
    public String toString() {
        return obtenerResumen();
    }
}
