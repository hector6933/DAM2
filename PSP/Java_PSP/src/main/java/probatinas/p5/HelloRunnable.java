package probatinas.p5;

public class HelloRunnable implements Runnable {

    public static int contador = 0;

    public void run() {

        contador++;
        System.out.println(contador);

    }

    public static void main(String args[]) {

        for (int i = 0; i < 10000; i++) {

            new Thread(new HelloRunnable()).start();

        }

    }
}
