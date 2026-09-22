package Ejercicios.EjsUD1.Lambda;

interface Calculator{

    Integer calculate(Integer n1, Integer n2);

}

public class Ejercicio1 {

    static void main(String[] args) {

        Calculator suma = (n1, n2) -> n1 + n2;

        Calculator resta = (n1, n2) -> n1 - n2;
        Calculator mult = (n1, n2) -> n1 * n2;
        Calculator div  = (n1, n2) -> n1 / n2;

        System.out.println(suma.calculate(2,3));
        System.out.println(resta.calculate(100,33));
        System.out.println(mult.calculate(6,7));
        System.out.println(div.calculate(12,3));

    }

}
