package com.lib.training.domain.model.animal;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.time.temporal.ChronoUnit;

public class Age {

  private long value;
  private Age() {
  }

  public Age(String value) {
    DateTimeFormatter formatter =
        DateTimeFormatter.ofPattern("uuuu/MM/dd");
    LocalDate localBirthdate = LocalDate.parse(value, formatter);
    LocalDate today = LocalDate.now();
    long duration = ChronoUnit.YEARS.between(localBirthdate, today);
    this.value = duration;
  }

  //public void setValue(String value) {
  // this.value = this.duration2;

//      public Name(String value) {
//      this.value = value;
  // }
//
 public long value() {
   return this.value;
    }

//    public void setValue(String value) {
//      this.value = value;
}


