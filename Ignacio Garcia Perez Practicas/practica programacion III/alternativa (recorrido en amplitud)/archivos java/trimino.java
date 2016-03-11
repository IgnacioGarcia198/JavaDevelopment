import java.io.*;
/**
 * Esta clase sólo tiene la función main que llama a las distintas funciones para 
 * rellenar la tabla de triminos.
 * @author Ignacio García
 */
public class trimino {

    /**
     * Procedimiento principal que ejecuta el análisis de la entrada y, si los 
     * argumentos son válidos, llama a la función baldosas de la clase Baldosas.
     */
    public static void main(String[] args) throws IOException {
        PrintStream salidaConsola = System.out, salidaArchivo = null; 
        // objetos PrintStream para cambiar entre salida a consola y salida a archivo
        Baldosas b = new Baldosas();
        int res;
        if ((res = b.examinaEntrada(args)) >= 0) {
            if(b.archivo != null) { // si se ha tomado un archivo de salida
                salidaArchivo = new PrintStream(
                new BufferedOutputStream(new FileOutputStream(b.archivo))); 
                // inicializamos un objeto PrintStream dirigido al archivo
                System.setOut(salidaArchivo); // redirigimos la salida estándar de 
                // java a nuestro archivo de salida
                b.titulo(); // escribimos el encabezado del archivo
            }
            else
                System.out.format("\n\n");
            b.baldosas();
            if(b.archivo != null) { // si teníamos archivo de salida
                System.out.print("FIN DE LA SALIDA"); // pie del archivo
                salidaArchivo.close(); // cerramos el flujo de datos
                System.setOut(salidaConsola); // volvemos a dirigir la salida estándar 
                // a la consola
            }
        }
        else {
            System.out.format("\n\n");
            if (res == Baldosas.ERROR) {
                b.textoError.append("; el programa no se ejecutará.\n\n");
                System.err.print(b.textoError);
            }
            Funciones.mostrarAyuda();
        }
    }
}
