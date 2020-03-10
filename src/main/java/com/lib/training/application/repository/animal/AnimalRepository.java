package com.lib.training.application.repository.animal;

import com.lib.training.domain.model.animal.Animal;
import com.lib.training.domain.model.animal.Animals;

public interface AnimalRepository {

  Animals findAll();

  void register(Animal animal);

  void clear();
}
