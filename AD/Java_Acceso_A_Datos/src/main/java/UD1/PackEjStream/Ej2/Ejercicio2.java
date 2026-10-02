package UD1.PackEjStream.Ej2;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.FileReader;
import java.io.FileWriter;
import java.util.Locale;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Ejercicio2 {

    static void main(String[] args) {

        // Voy a buscar y reemplazar todas las palabras a mayúsculas

        try (BufferedReader leer = new BufferedReader(new FileReader("src/main/java/UD1/PackEjStream/Ej2/Archivo.txt"));
             BufferedWriter escribir = new BufferedWriter(new FileWriter("src/main/java/UD1/PackEjStream/Ej2/Archivo2.txt"))){

            String linea;
            while ((linea = leer.readLine()) != null) {

                StringBuilder nuevaLinea = new StringBuilder();

                Matcher matcher = Pattern.compile("([A-Za-zÁÉÍÓÚáéíóúÑñÜü])").matcher(linea);

                while (matcher.find()) {

                    // Esto añade todo el texto que hay entre coincidencias
                    // por ejemplo: "coincidencia hola que tal coincidencia" añade "hola que tal" tal cual
                    // y al momento de añadir la coincidencia añade el segundo parámetro que le hemos pasado
                    // osea que transforma la coincidencia
                    matcher.appendReplacement(nuevaLinea, matcher.group().toUpperCase(Locale.ROOT));

                }

                // Si al final del texto no hay una coincidencia esto añade todo el texto restante
                // por ejemplo: "coincidencia hola que tal pascual" añade el texto restante "hola que tal pascual"
                matcher.appendTail(nuevaLinea);

                escribir.write(nuevaLinea.toString());
                escribir.newLine();
                
            }

        } catch (Exception e) {

            System.out.println("Error en la lectura/escritura del archivo!!!");
            e.printStackTrace();

        }

    }

}
