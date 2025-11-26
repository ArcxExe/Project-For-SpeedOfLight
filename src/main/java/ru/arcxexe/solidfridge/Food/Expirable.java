package ru.arcxexe.solidfridge.Food;

import java.time.LocalDate;

// Работа только с датами , срок годности и дата изготовления
public interface Expirable {

  // Разница между созданной датой и датой просрочки
  long diffrensBetweenDate();

  // Возвращение даты изготовления
  LocalDate getCreateingDate();

  // Возвращение даты когда просрочится
  LocalDate getExpiryDate();
}
