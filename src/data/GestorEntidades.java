package data;

import model.ColaboradorExterno;
import model.GuiaTuristico;
import model.Registrable;
import model.Vehiculo;

import java.util.ArrayList;

// GestorEntidades nos permite guardar un ArrayList de tipo Registrable (interfaz) y asi guardar objetos de distinas clases, siempre que implementen Registrable
public class GestorEntidades {

    // Colección genérica: acepta cualquier objeto que implemente Registrable
    private ArrayList<Registrable> entidades;

    public GestorEntidades() {
        this.entidades = new ArrayList<>();
    }

    // agrega un objeto a la coleccion
    public void agregar(Registrable entidad) {
        entidades.add(entidad);
    }

    // devuelve la colección completa
    public ArrayList<Registrable> getEntidades() {
        return entidades;
    }


    // recorremos la coleccion y mostramos el resumen de cada entidad, usando instanceof para saber que tipo de objeto es y aplicar la logica correspondiente
    public void mostrarTodas() {
        System.out.println("=================================================");
        System.out.println("   REGISTRO DE ENTIDADES - LLANQUIHUE TOUR");
        System.out.println("=================================================\n");

        for (Registrable entidad : entidades) {

            if (entidad instanceof GuiaTuristico guia) {
                System.out.println(">> PERSONAL GUÍA");
                guia.mostrarResumen();
                System.out.println("   [Especialidad registrada: " + guia.getEspecialidad() + "]");

            } else if (entidad instanceof ColaboradorExterno colaborador) {
                System.out.println(">> COLABORADOR");
                colaborador.mostrarResumen();
                System.out.println("   [Empresa asociada: " + colaborador.getEmpresa() + "]");

            } else if (entidad instanceof Vehiculo vehiculo) {
                System.out.println(">> RECURSO MATERIAL");
                vehiculo.mostrarResumen();
                System.out.println("   [Patente: " + vehiculo.getPatente() + "]");

            } else {
                entidad.mostrarResumen();
            }

            System.out.println("-------------------------------------------------");
        }

        System.out.println("Total de entidades registradas: " + entidades.size());
    }

    //cargamos datos de prueba al iniciar
    public void cargarDatosDePrueba() {
        agregar(new GuiaTuristico("María Soto", "12.345.678-9", "Turismo Lacustre"));
        agregar(new GuiaTuristico("Pedro Mansilla", "9.876.543-2", "Gastronomía Local"));
        agregar(new ColaboradorExterno("Transporte Andino", "76.543.210-K", "Buses Andino Ltda."));
        agregar(new ColaboradorExterno("Laura Vidal", "15.432.100-3", "Catering Los Lagos"));
        agregar(new Vehiculo("VH-001", "Minibús 15 pasajeros", "BJRT-45"));
        agregar(new Vehiculo("VH-002", "Van turística 8 pasajeros", "GKPW-12"));
    }
}
