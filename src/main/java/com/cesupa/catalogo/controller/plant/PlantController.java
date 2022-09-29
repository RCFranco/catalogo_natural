package com.cesupa.catalogo.controller.plant;

import com.cesupa.catalogo.domain.plant.Plant;
import com.cesupa.catalogo.services.plant.PlantService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/plants")
@AllArgsConstructor
public class PlantController {

    private final PlantService plantService;

    @GetMapping("/getAll")
    public List<Plant> fetchAllPlants() {
        return plantService.getAllPlants();
    }
}
