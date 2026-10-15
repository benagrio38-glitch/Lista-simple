package listas.simples;

/**
 * Clase principal para probar la lista simple
 * @author Oscar Manuel Ayala Ortiz
 * @date 15 octubre 2026
 */
public class Main {
    public static void main(String[] args) {
        ListaSimple lista = new ListaSimple();

        // Lista vacía
        lista.recorrer();

        // Insertar valores al inicio
        lista.insertarAlInicio(10);
        lista.insertarAlInicio(20);
        lista.insertarAlInicio(30);

        // Mostrar la lista
        lista.recorrer();
    }
}