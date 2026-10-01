package Tema1.Ejercicios3.Ejercicio3;

public class Main implements Runnable{

    static void main(String[] args) {

        new Thread(new Main()).start();


    }

    @Override
    public void run() {

        Thread hilo1 = new Thread(new Hilo1());
        hilo1.start();
        new Thread(new Hilo2()).start();
        try {
            Thread.sleep(5000);
            hilo1.interrupt();
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

    }
}
