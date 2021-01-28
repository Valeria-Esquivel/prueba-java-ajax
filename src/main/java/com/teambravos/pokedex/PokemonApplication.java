package com.teambravos.pokedex;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/**
 *
 * El porgrama implementa una pequeña aplicacion con buenas practicas y
 * que realiza un CRUD de Pokemon
 *
 * @author Jürgen
 * @author Jheyson Garcia
 * @author Luis Vazquez
 * @author valeria Esquivel
 * @version 1.0
 * @since   13-01-2021
 */

@SpringBootApplication
public class PokemonApplication {

	public static void main(String[] args) {

		SpringApplication.run(PokemonApplication.class, args);

	}

}
