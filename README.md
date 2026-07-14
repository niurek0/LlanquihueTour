# LlanquihueTourApp

## Descripción

Aplicación Java que gestiona el catálogo de servicios turísticos de la agencia **Llanquihue Tour**, ubicada en la Región de Los Lagos. El proyecto ha evolucionado en dos etapas:

- **Semana 4**: Lectura de datos desde un archivo `.txt`, creación de objetos `Tour` y almacenamiento en un `ArrayList`, con recorrido y filtros.
- **Semana 6**: Implementación de una jerarquía de clases con **herencia simple**, donde `ServicioTuristico` es la superclase y `RutaGastronomica`, `PaseoLacustre` y `ExcursionCultural` son subclases especializadas.

## Clases creadas (Semana 6)

| Clase | Tipo | Atributos propios |
|---|---|---|
| `ServicioTuristico` | Superclase | `nombre`, `duracionHoras` |
| `RutaGastronomica` | Subclase | `numeroDeParadas` |
| `PaseoLacustre` | Subclase | `tipoEmbarcacion` |
| `ExcursionCultural` | Subclase | `lugarHistorico` |

Todas las subclases usan `super(...)` en su constructor y sobrescriben `toString()` con `@Override`.

## Estructura de carpetas

```
LlanquihueTourApp/
├── src/
│   ├── model/
│   │   ├── ServicioTuristico.java   # Superclase con atributos comunes
│   │   ├── RutaGastronomica.java    # Subclase: agrega numeroDeParadas
│   │   ├── PaseoLacustre.java       # Subclase: agrega tipoEmbarcacion
│   │   ├── ExcursionCultural.java   # Subclase: agrega lugarHistorico
│   │   └── Tour.java                # Clase de la Semana 4
│   ├── data/
│   │   ├── GestorServicios.java     # Crea instancias de prueba (S6)
│   │   └── GestorDatos.java         # Lee el archivo .txt (S4)
│   └── ui/
│       └── Main.java                # Clase principal del programa
└── resources/
    └── tours.txt                    # Datos de tours en formato CSV
```

## Instrucciones para ejecutar

1. Abre el proyecto en **IntelliJ IDEA**.
2. Marca la carpeta `resources/` como **Resources Root**:
   - Clic derecho → *Mark Directory as* → *Resources Root*
3. Ejecuta la clase `ui/Main.java`.
4. La consola mostrará:
   - Los 6 servicios turísticos creados con herencia (S6).
   - El catálogo completo leído desde `tours.txt` (S4).
   - Filtros por tipo y duración (S4).
