package Tema1.Ejercicios2;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {

    static void main(String[] args) {

        try {

            Process proceso =  new ProcessBuilder("cmd","/c","echo Usuario actual: && whoami && dir").redirectOutput(new File("src/main/java/Tema1/Ejercicios2/archivo.txt")).start();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
