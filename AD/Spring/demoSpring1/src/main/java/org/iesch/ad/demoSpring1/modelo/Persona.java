package org.iesch.ad.demoSpring1.modelo;

import lombok.*;
import org.springframework.stereotype.Component;

@Getter
@Setter
@Builder
@ToString
@EqualsAndHashCode
@Component
public class Persona {

    Long id;
    String nombre;
    String apellidos;
    String dni;
    String email;
    Integer edad;
    Long atomos;

//    public void saludar(){
//
//        System.out.println("Hola me cago en la puta");
//
//    }

}
