package app;

import model.Direccion;
import model.Empleado;
import model.Persona;

public class Main {

    public static void main(String[] args) {

        // Instancia 1: un cliente (Persona)
        Direccion dir1 = new Direccion("Av. Frutillar 123", "Llanquihue", "Los Lagos");
        Persona cliente = new Persona("Ana Torres", "12.345.678-9", "ana@correo.cl", dir1);
        System.out.println("=== Cliente ===");
        System.out.println(cliente);

        // Instancia 2: un guia tuistico (Empleado)
        Direccion dir2 = new Direccion("Calle Los Alerces 45", "Puerto Montt", "Los Lagos");
        Empleado guia = new Empleado("Carlos Munoz", "9.876.543-2", "carlos@llanquihuetour.cl",
                                     dir2, "Guia Turistico", 850000);
        System.out.println("\n=== Guia Turistico ===");
        System.out.println(guia);

        // Instancia 3: un operador (Empleado)
        Direccion dir3 = new Direccion("Pasaje Los Lagos 88", "Llanquihue", "Los Lagos");
        Empleado operador = new Empleado("Maria Soto", "15.111.222-3", "maria@llanquihuetour.cl",
                                          dir3, "Operadora de Tours", 920000);
        System.out.println("\n=== Operadora de Tours ===");
        System.out.println(operador);
    }
}
