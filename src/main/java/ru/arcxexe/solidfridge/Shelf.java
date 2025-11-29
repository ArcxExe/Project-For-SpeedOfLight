package ru.arcxexe.solidfridge;

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
    // TODO: Add exceptions
    this.shelf[index] = food;
    System.out.println("Food in fridge");
  }

  public Food getFood(int index) {
    var food = this.shelf[index];
    if (food != null) {
      this.shelf[index] = null;
      return food;
    }else {
      throw new IndexOutOfBoundsException("По заданному индексу нету еды");
    }

  }
}
