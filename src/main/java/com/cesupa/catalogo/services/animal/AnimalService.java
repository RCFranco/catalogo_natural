package com.cesupa.catalogo.services.animal;

import com.cesupa.catalogo.domain.animal.Animal;
import com.cesupa.catalogo.domain.animal.AnimalRepository;
import com.mongodb.client.result.DeleteResult;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class AnimalService {
    private final AnimalRepository animalRepository;

    private final MongoTemplate mongoTemplate;

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }

    public List<Animal> getOneAnimalById(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        return mongoTemplate.find(query, Animal.class);
    }

    public Animal createAnimal(Animal animal) {
        return animalRepository.insert(animal);
    }

    public Animal updateAnimal(Animal animal) {
        return animalRepository.save(animal);
    }

    public DeleteResult deleteAnimal(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        return mongoTemplate.remove(query, Animal.class);
    }
}
