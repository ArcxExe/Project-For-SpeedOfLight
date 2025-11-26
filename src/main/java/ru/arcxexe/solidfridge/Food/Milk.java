package ru.arcxexe.solidfridge.Food;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Milk extends Food implements Expirable {

  private String name;
  private final LocalDate dateCreating;
  private final LocalDate dateDelay;

  public Milk(LocalDate dateCreating, LocalDate dateDelay, String name) {
    // WARN: Добавить проверка , что нельзя передавать некоректные данные
    this.name = name;
    this.dateCreating = dateCreating;
    this.dateDelay = dateDelay;
  }

  public String getName() {
    return this.name;
  }

  // TODO: Реализвовать , сколько осталось времени , между созданным и датой
  // просрочки
  @Override
  public LocalDate getCreateingDate() {
    return this.dateCreating;
  }

  @Override
  public long diffrensBetweenDate() {
    return ChronoUnit.DAYS.between(this.dateDelay, this.dateCreating);
  }

  @Override
  public LocalDate getExpiryDate() {
    return this.dateDelay;
  }
}
