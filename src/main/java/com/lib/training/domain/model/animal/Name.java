package com.lib.training.domain.model.animal;

public class Name {

  private String value;

  private Name() {
  }

  public Name(String value) {
    this.value = value;
  }

  public String value() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }
}
