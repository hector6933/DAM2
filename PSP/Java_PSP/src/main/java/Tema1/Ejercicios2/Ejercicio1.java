package Tema1.Ejercicios2;

import java.util.Scanner;

public class Ejercicio1 {

    static void main(String[] args) {

        Scanner leer = new Scanner(System.in);

        System.out.println("¿Qué programa desea ejecutar?");
        System.out.print("> ");
        String input = leer.nextLine();

        try {

            new ProcessBuilder(input).start();

        } catch (Exception e) {

            System.out.println("Error");
            e.printStackTrace();

        }


        leer.close();

    }

}
