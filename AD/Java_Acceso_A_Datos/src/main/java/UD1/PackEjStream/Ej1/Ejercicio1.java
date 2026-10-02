package UD1.PackEjStream.Ej1;

import java.io.File;
import java.io.RandomAccessFile;
import java.nio.charset.StandardCharsets;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Ejercicio1 {

    static void main(String[] args) {

        // Aquí puedo poner como separador "Pascual" y sigue funcionando todo perfectamente, me encanta
        String separador = ";";
        List<Producto> productos = new ArrayList<>();

        try {

            productos.addAll(List.of(
                    new Producto(1, "Teclado", 25.99, true, 'A'),
                    new Producto(2, "Raton", 15.50, false, 'A'),
                    new Producto(3, "Monitor", 199.99, true, 'B'),
                    new Producto(4, "Auricular", 45.00, false, 'A'),
                    new Producto(5, "Webcam", 60.75, true, 'B'),
                    new Producto(6, "Impresora", 150.00, false, 'C'),
                    new Producto(7, "Altavoz", 35.20, true, 'A'),
                    new Producto(8, "Cargador", 12.99, false, 'C'),
                    new Producto(9, "Mochila", 55.40, true, 'D'),
                    new Producto(10, "Micrófono", 80.00, false, 'B'),
                    new Producto(11, "Funda", 9.99, true, 'D'),
                    new Producto(12, "Adaptador", 18.30, false, 'C'),
                    new Producto(13, "Router", 65.00, true, 'B'),
                    new Producto(14, "Tablet", 220.00, false, 'A'),
                    new Producto(15, "Pendrive", 14.50, true, 'C')
            ));

        } catch (Exception e) {

            e.printStackTrace();

        }

        try (RandomAccessFile raf = new RandomAccessFile(new File("src/main/java/UD1/PackEjStream/Ej1/Archivo.txt"), "rws")) {

            // Escribir los productos
            for (Producto e : productos) {

                // Divido cada atributo del producto por ; para luego localizar cada atributo
                StringBuilder linea = new StringBuilder();
                for (String atributo : e.getAtributos()) {

                    linea.append(atributo).append(separador);

                }

                linea.append("\n");

                // write solo admite escribir en bytes asi que paso el string a bytes
                raf.write(linea.toString().getBytes(StandardCharsets.UTF_8));

            }

            raf.seek(0);

            // Leo cada línea con readLine muy sencillo
            String linea;
            while ((linea = raf.readLine()) != null) {

                System.out.println(linea);

            }

            raf.seek(0);

            // Ahora para transformar las lineas leídas a objetos producto tengo que dividir cada atributo por el separador que he puesto antes
            // y asigno cada posición del array a un atributo
            ArrayList<Producto> productosLeidos = new ArrayList<>();
            linea = "";
            while ((linea = raf.readLine()) != null) {

                String[] atributos = linea.split(separador);

                Integer id =  Integer.parseInt(atributos[0]);
                String nombre = atributos[1];
                Double precio = Double.parseDouble(atributos[2]);
                Boolean descuento = Boolean.parseBoolean(atributos[3]);
                Character tipo = atributos[4].charAt(0);

                productosLeidos.add(new Producto(id,nombre,precio,descuento,tipo));

            }

            System.out.println(productosLeidos);

        } catch (Exception e) {

            System.out.println("Error en la lectura/escritura del archivo!!");
            e.printStackTrace();

        }

    }

}
