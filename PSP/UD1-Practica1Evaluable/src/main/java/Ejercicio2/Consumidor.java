package Ejercicio2;

import java.util.Queue;

public class Consumidor implements Runnable{

    private ColaTareas cola;
    private Integer num;

    public Consumidor(ColaTareas cola, Integer num) {
        this.cola = cola;
        this.num = num;
    }

    @Override
    public void run() {

        try {

            while (cola.consumir(num) != null) {

                Thread.sleep(800);

            }

        } catch (InterruptedException e) {
            System.out.println("¡Consumidor interrumpido!");
        }

    }
}
