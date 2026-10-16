package Ejercicio2;

public class Main {

    static void main(String[] args) throws InterruptedException {

        ColaTareas cola = new ColaTareas();

        Thread productor = new Thread(new Productor(cola));
        Thread consumidor1 = new Thread(new Consumidor(cola,1));
        Thread consumidor2 = new Thread(new Consumidor(cola,2));

        productor.start();
        consumidor1.start();
        consumidor2.start();

        productor.join();
        consumidor1.join();
        consumidor2.join();

    }

}
