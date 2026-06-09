package model;

public class Empleado extends Persona {

    private String cargo;
    private double salario;

    public Empleado(String nombre, String rut, String correo, Direccion direccion,
                    String cargo, double salario) {
        super(nombre, rut, correo, direccion);
        this.cargo = cargo;
        this.salario = salario;
    }

    public String getCargo() { return cargo; }
    public void setCargo(String cargo) { this.cargo = cargo; }

    public double getSalario() { return salario; }
    public void setSalario(double salario) { this.salario = salario; }

    @Override
    public String toString() {
        return "Empleado{" +
               "nombre='" + getNombre() + '\'' +
               ", rut='" + getRut() + '\'' +
               ", correo='" + getCorreo() + '\'' +
               ", direccion=" + getDireccion() +
               ", cargo='" + cargo + '\'' +
               ", salario=" + salario +
               '}';
    }
}
