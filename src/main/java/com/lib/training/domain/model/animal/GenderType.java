package com.lib.training.domain.model.animal;

import org.seasar.doma.Domain;

import java.util.stream.Stream;

@Domain(valueType = String.class, factoryMethod="of", accessorMethod = "getKey")
public enum GenderType {
  Male("0", "オス"),
  Female("1", "メス");

  private String key;
  private String value;

  GenderType(String key, String value) {
    this.key = key;
    this.value = value;
  }

  public String getKey() {
    return key;
  }

  public void setKey(String key) {
    this.key = key;
  }

  public String getValue() {
    return value;
  }

  public void setValue(String value) {
    this.value = value;
  }

  public static GenderType of(String val) {
    return Stream.of(values()).filter(m -> m.key.equals(val)).findFirst().orElseThrow(() -> new IllegalArgumentException());
  }
}