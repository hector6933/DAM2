package Tema1.Ejercicios4.Ej3;

import java.util.Random;

public class Ejercicio3 {

    public static Cuenta cuenta = new Cuenta(2000.0);

    static void main(String[] args) throws InterruptedException {

        Thread hilo1 = new Thread(new Hilo1());
        Thread hilo2 = new Thread(new Hilo2());
        Thread hilo3 = new Thread(new Hilo3());
        Thread hilo4 = new Thread(new Hilo4());
        Thread hilo5 = new Thread(new Hilo5());

        hilo1.start();
        hilo2.start();
        hilo3.start();
        hilo4.start();
        hilo5.start();

        hilo1.join();
        hilo2.join();
        hilo3.join();
        hilo4.join();
        hilo5.join();

        System.out.println("Saldo final " + cuenta.getSaldo() + "€");

    }

}

class Cuenta {

    private Double saldo;

    public Cuenta() {
    }

    public Cuenta(Double saldo) {
        this.saldo = saldo;
    }

    public Double getSaldo() {
        return saldo;
    }

    public void ingresarDinero(Double cantidad) {

        System.out.println("Hilo: " + Thread.currentThread().getName());
        System.out.println("Tipo de operación: Ingresar Dinero");
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Saldo anterior: " + getSaldo());
        System.out.println("Saldo posterior: " + (getSaldo() + cantidad));

        Random random = new Random();

        try {
            Thread.sleep(random.nextInt(100,501));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        setSaldo(getSaldo() + cantidad);

    }

    public void retirarDinero(Double cantidad) {

        System.out.println("Hilo: " + Thread.currentThread().getName());
        System.out.println("Tipo de operación: Retirar Dinero");
        System.out.println("Cantidad: " + cantidad);
        System.out.println("Saldo anterior: " + getSaldo());
        System.out.println("Saldo posterior: " + (getSaldo() - cantidad));

        Random random = new Random();

        try {
            Thread.sleep(random.nextInt(100,501));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        setSaldo(getSaldo() - cantidad);

    }

    private void setSaldo(Double saldo){

        Random random = new Random();

        try {
            Thread.sleep(random.nextInt(100,501));
        } catch (InterruptedException e) {
            throw new RuntimeException(e);
        }

        this.saldo = saldo;

    }

}

class Hilo1 implements Runnable {

    static void main(String[] args) {

        new Thread(new Hilo1()).start();

    }

    @Override
    public void run() {

        Random random = new Random();
        for (int i = 0; i < 5; i++) {

            if (random.nextInt(0,101) % 2 == 0) {

                Ejercicio3.cuenta.ingresarDinero(random.nextDouble(0.0,4000.0));

            } else {

                Ejercicio3.cuenta.retirarDinero(random.nextDouble(0.0,4000.0));

            }

        }

    }
}

class Hilo2 implements Runnable {

    static void main(String[] args) {

        new Thread(new Hilo2()).start();

    }

    @Override
    public void run() {

        Random random = new Random();
        for (int i = 0; i < 5; i++) {

            if (random.nextInt(0,101) % 2 == 0) {

                Ejercicio3.cuenta.ingresarDinero(random.nextDouble(0.0,4000.0));

            } else {

                Ejercicio3.cuenta.retirarDinero(random.nextDouble(0.0,4000.0));

            }

        }

    }
}

class Hilo3 implements Runnable {

    static void main(String[] args) {

        new Thread(new Hilo3()).start();

    }

    @Override
    public void run() {

        Random random = new Random();
        for (int i = 0; i < 5; i++) {

            if (random.nextInt(0,101) % 2 == 0) {

                Ejercicio3.cuenta.ingresarDinero(random.nextDouble(0.0,4000.0));

            } else {

                Ejercicio3.cuenta.retirarDinero(random.nextDouble(0.0,4000.0));

            }

        }

    }
}
class Hilo4 implements Runnable {

    static void main(String[] args) {

        new Thread(new Hilo4()).start();

    }

    @Override
    public void run() {

        Random random = new Random();
        for (int i = 0; i < 5; i++) {

            if (random.nextInt(0,101) % 2 == 0) {

                Ejercicio3.cuenta.ingresarDinero(random.nextDouble(0.0,4000.0));

            } else {

                Ejercicio3.cuenta.retirarDinero(random.nextDouble(0.0,4000.0));

            }

        }

    }
}
class Hilo5 implements Runnable {

    static void main(String[] args) {

        new Thread(new Hilo5()).start();

    }

    @Override
    public void run() {

        Random random = new Random();
        for (int i = 0; i < 5; i++) {

            if (random.nextInt(0,101) % 2 == 0) {

                Ejercicio3.cuenta.ingresarDinero(random.nextDouble(0.0,4000.0));

            } else {

                Ejercicio3.cuenta.retirarDinero(random.nextDouble(0.0,4000.0));

            }

        }

    }
}
