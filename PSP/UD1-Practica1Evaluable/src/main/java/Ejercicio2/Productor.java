package Ejercicio2;

public class Productor implements Runnable {

    private final Integer producir = 10;
    private final ColaTareas cola;

    public Productor(ColaTareas cola) {
        this.cola = cola;
    }

    @Override
    public void run() {

        try {

            for (int i = 0; i < producir; i++) {

                Thread.sleep(500);

                cola.producir(i);

            }

            Thread.sleep(500);

            cola.producir(-1);

        } catch (InterruptedException e) {

            System.out.println("¡Productor interrumpido!");
            return;

        }

    }
}
