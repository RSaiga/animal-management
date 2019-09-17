package com.lib.training.domain.type;


public class Entity implements IdGenerator {

  protected IdentityId identityId;

  public String identityId() {
    return identityId.value();
  }

}
