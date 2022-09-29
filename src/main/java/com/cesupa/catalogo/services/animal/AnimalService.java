package com.cesupa.catalogo.services.animal;

import com.cesupa.catalogo.domain.animal.Animal;
import com.cesupa.catalogo.domain.animal.AnimalRepository;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Component;

import java.util.List;

@AllArgsConstructor
@Component
public class AnimalService {
    private final AnimalRepository animalRepository;

    public List<Animal> getAllAnimals() {
        return animalRepository.findAll();
    }
}
