package Probatinas.p2;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class ListaStringLongitudes {

    public static void main() {

        List<String> list = Arrays.asList("Perro","Elefante","Conejo","Mariposa","Tiranosaurus Rex","Pasc");

        // Collections.sort() ordena alfabéticamente por defecto
        // Esto es para personalizar el tipo de ordenamiento
        // coje el elemento actual s1 y lo compara con el siguiente s2
        // Si da positivo los intercambia, si da negativo no
        Collections.sort(list, (s1,s2) -> s2.length() - s1.length());

        System.out.println(list);

    }

}