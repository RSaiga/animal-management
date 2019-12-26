package com.lib.training.domain.model.animal;

import org.seasar.doma.Domain;

@Domain(valueType = int.class, accessorMethod="value")
public class FeedingFee {

  private int value;

  private FeedingFee() {
  }

  public FeedingFee(int value) {
    this.value = value;
  }

  public FeedingFee(String value) {
    this.value = Integer.parseInt(value);
  }

  public int value() {
    return this.value;
  }
}