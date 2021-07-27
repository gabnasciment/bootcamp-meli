package com.bootcampmeli.restaurante.restaurante;

import com.bootcampmeli.restaurante.restaurante.services.DBService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class RestauranteApplication implements CommandLineRunner {

	public static void main(String[] args) {
		SpringApplication.run(RestauranteApplication.class, args);
	}

	@Autowired
	private DBService dbService;

	@Override
	public void run(String... args) throws Exception {
		dbService.instantiateDB();
	}
}
