package com.cesupa.catalogo;

import com.cesupa.catalogo.domain.animal.Animal;
import com.cesupa.catalogo.domain.animal.AnimalRepository;
import com.cesupa.catalogo.domain.plant.Plant;
import com.cesupa.catalogo.domain.plant.PlantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@SpringBootApplication
@RestController
public class CatalogoNaturalApplication {

	public static void main(String[] args) {
		SpringApplication.run(CatalogoNaturalApplication.class, args);
	}

	@Bean
	CommandLineRunner runner(AnimalRepository animalRepository, PlantRepository plantRepository) {
		return args -> {
			Animal animal = new Animal("animal", "animal",
                "animal", "animal", "animal", "animal", 10);

			Plant plant = new Plant("planta", "planta", "planta"
				, "planta", true);

			animalRepository.insert(animal);
			plantRepository.insert(plant);
		};
	}

}
