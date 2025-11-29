package ru.arcxexe.solidfridge.Food;

import java.time.LocalDate;

public interface Expirable {

  long diffrensBetweenDate();
  LocalDate getExpiryDate();
}
