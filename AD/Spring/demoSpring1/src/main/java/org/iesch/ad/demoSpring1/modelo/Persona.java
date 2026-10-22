package org.iesch.ad.demoSpring1.modelo;

import jakarta.persistence.*;
import lombok.*;
import org.springframework.stereotype.Component;
import java.lang.Long;

@Getter
@Setter
//@Builder
@AllArgsConstructor
@NoArgsConstructor
@ToString
@EqualsAndHashCode
@Entity
public class Persona {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String nombre;
    String apellidos;
//    @Basic()
    String dni;
    String email;
    Integer edad;
    Long atomos;

    // @Basic
    // @Column

}
