package Ejercicios.EjsUD1.ApiStreamBusqueda;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Ejercicio3 {

    static void main(String[] args) {

        // Le meto long ya que la suma es muy grande
        Random random = new Random();

        List<Long> numeros = new ArrayList<>();

        do {

            numeros.add(random.nextLong(0,1001));

        } while (numeros.size() != 100);

        System.out.println(numeros);

        Long suma = numeros.stream().reduce((num,total) -> total += num * num).orElse(null);

        System.out.println(suma);


    }

}
