package ru.arcxexe.solidfridge;

import java.util.List;
import java.util.Collections;

import ru.arcxexe.solidfridge.Food.*;

public class Shelf implements ShelfInterface {

  int sizeShelf;
  List<Food> shelf;

  public Shelf(int sizeShelf) {
    this.sizeShelf = sizeShelf;
    if (sizeShelf > 0) {
      this.shelf = Collections.nCopies(sizeShelf, null);
    }
  }

  public void getListFood() {
    StringBuilder result = new StringBuilder();
    for (Food food : shelf) {
      result.append(food + " ");
    }
    System.out.println(result);
  }

  public void putFood(Food food) {
    // TODO: Add exceptions
    this.shelf.add(food);
    System.out.println("Food in fridge");
  }

  public Food getFood(int index) {
    var food = this.shelf.get(index);
    if (food != null) {
      return food;
    }else {
      throw new IndexOutOfBoundsException("По заданному индексу нету еды");
    }

  }
}
