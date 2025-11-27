package ru.arcxexe.solidfridge.Food;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public abstract class Food implements Expirable {
  private String name;
  private final LocalDate dateCreating;
  private final LocalDate dateDelay;

  public Food(String name, LocalDate dateCreating, LocalDate dateDelay) {
    this.name = name;
    this.dateCreating = dateCreating;
    this.dateDelay = dateDelay;
  }

  public String getName() {
    return this.name;
  }

  public LocalDate getCreateingDate() {
    return this.dateCreating;
  }

  @Override
  public long diffrensBetweenDate() {
    return ChronoUnit.DAYS.between(this.dateCreating, this.dateDelay);
  }

  @Override
  public LocalDate getExpiryDate() {
    return this.dateDelay;
  }

}
