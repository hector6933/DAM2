package Ejercicios.EjsUD1.Map;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class Ej3 {

    public static Map<String, Estudiante> mapaEstudiantes(List<Estudiante> estudiantes) {

        // return estudiantes.stream().collect(Collectors.toMap(Estudiante::getNombre, Function.identity()));
        return estudiantes.stream().collect(Collectors.toMap(e -> e.getNombre(), e -> e));

//        Map<String,String> mapa = new HashMap<>();
//
//        estudiantes.forEach(e -> {
//
//            mapa.put(e.getNombre(), e.getEdad() + " " + e.getGrado());
//
//        });
//
//        return mapa;
    }

    static void main() {

        List<Estudiante> estudiantes = new ArrayList<>(List.of(
                new Estudiante("Lucía Fernández", "1º ESO", 12),
                new Estudiante("Marcos Gómez", "1º ESO", 13),
                new Estudiante("Sofía Martínez", "2º ESO", 13),
                new Estudiante("Hugo Sánchez", "2º ESO", 14),
                new Estudiante("Martina López", "3º ESO", 14),
                new Estudiante("Pablo Díaz", "3º ESO", 15),
                new Estudiante("Valeria Ruiz", "4º ESO", 15),
                new Estudiante("Daniel Torres", "4º ESO", 16),
                new Estudiante("Carla Jiménez", "1º Bachillerato", 16),
                new Estudiante("Adrián Moreno", "1º Bachillerato", 17),
                new Estudiante("Elena Muñoz", "2º Bachillerato", 17),
                new Estudiante("Diego Álvarez", "2º Bachillerato", 18),
                new Estudiante("Paula Romero", "1º ESO", 12),
                new Estudiante("Javier Navarro", "2º ESO", 13),
                new Estudiante("Claudia Gil", "3º ESO", 14),
                new Estudiante("Álvaro Serrano", "4º ESO", 15),
                new Estudiante("Nerea Ortiz", "1º Bachillerato", 16),
                new Estudiante("Iván Molina", "2º Bachillerato", 18),
                new Estudiante("Alba Delgado", "1º ESO", 13),
                new Estudiante("Sergio Castro", "3º ESO", 15)
        ));

        System.out.println(mapaEstudiantes(estudiantes));


    }

}

class Estudiante {

    private String nombre;
    private String grado;
    private Integer edad;

    public Estudiante() {
    }

    public Estudiante(String nombre, String grado, Integer edad) {
        this.nombre = nombre;
        this.grado = grado;
        this.edad = edad;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGrado() {
        return grado;
    }

    public void setGrado(String grado) {
        this.grado = grado;
    }

    public Integer getEdad() {
        return edad;
    }

    public void setEdad(Integer edad) {
        this.edad = edad;
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "nombre='" + nombre + '\'' +
                ", grado='" + grado + '\'' +
                ", edad=" + edad +
                '}';
    }
}