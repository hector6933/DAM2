package Tema1.Ejercicios1;

import java.io.File;
import java.io.IOException;

public class Ejercicio2 {

    static void main(String[] args) {

        try {

//            Process notepadPlusPlus = new ProcessBuilder("C:\\Users\\dam2\\Documents\\comandosPing.bat")
//                    .redirectInput(ProcessBuilder.Redirect.INHERIT)
//                    .redirectOutput(ProcessBuilder.Redirect.INHERIT)
//                    .redirectError(ProcessBuilder.Redirect.INHERIT).start();

            File fichero = new File("C:\\Users\\dam2\\Documents\\logs.txt");
            Process notepadPlusPlus = new ProcessBuilder("C:\\Users\\dam2\\Documents\\comandosPing.bat")
                    .redirectInput(fichero)
                    .redirectOutput(fichero)
                    .redirectError(fichero).start();



        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
