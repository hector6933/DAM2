package UD1.EjsUD1.Regex;

import java.util.regex.Pattern;

public class Ejercicio2 {

    public static boolean validarTlf(String tlf) {

        return Pattern.matches("^\\(\\d{3}\\) \\d{3} - \\d{4}$",tlf);

    }

    static void main(String[] args) {

        String valido = "(123) 456 - 7890";
        String inValido = "(1234) 456 - 890";
        String inValido2 = "(123) 4567 - 890";
        String inValido3 = "123 - (456) - 7890";

        System.out.println(validarTlf(valido));
        System.out.println(validarTlf(inValido));
        System.out.println(validarTlf(inValido2));
        System.out.println(validarTlf(inValido3));



    }

}
