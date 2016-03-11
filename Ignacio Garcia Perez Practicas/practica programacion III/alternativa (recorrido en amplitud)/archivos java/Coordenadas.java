/**
 * Esta clase representa las coordenadas de una casilla de una matriz de dos 
 * dimensiones, en números, fila y columna.
 */
class Coordenadas { // Registro de coordenadas con la fila y la columna
    /**
     * Constructor de la clase Coordenadas.
     * @param f Coordenada vertical o fila de la casilla
     * @param c Coordenada horizontal o columna de la casilla
     */
    Coordenadas(int f, int c) {
        Fila = f; Columna = c;
    }
    /**
     * Fila de la casilla
     */
    int Fila;
    /**
     * Columna de la casilla
     */
    int Columna;
}
        
