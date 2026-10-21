package org.iesch.ad.demoSpring1.config;

import org.iesch.ad.demoSpring1.modelo.Persona;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import java.lang.Long;
import java.util.ArrayList;
import java.util.List;

@Configuration
public class Configuracion {

    @Bean
    public List<Persona> dameLista() {
        List<Persona> listaPersona = new ArrayList<>();
//
//        Persona p = Persona.builder().id(1L).nombre("Héctor").apellidos("Criado").build();
//        Persona p2 = Persona.builder().id(2L).email("pperezb@iesch.org").build();
//        Persona p3 = Persona.builder().id(3L).nombre("Juan").build();
//        Persona p4 = Persona.builder().id(4L).apellidos("Ma").build();
//        Persona p5 = Persona.builder().id(5L).build();
//        Persona p6 = Persona.builder().id(6L).apellidos("Maricón").build();
//        Persona p7 = Persona.builder().id(7L).edad(676767).build();
//
//        listaPersona.add(p);
//        listaPersona.add(p2);
//        listaPersona.add(p3);
//        listaPersona.add(p4);
//        listaPersona.add(p5);
//        listaPersona.add(p6);
//        listaPersona.add(p7);
//
        return listaPersona;

    }

}
