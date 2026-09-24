package probatinas.p5;

public class Iteraciones {

    static private int contador = 0;

    public static void metodo(){

        contador++;
        System.out.println(contador);

    }

    static void main() {

        for (int i = 0; i < 100000; i++) {

            metodo();

        }

    }

}
