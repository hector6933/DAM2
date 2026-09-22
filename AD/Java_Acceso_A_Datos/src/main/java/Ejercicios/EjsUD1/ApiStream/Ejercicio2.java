package Ejercicios.EjsUD1.ApiStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

public class Ejercicio2 {

    static void main(String[] args) {

        List<String> palabras = new ArrayList<>(Arrays.asList(
                "montaña", "ordenador", "sol", "biblioteca", "gato",
                "ventana", "río", "programación", "café", "estrella",
                "pan", "universidad", "luz", "teléfono", "bosque",
                "silla", "aeropuerto", "mar", "chocolate", "puerta",
                "nube", "escritorio", "flor", "computadora", "camino",
                "jardín", "libro", "reloj", "playa", "música"
        ));

        Consumer<String> imprimir = System.out::println;

        palabras.forEach(imprimir);



    }

}
