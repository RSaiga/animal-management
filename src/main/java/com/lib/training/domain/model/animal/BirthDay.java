package com.lib.training.domain.model.animal;

import org.seasar.doma.Domain;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

@Domain(valueType = String.class, accessorMethod="toString")
public class BirthDay {

  private LocalDate value;

  private BirthDay() {
  }

  public BirthDay(String value) {
    this.value =
        LocalDate.parse(value,
            DateTimeFormatter.ofPattern("uuuu-MM-dd"));
  }

  public LocalDate value() {
    return value;
  }

  @Override
  public String toString() {
    return value.format(DateTimeFormatter.ofPattern("uuuu-MM-dd"));
  }

  public void setValue(String value) {
    this.value = LocalDate.parse(value,
        DateTimeFormatter.ofPattern("uuuu/MM/dd"));
  }

  public Age age() {
    return new Age(this);
  }
}
