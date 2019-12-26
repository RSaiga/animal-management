package com.lib.training.domain.type;

import org.seasar.doma.Column;
import org.seasar.doma.Id;

import java.time.LocalDateTime;

@org.seasar.doma.Entity
public class Entity implements IdGenerator {

  @Id
  @Column(name = "id")
  protected IdentityId identityId;

  @Column(name = "created_by")
  protected String createdBy;

  @Column(name = "created_at")
  protected LocalDateTime createdAt;

  @Column(name = "updated_by")
  protected String updatedBy;

  @Column(name = "updated_at")
  protected LocalDateTime updateedAt;

  public Entity() {
    identityId = new IdentityId(generate());
  }

  public String identityId() {
    return identityId.value();
  }
}
