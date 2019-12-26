package com.lib.training.infrastracture.animal;

import com.lib.training.application.repository.animal.AnimalRepository;
import com.lib.training.domain.model.animal.Animal;
import com.lib.training.domain.model.animal.Animals;
import com.lib.training.infrastracture.animal.rds.AnimalRepositoryOnJDBC;
import org.springframework.stereotype.Repository;

@Repository
public class AnimalRepositoryDataSource implements AnimalRepository {

  private AnimalRepositoryOnJDBC dataAccess;

  public AnimalRepositoryDataSource(AnimalRepositoryOnJDBC dataAccess) {
    this.dataAccess = dataAccess;
  }

  @Override
  public Animals findAll() {
    return dataAccess.findAll();
  }

  @Override
  public void register(Animal animal) {
    dataAccess.insert(animal);
  }
}
