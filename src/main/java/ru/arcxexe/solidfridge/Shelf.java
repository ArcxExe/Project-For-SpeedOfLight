package ru.arcxexe.solidfridge;

import ru.arcxexe.solidfridge.Exceprions.FoodIncorrectExceprion;
import ru.arcxexe.solidfridge.Food.*;

public class Shelf implements ShelfInterface {

  int sizeShelf;
  Food[] shelf;

  public Shelf(int sizeShelf) {
    this.sizeShelf = sizeShelf;
    if (sizeShelf > 0) {
      this.shelf = new Food[sizeShelf];
    }
  }

  public String getListFood() {
    StringBuilder result = new StringBuilder();
    for (Food food : shelf) {
      result.append(food + " ");
    }
    return result.toString();
  }


  public void addFood(Food food , int index) {
    if (food.getName() == null || index <= 0 ) {
      throw new FoodIncorrectExceprion("Food or index incorrect");
    }
    this.shelf[index] = food;
    System.out.println("Food in fridge");
  }

  public Food getFood(int index) {
    if (index <= 0 ) {
      throw new FoodIncorrectExceprion("Incorrect index")
    }
    var food = this.shelf[index];
    if (food != null) {
      this.shelf[index] = null;
      return food;
    }else {
      throw new IndexOutOfBoundsException("По заданному индексу нету еды");
    }

  }
}
