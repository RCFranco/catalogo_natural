package com.cesupa.catalogo.services.plant;

import com.cesupa.catalogo.domain.animal.Animal;
import com.cesupa.catalogo.domain.plant.Plant;
import com.cesupa.catalogo.domain.plant.PlantRepository;
import com.mongodb.client.result.DeleteResult;
import lombok.AllArgsConstructor;
import org.springframework.data.mongodb.core.MongoTemplate;
import org.springframework.data.mongodb.core.query.Criteria;
import org.springframework.data.mongodb.core.query.Query;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class PlantService {

    private final PlantRepository plantRepository;

    private final MongoTemplate mongoTemplate;

    public List<Plant> getAllPlants() {
        return plantRepository.findAll();
    }

    public List<Plant> getOnePlantById(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        return mongoTemplate.find(query, Plant.class);
    }

    public Plant createPlant(Plant plant) {
        return plantRepository.insert(plant);
    }

    public Plant updatePlant(Plant plant) {
        return plantRepository.save(plant);
    }

    public DeleteResult deletePlant(String id) {
        Query query = new Query();
        query.addCriteria(Criteria.where("id").is(id));
        return mongoTemplate.remove(query, Plant.class);
    }
}
