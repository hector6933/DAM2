package Ejercicios.EjsUD1.Map;

import java.util.*;

public class Ej2 {

    static void main(String[] args) {

        List<String> listaGrande = new ArrayList<>(List.of(
                "manzana", "banana", "uva", "manzana", "pera",
                "banana", "kiwi", "manzana", "naranja", "uva",
                "pera", "sandía", "banana", "kiwi", "melón",
                "manzana", "naranja", "uva", "pera", "sandía",
                "melón", "banana", "kiwi", "naranja", "manzana",
                "piña", "sandía", "melón", "uva", "piña",
                "banana", "manzana", "pera", "kiwi", "naranja",
                "piña", "melón", "sandía", "uva", "manzana"
        ));

        // System.out.println(Collections.frequency(listaGrande,"manzana"));

        Map<String,Integer> mapa = new HashMap<>();

        listaGrande.forEach(s -> mapa.put(s, mapa.getOrDefault(s,0) + 1));

        System.out.println(mapa);

    }
}
