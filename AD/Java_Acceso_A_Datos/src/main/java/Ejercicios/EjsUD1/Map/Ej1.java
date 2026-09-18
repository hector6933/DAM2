package Ejercicios.EjsUD1.Map;

import java.util.HashMap;
import java.util.Map;

public class Ej1 {

    static void main(String[] args) {

        Map<String,String> paises = new HashMap<>();

        paises.put("España","Madrid");
        paises.put("Francia","Paris");
        paises.put("Estados Unidos","Washington DC");
        paises.put("Portugal","Lisboa");
        paises.put("Italia","Roma");
        paises.put("Alemania","Berlin");

        System.out.println(paises);


    }

}
