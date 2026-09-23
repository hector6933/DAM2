package Probatinas.p4;

import java.io.*;
import java.util.ArrayList;

class Producto implements Serializable {
    private int id;
    private String nombre;
    private double precio;
    private boolean descuento;
    private char tipo;

    public Producto(int id, String nombre, double precio, boolean descuento, char tipo) {
        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
        this.tipo = tipo;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "id=" + id +
                ", nombre='" + nombre + '\'' +
                ", precio=" + precio +
                ", descuento=" + descuento +
                ", tipo=" + tipo +
                '}';
    }
}

public class Ej5 {
    public static void main(String[] args) {
        ArrayList<Producto> productos = new ArrayList<>();
        productos.add(new Producto(1, "Producto1", 10.0, true, 'A'));
        productos.add(new Producto(2, "Producto2", 20.0, false, 'B'));
        productos.add(new Producto(3, "Producto3", 30.0, true, 'C'));
        productos.add(new Producto(4, "Producto4", 40.0, false, 'D'));
        productos.add(new Producto(5, "Producto5", 50.0, true, 'E'));

        String filePath = "productos.dat";

        // Write products to random access file
        try (RandomAccessFile raf = new RandomAccessFile(filePath, "rw")) {
            for (Producto producto : productos) {
                raf.writeUTF(producto.toString());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read and display all products from the file
        try (RandomAccessFile raf = new RandomAccessFile(filePath, "r")) {
            raf.seek(0);
            while (raf.getFilePointer() < raf.length()) {
                System.out.println(raf.readUTF());
            }
        } catch (IOException e) {
            e.printStackTrace();
        }

        // Display the fourth product
        try (RandomAccessFile raf = new RandomAccessFile(filePath, "r")) {
            raf.seek(0);
            for (int i = 0; i < 3; i++) {
                raf.readUTF(); // Skip first three products
            }
            System.out.println("Fourth product: " + raf.readUTF());
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}