package probatinas.p5;

public class MsLunch implements Runnable{
    private long c1 = 0;
    private long c2 = 0;
    private Object lock1 = new Object();
    private Object lock2 = new Object();
    public void inc1() {
        synchronized(lock1) {
            c1++;
        }
    }
    public void inc2() {
        synchronized(lock2) {
            c2++;
        }
    }

    public long getC1() {
        return c1;
    }

    static void main() {

        for (int i = 0; i < 1000; i++) {

            new Thread(new MsLunch()).start();

        }

    }

    @Override
    public void run() {

        inc1();

    }

}