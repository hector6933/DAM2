package UD1.EjsUD1.Regex;

import java.util.ArrayList;
import java.util.List;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio1 {

    static void main(String[] args) {

        // Las 3 comillas es para que pueda hacer saltos de línea y que se vea mejor
        // que locura no sabía yo esto
        String texto = """
                El servidor principal tiene la IP 192.168.1.1 y responde correctamente.
                Sin embargo, la IP 256.100.50.25 no es válida porque 256 supera el límite permitido.
                Otro equipo de la red usa 10.0.0.254 sin ningún problema.
                Hay un error de configuración en 192.168.1.999, ya que 999 no es un octeto válido.
                La IP de loopback 127.0.0.1 se usa para pruebas locales.
                También encontramos 172.16.0.1 como puerta de enlace.
                Un caso raro es 192.168.01.1, con un cero a la izquierda que algunos validadores rechazan.
                La dirección 8.8.8.8 corresponde a un DNS público conocido.
                Por error, alguien escribió 192.168.1 sin el cuarto octeto.
                La IP 300.1.1.1 tampoco es válida, ya que 300 excede el rango de 0 a 255.
                El router de casa tiene la IP 192.168.0.1 configurada por defecto.
                Un texto con muchos puntos como 1.2.3.4.5 tampoco debería considerarse válido.
                La IP 255.255.255.255 es la dirección de broadcast.
                Finalmente, 0.0.0.0 representa todas las interfaces disponibles.
                toma geroma pastillas de goma, esto es para comprobar si el lookbehind funciona 31192.168.1.1
                """;

        List<String> direcciones = new ArrayList<>();

        // Matcher matcher = Pattern.compile("(([1-9]?[0-9]|1[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}([1-9]?[0-9]|1[0-9]?[0-9]|2[0-4][0-9]|25[0-5])").matcher(texto);
        // [192.168.1.1, 10.0.0.254, 127.0.0.1, 172.16.0.1, 8.8.8.8, 192.168.0.1, 1.2.3.4, 255.255.255.255, 0.0.0.0]
        // Si no pongo el lookbehind y el look ahead me muestra más ips, ya que según el regex son válidas pero vienen de un texto erroneo
        // Como 256.100.50.25 -> 56.100.50.25 es válido
        // [192.168.1.1, 56.100.50.25, 10.0.0.25, 192.168.1.99, 127.0.0.1, 172.16.0.1, 8.8.8.8, 0.1.1.1, 192.168.0.1, 1.2.3.4, 255.255.255.25, 0.0.0.0, 192.168.1.1]

        Matcher matcher = Pattern.compile("(?<!\\d)(([1-9]?[0-9]|1[0-9]?[0-9]|2[0-4][0-9]|25[0-5])\\.){3}([1-9]?[0-9]|1[0-9]?[0-9]|2[0-4][0-9]|25[0-5])(?!\\d)").matcher(texto);
        while (matcher.find()) {

            direcciones.add(matcher.group());

        }

        System.out.println(direcciones);

    }

}
