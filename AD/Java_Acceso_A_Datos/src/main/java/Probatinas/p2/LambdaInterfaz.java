package Probatinas.p2;

public class LambdaInterfaz {

    public interface Greeting {

        void sayHello(String name);

    }

    public static void main() {

        Greeting greeting = name -> System.out.println("Hello " + name);

        greeting.sayHello("Juanma");

        Greeting greeting2 = name -> System.out.println("¡¡¡Hello " + name + "!!!");
        greeting2.sayHello("Juanma");

    }

}
