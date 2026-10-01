package Tema1.Ejercicios3.Ejercicio4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Hilo1 implements Runnable{

    static void main(String[] args) {

        new Thread(new Hilo1());

    }

    @Override
    public void run() {

        List<String> lista = new ArrayList<>(Arrays.asList("Programas","Procesos","Servicios","Hilos"));

        for (int i = 0; i < lista.size(); i++) {

            try {

                System.out.println(lista.get(i));
                Thread.sleep(4000);

            } catch (InterruptedException ex) {

                for (int j = i; j < lista.size(); j++) {

                    System.out.println(lista.get(j));

                }
                return;

            }

        }

    }
}
