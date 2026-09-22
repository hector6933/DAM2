package Ejercicios.EjsUD1.ApiStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Consumer;
import java.util.function.Supplier;

public class Ejercicio6 {

    static void main(String[] args) {

        Supplier<Integer> random = () -> new Random().nextInt(1,1001);

        List<Integer> lista = new ArrayList<>();

        do {

            lista.add(random.get());

        } while (lista.size() != 250);

        Consumer<Integer> mult = e -> System.out.print(e*2 + " ");

        lista.forEach(mult);


    }

}
