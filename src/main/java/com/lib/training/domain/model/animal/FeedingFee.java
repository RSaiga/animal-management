package com.lib.training.domain.model.animal;


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

  public long value() {
    return this.value;
  }
}