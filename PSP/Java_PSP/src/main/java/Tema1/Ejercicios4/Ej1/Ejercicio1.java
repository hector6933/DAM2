package Tema1.Ejercicios4.Ej1;

public class Ejercicio1 {

    static void main(String[] args) throws InterruptedException {

        Thread hilo1 = new Thread(new Hilo1());
        Thread hilo2 = new Thread(new Hilo2());
        hilo1.start();

        try {
            Thread.sleep(500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        hilo2.start();

        try {
            Thread.sleep(4500);
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        hilo1.interrupt();
        hilo2.interrupt();


        System.out.println("Programa finalizado!!!");


    }

}

class Hilo1 implements Runnable{

    static void main(String[] args) {

        new Thread(new Hilo1()).start();

    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println("Hilo 1 - Hola");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {

                System.out.println("Hilo 1 ha sido interrumpido !");
                return;

            }

        }

    }
}

class Hilo2 implements Runnable{

    static void main(String[] args) {

        new Thread(new Hilo2()).start();

    }

    @Override
    public void run() {

        for (int i = 0; i < 10; i++) {

            System.out.println("Hilo 2 - DAM");
            try {
                Thread.sleep(1000);
            } catch (InterruptedException e) {
                System.out.println("Hilo 2 ha sido interrumpido !");
                return;
            }

        }

    }
}

class Hilo3 implements Runnable {


    @Override
    public void run() {

    }
}