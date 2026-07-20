package model;

// Interfaz que permite definir un contrato que seguirán las clases que lo implementan
public interface Registrable {

    // función mostrarResumen abstracto, cada clase lo implementa
    void mostrarResumen();

    // resumen como texcto, luego lo muestro en la UI
    String obtenerResumen();
}
