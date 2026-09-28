package probatinas.p5;

public class SamplePriorities extends Thread {
    public SamplePriorities(String name) {
        this.setName(name);
    }
    public void run() {
        // mostrar información por consola
        System.out.println("Executing [" + this.getName() + "]");
        for (int i = 0; i < 5; i++) {
            System.out.println("\t(" + this.getName() + ": " + i + ")");
        }
    }

    public static void main(String[] args) {
        // crear hilos
        SamplePriorities h1 = new SamplePriorities("One");
        SamplePriorities h2 = new SamplePriorities("Two");
        SamplePriorities h3 = new SamplePriorities("Three");
        SamplePriorities h4 = new SamplePriorities("Four");
        SamplePriorities h5 = new SamplePriorities("Five");
        // establecer prioridades
        h1.setPriority(MIN_PRIORITY);
        h2.setPriority(3);
        h3.setPriority(NORM_PRIORITY);
        h4.setPriority(7);
        h5.setPriority(MAX_PRIORITY);
        // ejecución
        h1.start();
        h2.start();
        h3.start();
        h4.start();
        h5.start();
    }
}
