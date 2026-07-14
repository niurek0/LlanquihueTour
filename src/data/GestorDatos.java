package data;

import model.Tour;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

// clase se encarga de leer el archivo tours.txt y convertir cada línea en un objeto Tour almacenado en un ArrayList.

public class GestorDatos {

    // Lee el archivo .txt y retorna una lista (ArrayList) de objetos Tour.
    public ArrayList<Tour> cargarTours(String rutaArchivo) {

        // Creamos la colección donde guardaremos los tours
        ArrayList<Tour> listaTours = new ArrayList<>();

        // Usamos try-with-resources para abrir y leer el archivo de forma segura
        try (BufferedReader lector = new BufferedReader(new FileReader(rutaArchivo))) {

            String linea;

            // Leemos el archivo línea por línea hasta que no haya más líneas
            while ((linea = lector.readLine()) != null) {

                // Ignoramos líneas vacías
                if (linea.trim().isEmpty()) {
                    continue;
                }

                // Separamos los datos de la línea usando el delimitador ";"
                // Ejemplo: "Ruta Gastronómica;gastronómico;120" → ["Ruta Gastronómica", "gastronómico", "120"]
                String[] partes = linea.split(";");

                // Verificamos que la línea tenga exactamente 3 campos
                if (partes.length == 3) {
                    String nombre = partes[0].trim();
                    String tipo = partes[1].trim();
                    int duracion = Integer.parseInt(partes[2].trim()); // Convertimos texto a número entero

                    // Creamos el objeto Tour y lo agregamos a la lista
                    Tour tour = new Tour(nombre, tipo, duracion);
                    listaTours.add(tour);
                } else {
                    // Si la línea no tiene el formato correcto, avisamos y la saltamos
                    System.out.println("Línea con formato inválido (ignorada): " + linea);
                }
            }

        } catch (IOException e) {
            // Si no se puede leer el archivo, mostramos el error
            System.out.println("Error al leer el archivo: " + e.getMessage());
        }

        return listaTours;
    }
}
