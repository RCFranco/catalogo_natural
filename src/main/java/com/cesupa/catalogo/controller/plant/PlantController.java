package com.cesupa.catalogo.controller.plant;

import com.cesupa.catalogo.domain.animal.Animal;
import com.cesupa.catalogo.domain.plant.Plant;
import com.cesupa.catalogo.services.plant.PlantService;
import com.mongodb.client.result.DeleteResult;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

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

    @GetMapping(value = "/getOne/{id}")
    public List<Plant> fetchOnePlant(@PathVariable String id) {
        return plantService.getOnePlantById(id);
    }

    @PostMapping(value = "/create")
    public Plant savePlant(@RequestBody Plant plant) {
        return plantService.createPlant(plant);
    }

    @PutMapping(value = "/update")
    public Plant updatePlant(@RequestBody Plant plant) {
        return plantService.updatePlant(plant);
    }

    @DeleteMapping(value = "/delete/{id}")
    public DeleteResult deletePlant(@PathVariable String id) {
        return plantService.deletePlant(id);
    }
}
