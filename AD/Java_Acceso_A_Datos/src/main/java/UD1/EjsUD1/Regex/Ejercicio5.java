package UD1.EjsUD1.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio5 {

    static void main(String[] args) {

        List<String> palabras = new ArrayList<>();

        String texto = """
                María fue al mercado con Juan para comprar fruta fresca.
                El Sol brillaba con fuerza sobre la Ciudad de Madrid esta mañana.
                Cuando llegó Pedro, todos estaban reunidos en la Plaza Mayor.
                La empresa Google anunció nuevas funciones para Android este mes.
                Ana y Carlos viajaron a Barcelona durante las vacaciones de Verano.
                El río Amazonas atraviesa gran parte de Sudamérica.
                Netflix estrenó una serie ambientada en París durante los años Ochenta.
                Mi profesor de Historia se llama Fernando Rodríguez.
                El Everest es la montaña más alta del Mundo.
                Lucía trabaja en Microsoft desde hace Tres años Y .
                """;

        Matcher matcher = Pattern.compile("[A-ZÁÉÍÓÚ][A-Za-zÁÉÍÓÚáéíóú]*").matcher(texto);

        while (matcher.find()) {

            palabras.add(matcher.group());

        }

        System.out.println(palabras);
        System.out.println("Hay un total de " + palabras.size() + " palabras que empiezan por mayúscula");


    }

}
