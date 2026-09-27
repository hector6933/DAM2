package Ejercicios.EjsUD1.Ficheros;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.List;

public class Ejercicio4 {

    static void main(String[] args) {

        File destino = new File("src/main/java/Ejercicios/EjsUD1/Ficheros/Combinacion.txt");
        if (!destino.delete()) {

            System.out.println("No se ha podido borrar el archivo!");
            return;

        }

        List<String> archivos = new ArrayList<>();
        archivos.add("src/main/java/Ejercicios/EjsUD1/Ficheros/Archivo4.txt");
        archivos.add("src/main/java/Ejercicios/EjsUD1/Ficheros/Archivo1.txt");
        archivos.add("src/main/java/Ejercicios/EjsUD1/Ficheros/Archivo2.txt");

        archivos.forEach(a -> {

            try (FileInputStream inputStream = new FileInputStream(new File(a));
                 FileOutputStream outputStream = new FileOutputStream(destino,true)){

                outputStream.write(inputStream.readAllBytes());
                outputStream.write("\n".getBytes()); // Esto es para hacer un salto de línea

            } catch (Exception e) {

                System.out.println("Error en la lecutra/escritura del archivo");
                e.printStackTrace();

            }

        });

    }

}
