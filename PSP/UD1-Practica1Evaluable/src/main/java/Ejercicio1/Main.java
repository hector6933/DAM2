package Ejercicio1;

public class Main {

    static void main(String[] args) throws InterruptedException {

        GestorDescargas gestor = new GestorDescargas();

        Thread desc1 = new Thread(new Descargador(gestor,"Receta.txt"));
        Thread desc2 = new Thread(new Descargador(gestor,"DocumentoImportante.pdf"));
        Thread desc3 = new Thread(new Descargador(gestor,"Imagen.png"));
        Thread desc4 = new Thread(new Descargador(gestor,"Virus.exe"));
        Thread desc5 = new Thread(new Descargador(gestor,"Usuarios.csv"));
        Thread desc6 = new Thread(new Descargador(gestor,"Script.py"));

        desc1.start();
        desc2.start();
        desc3.start();
        desc4.start();
        desc5.start();
        desc6.start();

        desc1.join();
        desc2.join();
        desc3.join();
        desc4.join();
        desc5.join();
        desc6.join();

        System.out.println("Descargas totales: " + gestor.getDescargasCompletadas());

    }

}
