package com.lib.training.application.service.animal;

import com.lib.training.application.repository.animal.AnimalRepository;
import com.lib.training.domain.model.animal.Animal;
import com.lib.training.domain.model.animal.Animals;
import org.springframework.stereotype.Service;

@Service
public class AnimalService {

  private AnimalRepository repository;

  public AnimalService(AnimalRepository repository) {
    this.repository = repository;
  }

  public Animals searchAll() {
    return repository.findAll();
  }

  public void register(Animal animal) {
    repository.register(animal);
  }
}
