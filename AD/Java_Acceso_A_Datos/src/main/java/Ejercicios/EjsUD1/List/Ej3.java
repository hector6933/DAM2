package Ejercicios.EjsUD1.List;

import java.util.*;

public class Ej3 {

    public static Optional<String> topString(List<String> lista) {

        return lista.stream().max(Comparator.comparingInt(String::length));

    }

    static void main() {

        List<String> lista = new ArrayList<>(Arrays.asList("Pescuezo","Láser","Gomina","Avioneta","Célula","Abogado","Soporte","Comer"));

        topString(lista).ifPresent(System.out::println);

        List<String> listaVacia = new ArrayList<>();

        topString(listaVacia);


    }

}
