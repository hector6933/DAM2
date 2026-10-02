package UD1.EjsUD1.Regex;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.format.DateTimeParseException;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio3 {

    public static boolean validarFecha(String fecha) {

        DateTimeFormatter formato = DateTimeFormatter.ofPattern("dd/MM/yyyy");

        try {

            LocalDate.parse(fecha, formato);
            // Si es inválido lanza la excepción antes de llegar aquí
            return true;

        } catch (DateTimeParseException e) {

            // El método de parse lanza excepción si no se puede parsear, osea que no es una fecha válida
            return false;

        }


    }


    static void main(String[] args) {

        // Válidar fechas con regex al completo es imposible y complicarse demasiado, asi que me la suda y lo hago con localdate

        String texto = """
                La reunión quedó fijada para el 15/03/2024 por la mañana.
                Sin embargo, alguien escribió por error 31/04/2024, y abril no tiene 31 días.
                El contrato se firmó el 01/01/2023 sin ningún problema.
                Hay un error claro en 32/12/2023, ya que no existe el día 32.
                La matcherFecha de nacimiento registrada es 29/02/2024, válida porque 2024 es bisiesto.
                En cambio, 29/02/2023 no es válida, porque 2023 no es año bisiesto.
                El evento del año pasado fue el 25/12/2022, para la cena de Navidad.
                Por error de tipeo aparece 15/13/2023, y no existe el mes 13.
                La matcherFecha límite es el 30/06/2024 para entregar la documentación.
                Alguien escribió 00/05/2023, y el día 00 no es válido.
                El aniversario de la empresa es el 10/10/2020.
                También hay un caso raro como 05/00/2023, con mes 00 inexistente.
                La cita médica quedó para el 28/02/2023, último día de febrero ese año.
                Un error de formato aparece en 5/3/2024, sin los ceros a la izquierda.
                El pago se procesó el 31/07/2024 sin incidencias.
                Finalmente, 31/11/2023 tampoco es válida, porque noviembre solo tiene 30 días.
                """;

        Matcher matcherFecha = Pattern.compile("(?<!\\d)(\\d{2}/){2}\\d{4}(?!\\d)").matcher(texto);

        while (matcherFecha.find()) {

            String fecha = matcherFecha.group();

            if (validarFecha(fecha)) {

                System.out.println(fecha);

            }

        }


    }


}
