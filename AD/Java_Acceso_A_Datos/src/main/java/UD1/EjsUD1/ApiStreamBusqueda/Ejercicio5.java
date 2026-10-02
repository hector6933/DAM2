package UD1.EjsUD1.ApiStreamBusqueda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class Ejercicio5 {

    static void main(String[] args) {

        List<Empleado> empleados = new ArrayList<>(Arrays.asList(
                new Empleado("Lucía Fernández", "Ventas"),
                new Empleado("Marcos Gómez", "IT"),
                new Empleado("Sofía Martínez", "Marketing"),
                new Empleado("Hugo Sánchez", "IT"),
                new Empleado("Martina López", "Recursos Humanos"),
                new Empleado("Pablo Díaz", "Ventas"),
                new Empleado("Valeria Ruiz", "Finanzas"),
                new Empleado("Daniel Torres", "IT"),
                new Empleado("Carla Jiménez", "Marketing"),
                new Empleado("Adrián Moreno", "Ventas"),
                new Empleado("Elena Muñoz", "Recursos Humanos"),
                new Empleado("Diego Álvarez", "Finanzas"),
                new Empleado("Paula Romero", "IT"),
                new Empleado("Javier Navarro", "Ventas"),
                new Empleado("Claudia Gil", "Marketing"),
                new Empleado("Álvaro Serrano", "Finanzas"),
                new Empleado("Nerea Ortiz", "Recursos Humanos"),
                new Empleado("Iván Molina", "IT"),
                new Empleado("Alba Delgado", "Ventas"),
                new Empleado("Sergio Castro", "Marketing")
        ));

        // Empleados agrupados por departamento
        System.out.println(
                empleados.stream().collect(Collectors.groupingBy(Empleado::getDepartamento))
        );

        // Sacar cuántos empleados hay en cada departamento
        System.out.println(
                empleados.stream().collect(Collectors.groupingBy(Empleado::getDepartamento,Collectors.counting()))
        );

        // Mostrar solo los empleados de ventas
        // Como lo que devuelve es un mapa puedo usar el método del mapa get para que solo imprima los valores con clave Ventas
        System.out.println(
                empleados.stream().collect(Collectors.groupingBy(Empleado::getDepartamento)).get("Ventas")
        );
        // También se puede hacer con un filter y devolver una lista y ya
        System.out.println(
                empleados.stream().filter(e -> e.getDepartamento().equalsIgnoreCase("ventas")).toList()
        );

        // Devolver el departamento dado el nombre de un empleado
        String nombre = "Marcos Gómez";
        System.out.println(
                empleados.stream().filter(e -> e.getNombre().equalsIgnoreCase(nombre)).map(Empleado::getDepartamento).findFirst().orElse("Empleado no encontrado")
        );

    }


}

class Empleado {

    private String nombre;
    private String departamento;

    public Empleado() {
    }

    public Empleado(String nombre, String departamento) {
        this.nombre = nombre;
        this.departamento = departamento;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getDepartamento() {
        return departamento;
    }

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    @Override
    public String toString() {
        return "Empleado{" +
                "nombre='" + nombre + '\'' +
                ", departamento='" + departamento + '\'' +
                '}';
    }
}
