package main.java.Tema1.Ejercicios4.Ej4;

import java.util.LinkedList;
import java.util.Queue;
import java.util.Random;


// Para el que sea que esté viendo esto:
// Si eres iker lo primero de todo madura
// wait() lo que hace es que el hilo al que llama a la función se pare y no continue
// notifiyAll() cancela el wait y despierta a todos los hilos que hayan sido afectados por un wait en el mismo objeto
// en vez de hacer esto se podría hacer ineficiente y poner un if en cada hilo para comprobar si la lista está vacía o llena
// seguido de un bucle para que no continue con la ejecución, pero bueno no sé que forma le valdrá a Ángel, yo por si acaso
// lo hago de la forma eficiente
public class Ejercicio4 {

    private boolean terminar = false;
    private Queue<Integer> cola = new LinkedList<>();

    private Integer max = 5;

    public synchronized Queue<Integer> getCola() {
        return cola;
    }

    public synchronized void producir(Integer num, String nombre) throws InterruptedException {

        // Como notifyAll despierta a todos, si uno llena la cola, el segundo tendrá que volver a comprobar si sigue llena
        while (cola.size() >= max) {

            wait();

        }

        cola.add(num);
        System.out.println(nombre + " produce: " + num);

        notifyAll();

    }

    public synchronized boolean consumir(String nombre) throws InterruptedException {

        // Como notifyAll despierta a todos, si uno vacía la cola, el otro tendrá que comprobar si sigue vacía
        while (cola.isEmpty() && !terminar) {

            wait();

        }

        if (cola.isEmpty() && terminar) {

            return false;

        }

        System.out.println(nombre + " consume: " + cola.poll());

        notifyAll();
        return true;

    }

    public synchronized void terminar() {

        terminar = true;
        notifyAll();

    }

    static void main(String[] args) throws InterruptedException {


        Ejercicio4 sync = new Ejercicio4();

        Thread hiloP1 = new Thread(new HiloP1(sync));
        Thread hiloP2 = new Thread(new HiloP2(sync));

        Thread hiloC1 = new Thread(new HiloC1(sync));
        Thread hiloC2 = new Thread(new HiloC2(sync));

        hiloP1.start();
        hiloP2.start();
        hiloC1.start();
        hiloC2.start();

        hiloP1.join();
        hiloP2.join();

        sync.terminar();

        hiloC1.join();
        hiloC2.join();

    }

}

class HiloP1 implements Runnable {

    private final Ejercicio4 sync;

    public HiloP1(Ejercicio4 sync) {

        this.sync = sync;

    }

    @Override
    public void run() {

        try {

            Random random = new Random();
            for (int i = 0; i < 10; i++) {


                int num = random.nextInt(0, 100);

                sync.producir(num, "[Productor-1]");

                Thread.sleep(500);

            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;

        }

    }
}

class HiloP2 implements Runnable {

    private final Ejercicio4 sync;

    public HiloP2(Ejercicio4 sync) {

        this.sync = sync;
    }

    @Override
    public void run() {

        try {

            Random random = new Random();
            for (int i = 0; i < 10; i++) {

                int num = random.nextInt(0, 100);

                sync.producir(num, "[Productor-2]");

                Thread.sleep(500);

            }



        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;

        }

    }
}

class HiloC1 implements Runnable {

    private final Ejercicio4 sync;

    public HiloC1(Ejercicio4 sync) {

        this.sync = sync;
    }

    @Override
    public void run() {

        try {

            while (sync.consumir("[Consumidor-1]")) {

                Thread.sleep(800);


            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }

    }
}

class HiloC2 implements Runnable {

    private final Ejercicio4 sync;

    public HiloC2(Ejercicio4 sync) {

        this.sync = sync;
    }

    @Override
    public void run() {

        try {

            while (sync.consumir("[Consumidor-2]")) {

                Thread.sleep(800);

            }

        } catch (InterruptedException e) {
            Thread.currentThread().interrupt();
            return;
        }


    }
}