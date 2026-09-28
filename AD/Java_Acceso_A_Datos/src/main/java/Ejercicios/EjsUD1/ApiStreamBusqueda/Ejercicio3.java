package Ejercicios.EjsUD1.ApiStreamBusqueda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio3 {

    static void main(String[] args) {

        // Le meto long ya que la suma es muy grande
        Random random = new Random();

        List<Integer> numeros = new ArrayList<>();

        do {

            numeros.add(random.nextInt(0,101));

        } while (numeros.size() != 100);

        System.out.println(numeros);

        // Long suma = numeros.stream().reduce((num,total) -> total += num * num).orElse(null);
        Integer suma = numeros.stream().map(n -> n*n).reduce(0, Integer::sum);
        System.out.println(suma);


    }

}
