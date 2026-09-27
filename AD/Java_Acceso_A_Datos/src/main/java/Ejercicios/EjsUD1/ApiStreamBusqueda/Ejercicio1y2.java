package Ejercicios.EjsUD1.ApiStreamBusqueda;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio1y2 {

    static void main() {

        List<Fruta> fruteria = new ArrayList<>(Arrays.asList(
                new Fruta("Manzana", "Rojo"),
                new Fruta("Plátano", "Amarillo"),
                new Fruta("Uva", "Morado"),
                new Fruta("Naranja", "Naranja"),
                new Fruta("Kiwi", "Verde"),
                new Fruta("Fresa", "Rojo"),
                new Fruta("Limón", "Amarillo"),
                new Fruta("Pera", "Verde"),
                new Fruta("Sandía", "Verde"),
                new Fruta("Cereza", "Rojo"),
                new Fruta("Melón", "Amarillo"),
                new Fruta("Ciruela", "Morado"),
                new Fruta("Piña", "Amarillo"),
                new Fruta("Arándano", "Azul"),
                new Fruta("Mandarina", "Naranja"),
                new Fruta("Mango", "Naranja"),
                new Fruta("Frambuesa", "Rojo"),
                new Fruta("Aguacate", "Verde"),
                new Fruta("Coco", "Marrón"),
                new Fruta("Granada", "Rojo")
        ));

        List<String> nombres = new ArrayList<>(fruteria.stream().map(Fruta::getNombre).toList());

        System.out.println(nombres);

        List<String> colores = new ArrayList<>(fruteria.stream().map(Fruta::getColor).distinct().toList());

        System.out.println(colores);





    }

}

class Fruta {

    private String nombre;
    private String color;

    public Fruta() {
    }

    public Fruta(String nombre, String color) {
        this.nombre = nombre;
        this.color = color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    @Override
    public String toString() {
        return "Fruta{" +
                "nombre='" + nombre + '\'' +
                ", color='" + color + '\'' +
                '}';
    }
}
