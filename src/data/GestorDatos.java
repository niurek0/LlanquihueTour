package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;


// clase GestorDatos lee el archivo tours.txt y convierte cada linea en un arraylist
public class GestorDatos {

    //Leemos el archivo .txt y retorna una lista (ArrayList) de objetos Tour.

    public ArrayList<Tour> cargarTours(String rutaArchivo) {

        // inicializamos array donde se guardarán los tours
        ArrayList<Tour> listaTours = new ArrayList<>();

        // leemos el archivo
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            // ciclo que lee todoe l archivo
            while ((linea = lector.readLine()) != null) {

                // Ignoramos líneas vacías
                if (linea.trim().isEmpty()) {
                    continue;
                }

                // Separamos los datos de la línea usando el delimitador ";"
                String[] partes = linea.split(";");

                // verificamos q la linea tenga 3 campos
                if (partes.length == 3) {
                    String nombre = partes[0].trim();
                    String tipo = partes[1].trim();
                    int duracion = Integer.parseInt(partes[2].trim()); // Convertimos texto a número entero

                    // creamos el objeto Tour y lo aañadimos a la lista
                    Tour tour = new Tour(nombre, tipo, duracion);
                    listaTours.add(tour);
                } else {
                    // verificamos formato y arrojamos mensaje si es invalido
                    System.out.println("Línea con formato inválido (ignorada): " + linea);
                }
            }

        } catch (IOException e) {
            // si el archivo no puede leerse mostramos un mensaje de error
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return listaTours;
    }
}
