package Ejercicios.EjsUD1.Ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ejercicio2 {

    static void main(String[] args) {

        // Mira, no he visto la solución, pero como sea una sufrida con el buffer reader siendo esto tan simple
        try {
            Files.copy(Path.of("src/main/java/Ejercicios/EjsUD1/Ficheros/Archivo2.txt"),Path.of("src/main/java/Ejercicios/EjsUD1/Ficheros/Archivo2-copia.txt"));
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

    }

}
