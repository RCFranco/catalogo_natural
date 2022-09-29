package com.cesupa.catalogo.services.plant;

import com.cesupa.catalogo.domain.plant.Plant;
import com.cesupa.catalogo.domain.plant.PlantRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class PlantService {

    private final PlantRepository plantRepository;

    public List<Plant> getAllPlants() {
        return plantRepository.findAll();
    }
}
