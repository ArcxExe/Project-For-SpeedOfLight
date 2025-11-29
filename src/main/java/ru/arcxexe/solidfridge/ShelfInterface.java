package ru.arcxexe.solidfridge;

import ru.arcxexe.solidfridge.Food.Food;

public interface ShelfInterface {
  public void putFood(Food food);
  public void getListFood();
  public Food getFood(int index);
}
