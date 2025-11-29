package ru.arcxexe.solidfridge;

import ru.arcxexe.solidfridge.Food.Food;

public interface ShelfInterface {
  public void addFood(Food food , int index);
  public String getListFood();
  public Food getFood(int index);
}
