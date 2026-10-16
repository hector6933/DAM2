package Ejercicio1;

import java.util.Random;

public class Descargador implements Runnable {

    private GestorDescargas gestor;
    private String archivo;

    public Descargador(GestorDescargas gestor, String archivo) {

        this.gestor = gestor;
        this.archivo = archivo;

    }

    @Override
    public void run() {

        Random random = new Random();
        try {
            Thread.sleep(random.nextInt(500, 1501));
            gestor.registrarDescarga(archivo);
        } catch (InterruptedException e) {
            System.out.println("La descarga ha sido interrumpida");
            return;
        }


    }
}
