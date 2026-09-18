package Ejercicios.EjsUD1.List;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ej2 {

    public static List<Integer> obtenerListaPares(List<Integer> lista) {

        return lista.stream().filter(n -> n % 2 == 0).toList();

    }

    static void main() {

        List<Integer> lista = new ArrayList<>(Arrays.asList(1,2,3,4,5,5,55,66,74,723,129848,1281,76,67));

        System.out.println(obtenerListaPares(lista));


    }

}
