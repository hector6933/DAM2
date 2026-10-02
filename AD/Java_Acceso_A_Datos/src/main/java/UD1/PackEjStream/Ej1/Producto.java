package UD1.PackEjStream.Ej1;

import java.io.Serializable;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.InvalidPropertiesFormatException;

public class Producto implements Serializable {



    private Integer id;
    private String nombre;
    private Double precio;
    private Boolean descuento;
    private Character tipo;

    public Producto() {
    }

    public Producto(Integer id, String nombre, Double precio, Boolean descuento, Character tipo) throws InvalidPropertiesFormatException {

        if (nombre.length() > 10) {

            throw new InvalidPropertiesFormatException("El nombre no puede tener más de 10 carácteres");

        }

        this.id = id;
        this.nombre = nombre;
        this.precio = precio;
        this.descuento = descuento;
        this.tipo = tipo;

    }

    public ArrayList<String> getAtributos() {

        // Esto es para que pueda recorrer y leer cada atributo
        return new ArrayList<String>(Arrays.asList(id.toString(), nombre.trim(), precio.toString(), descuento.toString(), tipo.toString()));

    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public Double getPrecio() {
        return precio;
    }

    public void setPrecio(Double precio) {
        this.precio = precio;
    }

    public Boolean getDescuento() {
        return descuento;
    }

    public void setDescuento(Boolean descuento) {
        this.descuento = descuento;
    }

    public Character getTipo() {
        return tipo;
    }

    public void setTipo(Character tipo) {
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
