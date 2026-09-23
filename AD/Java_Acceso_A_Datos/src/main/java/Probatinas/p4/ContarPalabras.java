package Probatinas.p4;

import java.util.Arrays;
import java.util.Map;
import java.util.stream.Collectors;

public class ContarPalabras {
    public static void main(String[] args) {
        String text = "este es un ejemplo de texto para contar palabras este texto puede ser todo lo largo que quieras este";

        // \\s+ encuentra espacios, por lo que el split separa el texto por espacios osea que coge las palabras
        // Luego el collectors agrupa por palabras, por lo que al agrupar sabe cuantas veces hay una palabra agrupada
        Map<String, Long> wordCount = Arrays.stream(text.split("\\s+"))
                .collect(Collectors.groupingBy(word -> word, Collectors.counting()));

        System.out.println(wordCount);
    }
}
