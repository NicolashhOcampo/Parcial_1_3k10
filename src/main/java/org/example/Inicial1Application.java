package org.example;


import jakarta.transaction.Transactional;
import org.example.entities.Analizador;
import org.example.repositories.AdnRepository;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.Arrays;
import java.util.List;
import java.util.Optional;

@SpringBootApplication
public class Inicial1Application {
	private static final Logger logger = LoggerFactory.getLogger(Inicial1Application.class);

	@Autowired
	private AdnRepository personaRepository;
	public static void main(String[] args) {
		SpringApplication.run(Inicial1Application.class, args);

		System.out.println("funcionando");
	}




	@Bean
	@Transactional
	CommandLineRunner init(AdnRepository adnRepository) {
		return args -> {
			// Creo un objeto persona
			Analizador analizador= new Analizador();

			List<String> dna = Arrays.asList(
					"ATGCAA",
					"CAGTAC",
					"TTATGG",
					"AGAAGG",
					"CCCGGA",
					"TCGCGG"
			);



			if(analizador.isMutant(dna)){
				System.out.println("Es mutante");
			}else{
				System.out.println("No es mutante");
			}







		};

		};




}
