# LlanquihueTourApp

## Descripción del sistema

Sistema orientado a objetos desarrollado en Java para la agencia de turismo **Llanquihue Tour**, ubicada en la Región de Los Lagos:


## Clases e interfaces

| Elemento | Tipo | Descripción |
|---|---|---|
| `Registrable` | Interfaz | Contrato común: declara `mostrarResumen()` y `obtenerResumen()` |
| `Persona` | Clase abstracta | Superclase de personas: `nombre`, `rut` |
| `RecursoAgencia` | Clase abstracta | Superclase de recursos: `codigo`, `descripcion` |
| `GuiaTuristico` | Subclase de Persona | Atributo: `especialidad` |
| `ColaboradorExterno` | Subclase de Persona | Atributo: `empresa` |
| `Vehiculo` | Subclase de RecursoAgencia | Atributo: `patente` |
| `GestorEntidades` | Clase data | `ArrayList<Registrable>` con `instanceof` |
| `VentanaPrincipal` | Clase ui | GUI con `JFrame` y formularios `JOptionPane` |

## Estructura de carpetas

```
LlanquihueTourApp/
├── src/
│   ├── model/
│   │   ├── Registrable.java          # Interfaz común
│   │   ├── Persona.java              # Superclase abstracta (personas)
│   │   ├── RecursoAgencia.java       # Superclase abstracta (recursos)
│   │   ├── GuiaTuristico.java        # Subclase: especialidad
│   │   ├── ColaboradorExterno.java   # Subclase: empresa
│   │   ├── Vehiculo.java             # Subclase: patente
│   │   ├── ServicioTuristico.java    # S6: superclase tours
│   │   ├── RutaGastronomica.java     # S6: subclase
│   │   ├── PaseoLacustre.java        # S6: subclase
│   │   ├── ExcursionCultural.java    # S6: subclase
│   │   └── Tour.java                 # S4: clase base
│   ├── data/
│   │   ├── GestorEntidades.java      # Colección polimórfica + instanceof
│   │   ├── GestorServicios.java      # Instancias de prueba S6
│   │   └── GestorDatos.java          # Lectura desde archivo S4
│   └── ui/
│       ├── VentanaPrincipal.java     # GUI JFrame con formularios
│       └── Main.java                 # Punto de entrada
└── resources/
    └── tours.txt                     # Datos S4
```

## Instrucciones para ejecutar

1. Abre el proyecto en **IntelliJ IDEA**.
2. Marca `resources/` como **Resources Root** (clic derecho → *Mark Directory as*).
3. Ejecuta `ui/Main.java`.
4. Se abrirá la **ventana gráfica** con los registros cargados.
5. Usa los botones para agregar nuevas entidades o ver el listado completo.
