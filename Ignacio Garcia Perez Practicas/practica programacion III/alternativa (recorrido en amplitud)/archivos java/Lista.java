/**
 * Lista enlazada con campo para el último nodo.
 */
class Lista {
    /**
     * Nodo final de la lista
     */
    NodoLista Fin;
    
    /**
     * Constructor de la clase Lista.
     * @param El objeto Cuadrante inicial de la lista
     */
    Lista(Cuadrante c) {
        Fin = new NodoLista(c);
    }
    
    /**
     * Procedimiento que genera un nuevo nodo al final de la lista. En caso de estar 
     * vacía la lista, Fin apunta al único nodo.
     * @param nval Objeto Cuadrante que se almacenará en el nuevo nodo.
     */
    void insertar(Cuadrante nval) {
        Fin.Siguiente = new NodoLista(nval); // ponemos el nuevo nodo al final de la lista
        Fin = Fin.Siguiente; // marcamos el nuevo nodo como final
    }
    
    /**
     * Constructor por defecto de la clase Lista: Es privado; no se debe usar para evitar 
     * problemas.
     */
    private Lista() { }
}
