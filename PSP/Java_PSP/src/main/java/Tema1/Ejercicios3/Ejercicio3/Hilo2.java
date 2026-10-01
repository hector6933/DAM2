package Tema1.Ejercicios3.Ejercicio3;

public class Hilo2 implements Runnable{

    static void main(String[] args) {

        new Thread(new Hilo2()).start();

    }

    @Override
    public void run() {

        for (int i = 0; i < 15; i++) {

            System.out.println(" mundo!");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                throw new RuntimeException(e);
            }

        }

    }
}
