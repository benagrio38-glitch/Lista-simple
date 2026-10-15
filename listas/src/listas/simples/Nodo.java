package listas.simples;

/**
 * Elemento nodo de una lista
 * @author Oscar Manuel Ayala Ortiz
 * @date 15 Octubre 2026
 */
public class Nodo {
    private int valor;
    private Nodo sig;

    public Nodo(int valor) {
        this.valor = valor;
        this.sig = null;
    }

    public int getValor() { return valor; }
    public void setValor(int valor) { this.valor = valor; }
    public Nodo getSig() { return sig; }
    public void setSig(Nodo sig) { this.sig = sig; }
}