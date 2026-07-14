package ui;

import data.GestorDatos;
import data.GestorServicios;
import model.ServicioTuristico;
import model.Tour;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        System.out.println("=================================================");
        System.out.println("   LLANQUIHUE TOUR - SERVICIOS TURISTICOS");
        System.out.println("       (Jerarquia con Herencia - S6)");
        System.out.println("=================================================\n");

        // creo el gestor y obtenemos los servicios de prueba
        GestorServicios gestorServicios = new GestorServicios();
        ArrayList<ServicioTuristico> servicios = gestorServicios.crearServiciosDePrueba();

        // recorro la lista y mostramos la info con el metodo toString
        for (ServicioTuristico servicio : servicios) {
            System.out.println(servicio);
            System.out.println("-------------------------------------------------");
        }

        System.out.println("\nTotal de servicios registrados: " + servicios.size());
        // carga de data desde el archivo

        System.out.println("\n=================================================");
        System.out.println("   CATALOGO COMPLETO DESDE ARCHIVO");
        System.out.println("=================================================\n");

        GestorDatos gestorDatos = new GestorDatos();
        ArrayList<Tour> listaTours = gestorDatos.cargarTours("resources/tours.txt");

        for (Tour tour : listaTours) {
            System.out.println("  -> " + tour);
        }

        System.out.println("\nTotal de tours cargados desde archivo: " + listaTours.size());

        // Filtro: tours gastronomicos
        System.out.println("\n-- Filtro: Tours gastronomicos --");
        for (Tour tour : listaTours) {
            if (tour.getTipo().equalsIgnoreCase("gastron\u00f3mico")) {
                System.out.println("  * " + tour.getNombre() + " | " + tour.getDuracionMinutos() + " min");
            }
        }

        // Filtro: duracion mayor a 120 minutos
        System.out.println("\n-- Filtro: Tours de larga duracion (> 120 min) --");
        for (Tour tour : listaTours) {
            if (tour.getDuracionMinutos() > 120) {
                System.out.println("  - " + tour.getNombre() + " (" + tour.getDuracionMinutos() + " min)");
            }
        }

        System.out.println("\nPrograma finalizado con exito!!");
    }
}
