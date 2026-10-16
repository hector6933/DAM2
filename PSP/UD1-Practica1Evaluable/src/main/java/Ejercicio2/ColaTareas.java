package Ejercicio2;

import java.util.PriorityQueue;
import java.util.Queue;

public class ColaTareas {

    private final Queue<Integer> cola = new PriorityQueue<>();
    private final Integer max = 3;

    synchronized public void producir(int tarea) throws InterruptedException {

        while (cola.size() >= max) {

            wait();

        }
        cola.add(tarea);
        System.out.println("[Productor] Tarea producida: " + tarea);
        notifyAll();

    }

    synchronized public Integer consumir(Integer num) throws InterruptedException {

        while (cola.isEmpty()) {

            wait();

        }

        if (cola.peek() < 0) {

            return null;

        }

        Integer tarea = cola.poll();
        System.out.println("[Consumidor" + num + "] Tarea procesada: " + tarea);
        notifyAll();
        return tarea;

    }

    synchronized public Queue<Integer> getCola() {
        return cola;
    }

    synchronized public Integer getMax() {
        return max;
    }
}
