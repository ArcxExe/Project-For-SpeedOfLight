package ru.arcxexe.solidfridge.Food;

import java.time.LocalDate;
import java.time.temporal.ChronoUnit;

public class Milk extends Food implements Expirable {

  private final LocalDate dateCreating;
  private final LocalDate dateDelay;

  public Milk(LocalDate dateCreating, LocalDate dateDelay) {
    // WARN: Добавить проверка , что нельзя передавать некоректные данные
    this.dateCreating = dateCreating;
    this.dateDelay = dateDelay;
  }

  // TODO: Реализвовать , сколько осталось времени , между созданным и датой
  // просрочки
  @Override
  public LocalDate getCreateingDate() {
    return this.dateCreating;
  }

  @Override
  public long diffrensBetweenDate(){
    return ChronoUnit.DAYS.between(this.dateDelay, this.dateCreating);
  } 

  @Override
  public LocalDate getExpiryDate() {
    return this.dateDelay;
  }
}
