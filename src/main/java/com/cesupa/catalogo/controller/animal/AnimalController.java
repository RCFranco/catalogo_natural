package com.cesupa.catalogo.controller.animal;

import com.cesupa.catalogo.domain.animal.Animal;
import com.cesupa.catalogo.services.animal.AnimalService;
import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

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
}
