package com.lib.training.domain.model.animal;

import com.lib.training.domain.type.Entity;
import org.seasar.doma.Column;
import org.seasar.doma.Table;

@org.seasar.doma.Entity
@Table(name = "animals")
public class Animal extends Entity {

  private Name name;

  private AnimalType type;

  private BirthDay birthDay;

  private GenderType gender;

  @Column(name = "feeding_fee")
  private FeedingFee feedingFee;

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

  public FeedingFee getFeedingFee() { return feedingFee; }
}
