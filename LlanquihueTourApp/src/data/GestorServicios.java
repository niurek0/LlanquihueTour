package data;

import model.ExcursionCultural;
import model.PaseoLacustre;
import model.RutaGastronomica;
import model.ServicioTuristico;

import java.util.ArrayList;

// Clase GestorServicios: crea instancias de prueba de cada subclase y las retorna en una lista de tipo ServicioTuristico.

public class GestorServicios {

    // Crea y retorna una lista con al menos 2 objetos de cada subclase.
    public ArrayList<ServicioTuristico> crearServiciosDePrueba() {

        ArrayList<ServicioTuristico> servicios = new ArrayList<>();

        // ── Rutas Gastronómicas ──────────────────────────────
        servicios.add(new RutaGastronomica("Ruta Gastronómica del Lago", 3.5, 5));
        servicios.add(new RutaGastronomica("Degustación de Quesos Artesanales", 1.5, 3));

        // ── Paseos Lacustres ─────────────────────────────────
        servicios.add(new PaseoLacustre("Paseo Lacustre Llanquihue", 2.0, "Catamarán"));
        servicios.add(new PaseoLacustre("Navegación al Atardecer", 1.0, "Lancha a motor"));

        // ── Excursiones Culturales ───────────────────────────
        servicios.add(new ExcursionCultural("Tour Cultural Calbuco", 4.0, "Fuerte San Miguel"));
        servicios.add(new ExcursionCultural("Excursión a Isla Huar", 5.0, "Iglesia Patrimonial de Huar"));

        return servicios;
    }
}
