package com.lib.training.domain.model.animal;

import java.util.ArrayList;
import java.util.List;

public class Animals {

  private List<Animal> animals;

  private Animals() {
  }

  public Animals(List<Animal> animals) {
    this.animals = animals;
  }

  public void add(Animal animal) {
    if (animals == null) {
      animals = new ArrayList<>();
    }
    animals.add(animal);
  }

  public List<Animal> list() {
    return animals;
  }
}
