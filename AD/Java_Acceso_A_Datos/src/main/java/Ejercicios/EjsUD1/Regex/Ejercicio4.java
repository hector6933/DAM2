package Ejercicios.EjsUD1.Regex;

import java.util.regex.Pattern;

public class Ejercicio4 {

    public static boolean validarPass(String pass) {

        return Pattern.matches("^(?=.*[A-Z])(?=.*[a-z])(?=.*\\d)(?=.*[$@½€#/¬()&%!?¿ºª=.-:<>]).{8,}$",pass);

    }

    static void main(String[] args) {

        // (al menos 8 caracteres, una letra mayúscula, una letra minúscula, un número y un carácter especial).
        String pass1 = "Ad2$fghjkm";
        String pass2 = "##2$%&&/&&&&";
        String pass3 = "##2$%&&/&&&&A";
        String pass4 = "##2$%&&/&&&&Aa";

        System.out.println(validarPass(pass1));
        System.out.println(validarPass(pass2));
        System.out.println(validarPass(pass3));
        System.out.println(validarPass(pass4));


    }

}
