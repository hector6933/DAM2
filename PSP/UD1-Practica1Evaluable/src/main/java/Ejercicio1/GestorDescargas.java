package Ejercicio1;

public class GestorDescargas {

    private int descargasCompletadas = 0;
    synchronized public void registrarDescarga(String nombreArchivo) {

        descargasCompletadas++;
        System.out.println("[Descargador" + Thread.currentThread().getName() + "] Archivo " + nombreArchivo + " descargado. Total " + descargasCompletadas);

    }

    synchronized public int getDescargasCompletadas() {
        return descargasCompletadas;
    }
}
