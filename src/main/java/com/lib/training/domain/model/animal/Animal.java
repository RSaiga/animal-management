package com.lib.training.domain.model.animal;

import com.lib.training.domain.type.Entity;

public class Animal extends Entity {

  private Age duration;

  private Name name;

  private AnimalType type;

  private BirthDay birthDay;

  private GenderType gender;

  public Animal() {
  }

  public Animal(String name, String type, String birthDay, String gender) {
    this.duration= new Age(birthDay);
    this.name = new Name(name);
    this.type = AnimalType.of(Integer.parseInt(type));
    this.birthDay = new BirthDay(birthDay);
    this.gender = GenderType.of(gender);
  }

  public Age getAge() { return duration; }

  public Name getName() { return name; }

  public AnimalType getType() {
    return type;
  }

  public BirthDay getBirthDay() {
    return birthDay;
  }

  public GenderType getGender() {
    return gender;
  }
}
