package com.lib.training.infrastracture.animal;

import com.lib.training.application.repository.animal.AnimalRepository;
import com.lib.training.domain.model.animal.Animal;
import com.lib.training.domain.model.animal.Animals;
import org.springframework.stereotype.Repository;

import java.util.ArrayList;
import java.util.List;

@Repository
public class AnimalRepositoryOnMemory implements AnimalRepository {

  private List<Animal> repository = new ArrayList<>();

  @Override
  public Animals findAll() {
    return new Animals(repository);
  }

  @Override
  public void register(Animal animal) {
    repository.add(animal);
  }
}
