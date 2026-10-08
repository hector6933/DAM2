package Tema1.Ejercicios3.Ejercicio4;

public class Main implements Runnable{

    private Integer duracion;

    public Main(Integer duracion) {
        this.duracion = duracion;
    }

    static void main() {

        new Thread(new Main(8000)).start();

    }

    @Override
    public void run() {

        Thread hilo1 = new Thread(new Hilo1());
        hilo1.start();
        int cont = 1;

        while (hilo1.isAlive()) {

            System.out.println("Esperando al hilo 1... (" + cont + ")");
            cont++;

            if (cont == duracion/1000) {

                System.out.println("¡El programa ha finalizado!");
                hilo1.interrupt();
                break;

            } else {

                try {
                    Thread.sleep(1000);
                } catch (InterruptedException e) {
                    throw new RuntimeException(e);
                }

            }

        }

    }
}
