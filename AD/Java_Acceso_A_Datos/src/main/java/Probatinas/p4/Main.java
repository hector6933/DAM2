package Probatinas.p4;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {
        Persona persona = new Persona("Juan", 30);
        Persona persona2 = new Persona();
        persona2.setNombre("Pedro");
        persona2.setEdad(25);
        Persona persona3 = new Persona("Maria", 40);
        Persona persona4 = new Persona("Antonio",60);
        Persona persona5 = new Persona("Lucia", 20);
        Persona persona6 = new Persona("Carlos", 35);
        Persona persona7 = new Persona("Ana", 50);
        Persona persona8 = new Persona("Sofia", 45);
        Persona persona9 = new Persona("Javier", 55);
        Persona persona10 = new Persona("Laura", 15);
        List<Persona> listaPersonas = List.of(persona, persona2, persona3, persona4, persona5, persona6, persona7, persona8, persona9, persona10);
        // List<Persona> listaPersonas = new ArrayList<>();

        // .orElse() sirve para devolver algo en caso de que no haya ningún elemento en la lista
        // por lo que no puede devolver el objeto que se pide y lanzar una excepción
        //Calcula la edad promedio de las personas
        double edadPromedio = listaPersonas.stream()
                .mapToInt(Persona::getEdad)
                .average()
                .orElse(0);
        System.out.println("Edad promedio: " + edadPromedio);

        //Encuentra la persona más joven
        Persona personaMasJoven = listaPersonas.stream()
                .min((p1, p2) -> p1.getEdad() - p2.getEdad())
                .orElse(null);
        System.out.println("Persona más joven: " + personaMasJoven);

        //Imprime una lista con los nombres de las personas mayores de 30 años
        List<String> nombresMayores30 = listaPersonas.stream()
                .filter(p -> p.getEdad() > 30)
                .map(Persona::getNombre)
                .toList();
        System.out.println("Nombres de personas mayores de 30 años: " + nombresMayores30);
    }
}
