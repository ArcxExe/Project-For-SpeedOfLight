package ru.arcxexe.solidfridge.Food;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Food implements Expirable {
  private String name;
  private final LocalDate dateDelay;
  public Food(String name , LocalDate dateDelay) {
    this.name = name;
    this.dateDelay = dateDelay;
  }

  public String getName() {
    return this.name;
  }

  public LocalDate getTodayNow() {
    return LocalDate.now();
  }

  @Override
  public long diffrensBetweenDate() {
    return ChronoUnit.DAYS.between(LocalDate.now(), this.dateDelay);
  }

  @Override
  public LocalDate getExpiryDate() {
    return this.dateDelay;
  }

  @Override
  public String toString() {
    return "Food{" + "name='" + name + '\'' + ", expires=" + dateDelay + '}';
  }
}
