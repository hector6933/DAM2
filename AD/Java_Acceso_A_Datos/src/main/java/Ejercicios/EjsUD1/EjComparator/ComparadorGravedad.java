package Ejercicios.EjsUD1.EjComparator;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.PriorityQueue;

public class ComparadorGravedad {

    static void main(String[] args) {

        List<Paciente> pacientes = new ArrayList<>(List.of(
                new Paciente("Ana", 5, LocalDateTime.parse("2026-09-16T10:01")),
                new Paciente("Luis", 9, LocalDateTime.parse("2026-09-16T10:02")),
                new Paciente("Marta", 9, LocalDateTime.parse("2026-09-16T10:03")),
                new Paciente("Pepe", 3, LocalDateTime.parse("2026-09-16T10:04")),
                new Paciente("Sonia", 7, LocalDateTime.parse("2026-09-16T10:05")),
                new Paciente("Raúl", 4, LocalDateTime.parse("2026-09-16T10:06")),
                new Paciente("Julia", 10, LocalDateTime.parse("2026-09-16T10:07")),
                new Paciente("Iván", 6, LocalDateTime.parse("2026-09-16T10:08")),
                new Paciente("Clara", 8, LocalDateTime.parse("2026-09-16T10:09")),
                new Paciente("Diego", 2, LocalDateTime.parse("2026-09-16T10:10")),
                new Paciente("Nora", 10, LocalDateTime.parse("2026-09-16T10:11")),
                new Paciente("Óscar", 1, LocalDateTime.parse("2026-09-16T10:12")),
                new Paciente("Belén", 7, LocalDateTime.parse("2026-09-16T10:13")),
                new Paciente("Víctor", 5, LocalDateTime.parse("2026-09-16T10:14")),
                new Paciente("Paula", 9, LocalDateTime.parse("2026-09-16T10:15")),
                new Paciente("Sergio", 4, LocalDateTime.parse("2026-09-16T10:16")),
                new Paciente("Irene", 6, LocalDateTime.parse("2026-09-16T10:17")),
                new Paciente("Tomás", 8, LocalDateTime.parse("2026-09-16T10:18")),
                new Paciente("Laura", 3, LocalDateTime.parse("2026-09-16T10:19")),
                new Paciente("Rubén", 7, LocalDateTime.parse("2026-09-16T10:20")),
                new Paciente("Pilar", 10, LocalDateTime.parse("2026-09-16T10:21")),
                new Paciente("Andrés", 2, LocalDateTime.parse("2026-09-16T10:22")),
                new Paciente("Carla", 9, LocalDateTime.parse("2026-09-16T10:23")),
                new Paciente("Mario", 6, LocalDateTime.parse("2026-09-16T10:24")),
                new Paciente("Elena", 8, LocalDateTime.parse("2026-09-16T10:25")),
                new Paciente("Fabián", 4, LocalDateTime.parse("2026-09-16T10:26")),
                new Paciente("Rosa", 5, LocalDateTime.parse("2026-09-16T10:27")),
                new Paciente("David", 7, LocalDateTime.parse("2026-09-16T10:28")),
                new Paciente("Silvia", 3, LocalDateTime.parse("2026-09-16T10:29")),
                new Paciente("Héctor", 9, LocalDateTime.parse("2026-09-16T10:30"))
        ));

        Comparator<Paciente> comparador = Comparator.comparing(Paciente::getGravedad).reversed().thenComparing(Paciente::getLlegada);

        PriorityQueue<Paciente> cola = new PriorityQueue<>(comparador);

        cola.addAll(pacientes);

        System.out.println("Cola sin orden de gravedad:");
        cola.forEach(System.out::println);

        System.out.println("---------------------------------------------------------");

        System.out.println("Cola con el orden real de atención a los pacientes: ");
        cola.stream().sorted(comparador).forEach(System.out::println);

        System.out.println("---------------------------------------------------------");

        System.out.println("Atendiendo al siguiente paciente: " + cola.poll());
        System.out.println("Atendiendo al siguiente paciente: " + cola.poll());
        System.out.println("Atendiendo al siguiente paciente: " + cola.poll());
        System.out.println("Atendiendo al siguiente paciente: " + cola.poll());

    }

}
