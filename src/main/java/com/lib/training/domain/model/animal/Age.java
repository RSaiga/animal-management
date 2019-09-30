package com.lib.training.domain.model.animal;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Age {

  private BirthDay birthday;
  private Age() {
  }

  public Age(BirthDay birthday) {

    this.birthday = birthday;
  }

 public long value() {
   return ChronoUnit.YEARS.between(birthday.value(), LocalDate.now());
  }
}


