package com.cesupa.catalogo;

import com.cesupa.catalogo.domain.animal.Animal;
import com.cesupa.catalogo.domain.animal.AnimalRepository;
import com.cesupa.catalogo.domain.plant.Plant;
import com.cesupa.catalogo.domain.plant.PlantRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;
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
			Animal animal1 = new Animal("Tigre", "Panthera tigris",
                "Ásia", "Carne", "Florestas", "Carnívoro", 10);

			Animal animal2 = new Animal("Leão", "Panthera leo",
                "Ásia e África subsaariana", "Carne", "Savanas, planícies", "Carnívoro", 15);

			Animal animal3 = new Animal("Girafa", "Giraffa camelopardalis",
                "África", "Folhas, caules, flores e frutos", "Savanas, pradarias", "Herbívoro", 15);

			Animal animal4 = new Animal("Rinoceronte-indiano", "Rhinoceros unicornis",
                "Nepal e Índia", "Gramíneas e galhos", "Pradarias altas e florestas", "Herbívoro", 40);

			Animal animal5 = new Animal("Elefante-africano-de-savana", "Loxodonta africana",
                "África e Ásia", "Gramíneas, ervas, folhas", "Savanas, bosques, florestas", "Herbívoro", 60);


			Plant plant1 = new Plant("Abélia-da-china", "Abelia x grandiflora", "China"
				, "Caprifoliaceae", false);

			Plant plant2 = new Plant("Cacto-triangular", "Acanthocereus tetragonus", "América do Norte, América Central, América do Sul"
				, "Cactaceae", true);

			Plant plant3 = new Plant("Bôrdo-japonês", "Acer palmatum", "Ásia"
				, "Sapindaceae", false);

			Plant plant4 = new Plant("Bromélia-coral", "Aechmea fulgens", "América do Sul"
				, "Bromeliaceae", false);

			Plant plant5 = new Plant("Agave-dragão", "Agave attenuata", "América do Norte"
				, "Agavaceae", false);


			if (animalRepository.findAll().size() == 0) {
				animalRepository.insert(animal1);
				animalRepository.insert(animal2);
				animalRepository.insert(animal3);
				animalRepository.insert(animal4);
				animalRepository.insert(animal5);
			}

			if (plantRepository.findAll().size() == 0) {
				plantRepository.insert(plant1);
				plantRepository.insert(plant2);
				plantRepository.insert(plant3);
				plantRepository.insert(plant4);
				plantRepository.insert(plant5);
			}
		};
	}
}
