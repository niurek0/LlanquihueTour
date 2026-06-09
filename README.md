# LlanquihueTour - Sistema de Gestión de Personas

## Descripción
Sistema orientado a objetos que representa las personas vinculadas a la agencia
de turismo Llanquihue Tour, incluyendo clientes y empleados, con sus datos
de contacto y dirección.

## Estructura de paquetes y clases

- `src/`
    - `model/`
        - `Direccion.java` → Dirección física (usada por composición)
        - `Persona.java` → Clase base con datos generales
        - `Empleado.java` → Extiende Persona, agrega cargo y salario
    - `app/`
        - `Main.java` → Clase principal, crea y muestra objetos


## Autor
- Felipe Campusano
- Semana 3 – Desarrollo Orientado a Objetos I – Duoc UC