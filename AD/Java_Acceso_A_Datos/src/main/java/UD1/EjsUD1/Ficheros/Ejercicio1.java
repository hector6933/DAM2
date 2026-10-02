package UD1.EjsUD1.Ficheros;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class Ejercicio1 {

    static void main(String[] args) throws IOException {

        // File fichero = new File("src/main/java/Ejercicios/UD1.EjsUD1/Ficheros/Archivo1.txt");

        // El método lines convierte el fichero en un List de Strings con cada línea
        System.out.println(Files.lines(Path.of("src/main/java/Ejercicios/UD1.EjsUD1/Ficheros/Archivo1.txt")).count());

    }

}
