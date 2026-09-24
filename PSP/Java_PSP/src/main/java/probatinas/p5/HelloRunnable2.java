package probatinas.p5;

public class HelloRunnable2 implements Runnable {

    public static int contador = 0;

    public void run() {

        for (int i = 0; i < 10000000; i++) {

            contador++;
            System.out.println(contador);

        }

    }

    public static void main(String args[]) throws InterruptedException {

        for (int i = 0; i < 10000; i++) {

            new Thread(new HelloRunnable()).start();

        }

    }
}