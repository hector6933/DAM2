package Ejercicios.EjsUD1.ApiStreamBusqueda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class Ejercicio4 {

    static void main(String[] args) {

        List<Persona> personas = new ArrayList<>(Arrays.asList(
                new Persona("Lucía", 28),
                new Persona("Marcos", 34),
                new Persona("Sofía", 19),
                new Persona("Hugo", 45),
                new Persona("Martina", 22),
                new Persona("Pablo", 31),
                new Persona("Valeria", 27),
                new Persona("Daniel", 52),
                new Persona("Carla", 16),
                new Persona("Adrián", 39),
                new Persona("Elena", 24),
                new Persona("Diego", 63),
                new Persona("Paula", 30),
                new Persona("Javier", 41),
                new Persona("Claudia", 18),
                new Persona("Álvaro", 55),
                new Persona("Nerea", 26),
                new Persona("Iván", 47),
                new Persona("Alba", 20),
                new Persona("Sergio", 36)
        ));

        // System.out.println(personas.stream().sorted(Comparator.comparing(Persona::getEdad)).toList());
        System.out.println(personas.stream().sorted(Comparator.comparing(Persona::getNombre)).toList());


    }

}

class Persona {

    private String nombre;
    private Integer edad;

    public Persona() {
    }

    public Persona(String nombre, Integer edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Persona{" +
                "nombre='" + nombre + '\'' +
                ", edad=" + edad +
                '}';
    }
}