package Ejercicios.EjsUD1.Lambda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Locale;
import java.util.function.Predicate;

public class Ejercicio2 {

    static void main(String[] args) {

        List<String> lista = new ArrayList<>(Arrays.asList("Pascual","Trump","Chufi","Netanyahu","Obama","Pepe","Ángel","Alpaca"));

        lista.removeIf(e -> !e.toLowerCase().startsWith("a") && !e.toLowerCase().startsWith("á"));

        System.out.println(lista);

    }

}
