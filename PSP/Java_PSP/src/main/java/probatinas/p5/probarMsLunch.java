package probatinas.p5;

import java.util.concurrent.CountDownLatch;

public class probarMsLunch implements Runnable {
    private long c1 = 0;
    private long c2 = 0;
    private final Object lock1 = new Object();
    private final Object lock2 = new Object();

    // Añadimos el latch para que el hilo principal sepa cuándo terminan
    private CountDownLatch latch;

    // Constructor modificado para recibir el sincronizador
    public probarMsLunch(CountDownLatch latch) {
        this.latch = latch;
    }

    public void inc1() {
        synchronized(new Object()) {
            c1++;
        }
    }

    public long getC1() {
        return c1;
    }

    // Corregida la firma del main para que sea ejecutable (String[] args)
    public static void main(String[] args) throws InterruptedException {
        int numeroDeHilos = 1000;
        CountDownLatch latch = new CountDownLatch(numeroDeHilos);

        // 1. CREAMOS UNA SOLA INSTANCIA para compartir los contadores y cerrojos
        probarMsLunch tareaCompartida = new probarMsLunch(latch);

        for (int i = 0; i < numeroDeHilos; i++) {
            // 2. Pasamos la misma tarea a todos los hilos
            new Thread(tareaCompartida).start();
        }

        // 3. El hilo principal se duerme aquí hasta que el contador del latch llegue a 0
        latch.await();

        // 4. Ahora es seguro leer el valor final de c1
        System.out.println("Valor final de c1: " + tareaCompartida.getC1());
    }

    @Override
    public void run() {
        try {
            inc1();
        } finally {
            // Cada hilo que termina resta 1 al contador del latch
            latch.countDown();
        }
    }
}
