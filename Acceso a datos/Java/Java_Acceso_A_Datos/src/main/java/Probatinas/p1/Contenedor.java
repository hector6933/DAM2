package Probatinas.p1;

public class Contenedor<T> {

    private T objeto;

    public Contenedor(T objeto) {
        this.objeto = objeto;
    }

    public T getObjeto() {

        return this.objeto;

    }

    public void setObjeto(T objeto) {

        this.objeto = objeto;

    }

}
