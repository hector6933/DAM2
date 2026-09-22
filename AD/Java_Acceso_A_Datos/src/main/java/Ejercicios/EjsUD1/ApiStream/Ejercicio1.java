package Ejercicios.EjsUD1.ApiStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Predicate;

public class Ejercicio1 {

    static void main(String[] args) {

        Random random = new Random();

        List<Integer> lista = new ArrayList<>();

        do {

            lista.add(random.nextInt(1,1001));

        } while (lista.size() != 250);

        Predicate<Integer> filtradoImpares = e -> e % 2 != 0;

        lista.removeIf(filtradoImpares);

        System.out.println(lista);



    }

}
