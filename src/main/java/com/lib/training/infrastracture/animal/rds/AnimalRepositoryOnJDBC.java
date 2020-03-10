package com.lib.training.infrastracture.animal.rds;

import com.lib.training.domain.model.animal.Animal;
import com.lib.training.domain.model.animal.Animals;
import org.seasar.doma.Dao;
import org.seasar.doma.Delete;
import org.seasar.doma.boot.ConfigAutowireable;
import org.seasar.doma.jdbc.Config;
import org.seasar.doma.jdbc.builder.DeleteBuilder;
import org.seasar.doma.jdbc.builder.InsertBuilder;
import org.seasar.doma.jdbc.builder.SelectBuilder;

import java.time.LocalDate;
import java.time.LocalDateTime;

@Dao
@ConfigAutowireable
public interface AnimalRepositoryOnJDBC {

  default Animals findAll() {
    Config config = Config.get(this);
    SelectBuilder builder = SelectBuilder.newInstance(config);
    builder.sql("select * from animals order by created_at desc");
    return new Animals(builder.getEntityResultList(Animal.class));
  }

  default void insert(Animal animal) {
    Config config = Config.get(this);
    InsertBuilder builder = InsertBuilder.newInstance(config);
    builder.sql("INSERT INTO animals");
    builder.sql("(");
    builder.sql("id").sql(",");
    builder.sql("name").sql(",");
    builder.sql("type").sql(",");
    builder.sql("birthday").sql(",");
    builder.sql("gender").sql(",");
    builder.sql("feeding_fee").sql(",");
    builder.sql("created_by").sql(",");
    builder.sql("created_at").sql(",");
    builder.sql("updated_by").sql(",");
    builder.sql("updated_at").sql(")");
    builder.sql("values (");
    builder.param(String.class, animal.identityId()).sql(",");
    builder.param(String.class, animal.getName().value()).sql(",");
    builder.param(int.class, animal.getType().getKey()).sql(",");
    builder.param(LocalDate.class, animal.getBirthDay().value()).sql(",");
    builder.param(String.class, animal.getGender().getKey()).sql(",");
    builder.param(int.class, animal.getFeedingFee().value()).sql(",");
    builder.param(String.class, "testuser01").sql(",");
    builder.param(LocalDateTime.class, LocalDateTime.now()).sql(",");
    builder.param(String.class, "testuser01").sql(",");
    builder.param(LocalDateTime.class, LocalDateTime.now()).sql(")");
    builder.execute();
  }

  default int truncate() {
    Config config = Config.get(this);
    DeleteBuilder builder = DeleteBuilder.newInstance(config);
    builder.sql("TRUNCATE TABLE animals");
    return builder.execute();
  }
}
