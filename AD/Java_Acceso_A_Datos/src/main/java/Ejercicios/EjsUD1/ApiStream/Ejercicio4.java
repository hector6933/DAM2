package Ejercicios.EjsUD1.ApiStream;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

public class Ejercicio4 {

    static void main(String[] args) {


        Supplier<Integer> random = () -> new Random().nextInt(1,100);

        System.out.println(random.get());
        System.out.println(random.get());
        System.out.println(random.get());
        System.out.println(random.get());
        System.out.println(random.get());
        System.out.println(random.get());
        System.out.println(random.get());
        System.out.println(random.get());

    }

}
