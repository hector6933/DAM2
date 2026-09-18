package Ejercicios.EjsUD1.Set;

import java.util.*;

public class Ej3 {

    public static Set<String> numerosUnicos(List<String> lista) {

        return new HashSet<>(lista);

    }

    static void main(String[] args) {

        List<String> strings = new ArrayList<>(Arrays.asList("Joserra","Cable","Piedra","Piedra","Punto y coma","Punto","Punto","Asterísco","Carretera","Abujero","Abujero","Carretera"));

        System.out.println(strings);
        System.out.println(numerosUnicos(strings));



    }

}
