package listas.simples;

/**
 * Estructura de datos que representa una lista enlazada simple de enteros.
 * @author Oscar Manuel Ayala Ortiz
 * @date 15 octubre 2026
 */
public class ListaSimple {
    // Referencia al primer nodo de la lista (null si no hay elementos)
    private Nodo cabeza;

    // Constructor: crea una lista nueva sin nodos
    public ListaSimple() {
        this.cabeza = null;
    }

    // Agrega un valor al principio de la lista.
    // Complejidad O(1): no necesita recorrer los nodos existentes.
    public void insertarAlInicio(int valor) {
        Nodo nuevo = new Nodo(valor);

        if (cabeza == null) {
            // Si la lista no tiene nodos, el nuevo pasa a ser el primero
            cabeza = nuevo;
        } else {
            nuevo.setSig(cabeza); // Paso 1: el nuevo nodo apunta al primer nodo actual
            cabeza = nuevo;       // Paso 2: el nuevo nodo se convierte en la cabeza
        }
    }

    // Muestra en pantalla todos los valores, empezando por la cabeza
    public void recorrer() {
        if (cabeza == null) {
            System.out.println("La lista está vacía");
            return;
        }

        // Se usa un nodo auxiliar para no perder la referencia a la cabeza
        Nodo actual = cabeza;
        while (actual != null) {
            System.out.println(actual.getValor()); // Imprime el valor del nodo actual
            actual = actual.getSig();              // Avanza al siguiente nodo
        }
    }
}