package Ejercicios.EjsUD1.EjComparator;

import java.time.LocalDateTime;

public class Paciente {

    private String nombre;
    private Integer gravedad;
    private LocalDateTime llegada;

    public Paciente() {
    }

    public Paciente(String nombre, Integer gravedad, LocalDateTime llegada) {
        this.nombre = nombre;
        this.gravedad = gravedad;
        this.llegada = llegada;
    }

    public String getNombre() {
        return nombre;
    }

    public Integer getGravedad() {
        return gravedad;
    }

    public LocalDateTime getLlegada() {
        return llegada;
    }

    @Override
    public String toString() {
        return "Paciente{" +
                "nombre='" + nombre + '\'' +
                ", gravedad=" + gravedad +
                ", llegada=" + llegada +
                '}';
    }
}
