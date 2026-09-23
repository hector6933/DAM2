package Probatinas.p4;

import java.io.IOException;
import java.nio.file.*;
import java.nio.file.attribute.BasicFileAttributes;
import java.util.ArrayList;
import java.util.List;

public class Ej6 {

    public static List<Path> findFiles(String directory, String pattern) {
        List<Path> result = new ArrayList<>();
        try {

            Files.walkFileTree(Paths.get(directory), new SimpleFileVisitor<Path>() {
                // Visit file es el método que se ejecuta cada vez que se encunetra un archivo
                // Si el nombre del archivo coincide con el patrón que tenemos lo guardamos en el array
                // Encontremos o no el archivo pasamos a buscar el siguiente con .CONTINUE
                @Override
                public FileVisitResult visitFile(Path file, BasicFileAttributes attrs) throws IOException {
                    if (file.getFileName().toString().matches(pattern)) {
                        result.add(file);
                    }
                    return FileVisitResult.CONTINUE;
                }
            });
        } catch (IOException e) {
            e.printStackTrace();
        }
        return result;
    }

    public static void main(String[] args) {
        String ruta = "src";
        String patron = "*.java";

        String directory = ruta;
        String pattern = patron.replace("*", ".*"); // Esto lo trasnforma a .*.java que significa cualquier cosa cero o muchas veces seguido de .java
        System.out.println(pattern);
        List<Path> files = findFiles(directory, pattern);

        for (Path file : files) {
            System.out.println(file);
        }
    }
}
