package Probatinas.p2;

import java.util.*;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;

public class ApiStream {

    public static void calculaCuadrados() {



    }

    public static void main(String[] args) {

        calculaCuadrados();

        List<Integer> numbers = Arrays.asList(1,2,3,4,5,6,7,8,22,33,56,13,82);

        Predicate<Integer> isEven = n -> n % 2 == 0;
        Function<Integer,Integer> cuadrado = n -> n * n;
        Consumer<String> imprimir = s -> System.out.println(s);
        Supplier<Integer> random = () -> new Random().nextInt(0,101);

        List<Integer> cuadradosPares = new ArrayList<>(
                numbers.stream()
                // .filter(n -> n % 2 == 0) // Predicado
                .filter(isEven) // Predicado
                // .map(n -> n * n) // Función
                .map(cuadrado) // Función
                .toList()
        );


        Collections.sort(cuadradosPares, (n1,n2) -> n2 - n1);

        System.out.println(cuadradosPares);

        List<Integer> number2 = new ArrayList<>(Arrays.asList(1,2,4,6,8,10,12,14,16,67));

        // Verifica si todos cumplen con la condición
        System.out.println(number2.stream().allMatch(n -> n % 2 == 0)); // Todos son pares?

        // Verifica si alguno cumple con la condición
        System.out.println(number2.stream().anyMatch(n -> n % 2 != 0)); // Hay alguno impar?

        // Otros métodos: noneMatch, findAny, findFirst

        // Count cuenta
        System.out.println(number2.stream().filter(n -> n % 2 != 0).count());

        // Ver ejemplos flatmap
    }

}