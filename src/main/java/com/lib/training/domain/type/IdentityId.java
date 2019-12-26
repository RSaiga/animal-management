package com.lib.training.domain.type;

import org.seasar.doma.Domain;

@Domain(valueType = String.class, accessorMethod="value")
public class IdentityId {

  private String value;

  public IdentityId(String value) {
    this.value = value;
  }

  public String value() {
    return value;
  }
}
