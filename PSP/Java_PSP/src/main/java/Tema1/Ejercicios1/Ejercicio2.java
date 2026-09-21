package Tema1.Ejercicios1;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {

    static void main(String[] args) {

        try {


            Process notepadConsola = new ProcessBuilder("C:\\Users\\dam2\\Documents\\comandosPing.bat")
                    .redirectInput(ProcessBuilder.Redirect.INHERIT)
                    .redirectOutput(ProcessBuilder.Redirect.INHERIT)
                    .redirectError(ProcessBuilder.Redirect.INHERIT).start();

            File logs = new File("src/main/java/Tema1/Ejercicios1/logs.txt");
            File errores = new File("src/main/java/Tema1/Ejercicios1/errors.txt");
            Process notepadFichero = new ProcessBuilder("C:\\Users\\dam2\\Documents\\comandosPing.bat")
                    .redirectInput(logs)
                    .redirectOutput(logs)
                    .redirectError(errores).start();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
