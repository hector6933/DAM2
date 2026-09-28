package Probatinas.p4;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class PruebaEquals {

    static void main() {

        List<Persona> personas = new ArrayList<>(Arrays.asList(new Persona("pascual",33), new Persona("pascual",33),new Persona("angel",33)));

        System.out.println(personas);
        System.out.println(personas.stream().distinct().toList());

    }

}
