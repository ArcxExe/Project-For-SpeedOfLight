package ru.arcxexe.solidfridge;

public class ShelfFactory{

  public ShelfInterface createShelf(int capacity) {
    return new Shelf(capacity);
  }
}
