package model;

public class ColaboradorExterno extends Persona {

    private String empresa; // Empresa a la que pertenece el colaborador

    public ColaboradorExterno(String nombre, String rut, String empresa) {
        super(nombre, rut);
        this.empresa = empresa;
    }

    // Getter y Setter
    public String getEmpresa() { return empresa; }
    public void setEmpresa(String empresa) { this.empresa = empresa; }

    @Override
    public void mostrarResumen() {
        System.out.println(obtenerResumen());
    }

    @Override
    public String obtenerResumen() {
        return "[Colaborador Externo]\n" +
               "  Nombre  : " + getNombre() + "\n" +
               "  RUT     : " + getRut() + "\n" +
               "  Empresa : " + empresa;
    }

    @Override
    public String toString() {
        return obtenerResumen();
    }
}
