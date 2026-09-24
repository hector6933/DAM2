package probatinas.p5;

public class SleepMessages2 implements Runnable {
    public void run() {
        // mensajes
        String importantInfo[] = { "Programas", "Procesos"
                , "Servicios", "Hilos" };

        for (int i = 0; i < importantInfo.length; i++) {
            // Mostrar mensaje
            System.out.println(importantInfo[i]);
            try {
            // Pausar 3 segundos
                Thread.sleep(3000);
            } catch (InterruptedException e) {
            // Mostrar interrupción
                System.out.println("Hilo interrumpido");
                // Finalizar la ejecución del hilo
                return;
            }
        }
        System.out.println("***Hilo finalizado***");
    }
    static void main(String[] args) throws InterruptedException {

        // Crear nuevo hilo
        Thread t = new Thread(new SleepMessages2());
        // Arrancar hilo
        t.start();
        //dejar pasar 4 segundos e interrumpir el hilo
        Thread.sleep(4000);
        t.interrupt();

    }
}
