package Tema1.Ejercicios1;

import java.io.IOException;

public class Ejercicio1 {

    static void main(String[] args) {

        try {

            Process notepadPlusPlus = new ProcessBuilder(
                    "C:\\Program Files\\Notepad++\\notepad++.exe",
                    "C:\\Users\\dam2\\Documents\\archivo.txt"
            ).start();

        } catch (IOException e) {

            e.printStackTrace();

        }

    }

}
