package Tema1.Ejercicios4.Ej2;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio2 {

    static void main(String[] args) throws InterruptedException {

        long inicio = System.currentTimeMillis();

        int maxSeg;
        try {

            maxSeg = Integer.parseInt(args[0]);

        } catch (NumberFormatException e) {

            System.out.println("[MAIN] Introduce un número en el primer parámetro!!!");
            return;

        }

        Thread hilo = new Thread(new Hilo());
        hilo.start();

        int segundos = 0;
        while (hilo.isAlive()) {

            if (segundos == maxSeg) {


                hilo.interrupt();
                hilo.join();

            }

            System.out.println("[MAIN] Hilo principal esperando");
            try {

                Thread.sleep(1000);
                segundos++;

            } catch (InterruptedException e) {

                throw new RuntimeException(e);

            }



        }

        System.out.println("[MAIN] Tiempo total de ejecución: " + (System.currentTimeMillis() - inicio)/1000);

    }

}

class Hilo implements Runnable {

    static void main(String[] args) {

        new Thread(new Hilo()).start();

    }

    @Override
    public void run() {

        List<String> mensajes = new ArrayList<>(Arrays.asList("Inicio del programa", "Procesos", "Servicios", "Multihilo", "Sincronización", "Fin del programa"));

        for (int i = 0; i < mensajes.size(); i++) {

            System.out.println("[HILO SECUNDARIO] " + mensajes.get(i));

            try {

                Thread.sleep(3000);

            } catch (InterruptedException ex) {

                for (int j = i; j < mensajes.size(); j++) {

                    System.out.println("[HILO SECUNDARIO] " + mensajes.get(j));

                }
                return;

            }

        }

    }
}