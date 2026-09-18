package Ejercicios.EjsUD1.Set;

import java.util.Arrays;
import java.util.HashSet;
import java.util.Set;

public class Ej1 {

    static void main() {

        Set<String> miSet = new HashSet<>(Arrays.asList("Teclado","Jabón","Astronauta","Cobre","Pino","Goma","Escuchar"));


        miSet.forEach(System.out::println);

        String hola = "Jabón";

        System.out.println(hola.hashCode());




    }

}
