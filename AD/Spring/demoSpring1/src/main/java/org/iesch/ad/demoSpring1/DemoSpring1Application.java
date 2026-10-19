package org.iesch.ad.demoSpring1;

import org.iesch.ad.demoSpring1.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.	springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.PropertySource;

import javax.swing.*;
import java.awt.*;
import java.util.List;

@SpringBootApplication
@PropertySource(value = "classpath:mi.properties", encoding = "UTF-8")
public class DemoSpring1Application implements CommandLineRunner {

	@Autowired
	List<Persona> listaPersona;

	@Value("${spring.application.name}")
	String appName;

	@Value("${mi.app.nombre}")
	String nombre;

	@Value("${mi.app.version}")
	String version;

	@Value("${firma}")
	String firma;


	public static void main(String[] args) {

		SpringApplication.run(DemoSpring1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println("Hola mundoooooo");

		System.out.println(nombre);
		System.out.println(version);
		System.out.println(firma);

		System.out.println(appName);

		Persona p = Persona.builder().id(1L).dni("14444555A").edad(67).build();
		Persona p2 = Persona.builder().nombre("Pepe").id(2L).atomos(12319371931723193L).build();

		System.out.println(p);
		System.out.println(p2);

		System.out.println(listaPersona);


	}
}
