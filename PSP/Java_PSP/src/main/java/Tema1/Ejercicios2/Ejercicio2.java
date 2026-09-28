package Tema1.Ejercicios2;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {

    static void main(String[] args) {

        try {

            Process proceso =  new ProcessBuilder
                    ("cmd","/c","C:\\Users\\dam2\\Desktop\\DAM2\\PSP\\Java_PSP\\src\\main\\java\\Tema1\\Ejercicios2\\comandos2.bat")
                    .redirectOutput(new File("src/main/java/Tema1/Ejercicios2/archivo2.txt"))
                    .redirectError(new File("src/main/java/Tema1/Ejercicios2/errores2.txt"))
                    .start();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
