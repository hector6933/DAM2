package Ejercicios.EjsUD1.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Ejercicio2 {

    static void main(String[] args) {

        List<String> lista = new ArrayList<>(Arrays.asList("Pascual","Trump","Chufi","Netanyahu","Obama","Pepe","Ángel","Alpaca"));

        Predicate<String> filtrado =e -> e.toLowerCase().startsWith("a") || e.toLowerCase().startsWith("á");

        List<String> listaFiltrada = new ArrayList<>(lista.stream().filter(filtrado).toList());

        System.out.println(listaFiltrada);

    }

}
