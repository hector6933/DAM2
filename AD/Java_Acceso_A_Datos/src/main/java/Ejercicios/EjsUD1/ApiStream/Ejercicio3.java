package Ejercicios.EjsUD1.ApiStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.UnaryOperator;

public class Ejercicio3 {

    static void main(String[] args) {

        Random random = new Random();

        List<Integer> lista = new ArrayList<>();

        do {

            lista.add(random.nextInt(1,500));

        } while (lista.size() != 250);

        Function<Integer,Integer> cubizar = e -> (int) Math.pow(e,3);

        System.out.println(lista);
        lista.replaceAll(e -> (int) Math.pow(e,3));

        System.out.println(lista);

    }

}
