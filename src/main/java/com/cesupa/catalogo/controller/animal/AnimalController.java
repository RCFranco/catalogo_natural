package com.cesupa.catalogo.controller.animal;

import com.cesupa.catalogo.domain.animal.Animal;
import com.cesupa.catalogo.services.animal.AnimalService;
import com.mongodb.client.result.DeleteResult;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/animals")
@AllArgsConstructor
public class AnimalController {

    private final AnimalService animalService;

    @GetMapping("/getAll")
    public List<Animal> fetchAllAnimals() {
        return animalService.getAllAnimals();
    }

    @GetMapping(value = "/getOne/{id}")
    public List<Animal> fetchOneAnimal(@PathVariable String id) {
        return animalService.getOneAnimalById(id);
    }

    @PostMapping(value = "/create")
    public Animal saveAnimal(@RequestBody Animal animal) {
        return animalService.createAnimal(animal);
    }

    @PutMapping(value = "/update")
    public Animal updateAnimal(@RequestBody Animal animal) {
        return animalService.updateAnimal(animal);
    }

    @DeleteMapping(value = "/delete/{id}")
    public DeleteResult deleteAnimal(@PathVariable String id) {
        return animalService.deleteAnimal(id);
    }
}
