/**
 * Nodo de una lista enlazada de objetos Cuadrante. Contiene un enlace al siguiente 
 * nodo.
 */
class NodoLista {
    /**
     * Objeto Cuadrante interno
     */
    Cuadrante Valor;
    /**
     * Enlace al siguiente nodo, que será null si éste es el último.
     */
    NodoLista Siguiente;
    /**
     * Constructor de la clase NodoLista
     * @param nuevoval Objeto Cuadrante que almacenará el nodo.
     */
    NodoLista(Cuadrante nuevoval) {
        Valor = nuevoval;
    }
}
