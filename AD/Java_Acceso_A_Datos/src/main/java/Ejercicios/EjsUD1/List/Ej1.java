package Ejercicios.EjsUD1.List;

import java.util.ArrayList;
import java.util.List;

public class Ej1 {

    static void main() {

        List<String> lista = new ArrayList<>();

        lista.add("Pascual");
        lista.add("Polvo");
        lista.add("Mayones");
        lista.add("Boeing747");
        lista.add("Ethernet");
        lista.add("Switch");
        lista.add("Tiburón");

        lista.forEach(System.out::println);

    }

}
