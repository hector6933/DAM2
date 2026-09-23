package Probatinas.p3;

import java.io.BufferedReader;
import java.io.FileReader;
import java.nio.file.Files;
import java.nio.file.Path;

public class LeerLineasFIch {

    static void main(String[] args) {

        String ruta = "src/main/java/Probatinas/p3/fichero.txt";

        try (BufferedReader leer = new BufferedReader(new FileReader(ruta))){

            int lineas = 0;
            String linea;
            while ((linea = leer.readLine()) != null) {

                lineas++;

            }

            System.out.println("Hay un total de " + lineas + " lineas");

            System.out.println(
                    "Hay un total de " +
                    Files.lines(Path.of("src/main/java/Probatinas/p3/fichero.txt")).count()
                    + " lineas");

        } catch (Exception e) {

            System.out.println("Error al leer el archivo!!!");

        }



    }

}
