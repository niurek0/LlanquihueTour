package ui;

import data.GestorEntidades;
import data.GestorDatos;
import data.GestorServicios;
import model.ServicioTuristico;
import model.Tour;

import javax.swing.*;
import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        // Creamos el gestor y cargamos los datos de prueba
        GestorEntidades gestorEntidades = new GestorEntidades();
        gestorEntidades.cargarDatosDePrueba();

        // Mostrar resumen en consola (con instanceof)
        gestorEntidades.mostrarTodas();

        // Lanzar la interfaz grafica en el hilo de Swing (EDT)
        SwingUtilities.invokeLater(() -> {
            VentanaPrincipal ventana = new VentanaPrincipal(gestorEntidades);
            ventana.setVisible(true);
        });


        System.out.println("\n=================================================");
        System.out.println("   SERVICIOS TURISTICOS");
        System.out.println("=================================================\n");

        GestorServicios gestorServicios = new GestorServicios();
        ArrayList<ServicioTuristico> servicios = gestorServicios.crearServiciosDePrueba();

        for (ServicioTuristico s : servicios) {
            System.out.println(s);
            System.out.println("-------------------------------------------------");
        }

        System.out.println("\n=================================================");
        System.out.println("   CATALOGO DESDE ARCHIVO");
        System.out.println("=================================================\n");

        GestorDatos gestorDatos = new GestorDatos();
        ArrayList<Tour> listaTours = gestorDatos.cargarTours("resources/tours.txt");

        for (Tour tour : listaTours) {
            System.out.println("  -> " + tour);
        }

        System.out.println("\n-- Filtro: Tours gastronomicos --");
        for (Tour tour : listaTours) {
            if (tour.getTipo().equalsIgnoreCase("gastron\u00f3mico")) {
                System.out.println("  * " + tour.getNombre() + " | " + tour.getDuracionMinutos() + " min");
            }
        }

        System.out.println("\n-- Filtro: Larga duracion (> 120 min) --");
        for (Tour tour : listaTours) {
            if (tour.getDuracionMinutos() > 120) {
                System.out.println("  - " + tour.getNombre() + " (" + tour.getDuracionMinutos() + " min)");
            }
        }
    }
}
