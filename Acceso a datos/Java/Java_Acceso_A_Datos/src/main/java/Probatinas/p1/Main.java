package Probatinas.p1;

import java.util.*;

public class Main {

    public static void imprimirInteger(Contenedor<? extends Integer> objeto) {

        System.out.println(objeto.getObjeto());

    }


    static void main(String[] args) {

        Contenedor<Integer> contenedor1 = new Contenedor<>(33);
        Contenedor<String> contenedor2 = new Contenedor<>("Pasc");

        imprimirInteger(contenedor1);
        // imprimirInteger("Pasc"); no va ya que solo admite Integers


        List<String> miLista = new ArrayList<>(Arrays.asList("coche", "casa", "peroles", "antonio"));

        miLista.stream().sorted().forEach(e -> System.out.print(e + " "));
        System.out.println(miLista.stream().sorted().toList());


        List<Coche> miListaCoches = new ArrayList<>();

        Coche coche1 = new Coche("2222CCC", "LRanjdah127", "Xilofono", 670);
        Coche coche2 = new Coche("1111BBB", "NASD2749", "Hector", 0);
        Coche coche3 = new Coche("0000AAA", "2834028ADAS", "Andres", 293203);
        miListaCoches.addAll(Arrays.asList(coche1, coche2, coche3));

        // Imprime la lista ordenada
//        System.out.println(
//                miListaCoches.stream().sorted(Coche::compareTo).toList()
//        );
//
//        Collections.sort(miListaCoches); // Cambia y ordena la lista internamente
//        System.out.println(miListaCoches);
//

        System.out.println(

                miListaCoches.stream().sorted(Comparator.comparing(Coche::getOwner)).toList()

        );

//        miListaCoches = miListaCoches.stream().sorted(Comparator.comparing(Coche::getOwner)).toList();
        System.out.println(miListaCoches);


    }

}
