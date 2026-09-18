package Ejercicios.EjsUD1.Set;

import java.util.*;

public class Ej2 {

    public static Set<Integer> numerosUnicos(List<Integer> lista) {

        return new HashSet<>(lista);

    }

    static void main(String[] args) {

        List<Integer> numeros = new ArrayList<>(Arrays.asList(2,2,3,33,4,5,6,77,77,6,3,3,5,218,283,837,8137,47,8234,84,11,1,1));

        System.out.println(numeros);
        System.out.println(numerosUnicos(numeros));



    }

}
