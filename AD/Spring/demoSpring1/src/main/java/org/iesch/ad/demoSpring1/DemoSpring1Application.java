package org.iesch.ad.demoSpring1;

import lombok.RequiredArgsConstructor;
import org.iesch.ad.demoSpring1.Repositorio.PersonaRepositorio;
import org.iesch.ad.demoSpring1.modelo.Persona;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.CommandLineRunner;
import org.	springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import java.lang.Long;
import org.springframework.context.annotation.PropertySource;

import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

@SpringBootApplication
@PropertySource(value = "classpath:mi.properties", encoding = "UTF-8")
public class DemoSpring1Application implements CommandLineRunner {

	@Value("${spring.application.name}")
	String appName;

	@Value("${mi.app.nombre}")
	String nombre;

	@Value("${mi.app.version}")
	String version;

	@Value("${firma}")
	String firma;

	@Autowired
	PersonaRepositorio personaRepositorio;

//	@Autowired
//	List<Persona> listaPersona;

	public static void main(String[] args) {

		SpringApplication.run(DemoSpring1Application.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
//		System.out.println("Hola mundoooooo");
//
//		System.out.println(nombre);
//		System.out.println(version);
//		System.out.println(firma);
//
//		System.out.println(appName);
//
//		Persona p = Persona.builder().id(1L).dni("14444555A").edad(67).build();
//		Persona p2 = Persona.builder().nombre("Pepe").id(2L).atomos(12319371931723193L).build();
//
//		System.out.println(p);
//		System.out.println(p2);
//
//		System.out.println("------------------------------");

//		listaPersona.forEach(System.out::println);

		Persona p = Persona.builder().nombre("Juan").apellidos("Ma").email("juan@aa.es").dni("20403958R").build();
		Persona p2 = Persona.builder().nombre("Pascual").apellidos("Bagán").email("pasc@cual.com").dni("45102057G").build();
		Persona p3 = Persona.builder().nombre("And").apellidos("Res").email("and@res.es").dni("60582311H").build();
		Persona p4 = Persona.builder().nombre("Pa").apellidos("Blo").email("pa@blo.com").dni("55001038M").build();

		List<Persona> personaList = new ArrayList<>(Arrays.asList(p,p2,p3,p4));

		personaRepositorio.saveAll(personaList);

		// CRUD
		List<Persona> personaLeer = personaRepositorio.findAll();
		System.out.println(personaLeer);


	}
}
