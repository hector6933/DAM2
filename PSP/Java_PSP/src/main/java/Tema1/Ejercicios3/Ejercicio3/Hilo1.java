package Tema1.Ejercicios3.Ejercicio3;

public class Hilo1 implements Runnable {

    static void main(String[] args) {

        new Thread(new Hilo1()).start();

    }

    @Override
    public void run() {

        for (int i = 0; i < 15; i++) {

            System.out.print("Hola");
            try {
                Thread.sleep(2000);
            } catch (InterruptedException e) {
                System.out.println("¡Hilo interrumpido!");
                return;
            }
        }


    }
}
