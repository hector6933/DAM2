package Ejercicios.EjsUD1.ApiStream;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

public class Ejercicio5 {

    static void main(String[] args) {

        List<String> nombres = new ArrayList<>(Arrays.asList(
                "Lucía", "Marcos", "Sofía", "Hugo", "Martina",
                "Pablo", "Valeria", "Daniel", "Carla", "Adrián",
                "Elena", "Diego", "Paula", "Javier", "Claudia",
                "Álvaro", "Nerea", "Iván", "Alba", "Sergio",
                "Marta", "Raúl", "Julia", "Clara", "Óscar",
                "Belén", "Víctor", "Sonia", "Rubén", "Pilar",
                "Andrés", "Mario", "Rosa", "David", "Silvia",
                "Héctor", "Irene", "Tomás", "Laura", "Fabián"
        ));


        Predicate<String> filtrar = e -> e.toLowerCase().startsWith("a") || e.toLowerCase().startsWith("á");

        nombres.removeIf(filtrar.negate());

        System.out.println(nombres);



    }

}
