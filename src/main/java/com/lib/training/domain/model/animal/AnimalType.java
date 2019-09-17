package com.lib.training.domain.model.animal;

import java.util.stream.Stream;

public enum AnimalType {
  Lion(0, "らいおん"),
  Giraffe(1, "きりん"),
  Elephant(2, "ぞう"),
  Hippo(3, "かば"),
  Monkey(4, "さる");

  private Integer key;
  private String value;

  AnimalType(int key, String value) {
    this.key = key;
    this.value = value;
  }

  public int getKey() {
    return key;
  }

  public void setKey(int key) {
    this.key = key;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public static AnimalType of(Integer val) {
    return Stream.of(values()).filter(m -> m.key.equals(val)).findFirst().orElseThrow(() -> new IllegalArgumentException());
  }
}
