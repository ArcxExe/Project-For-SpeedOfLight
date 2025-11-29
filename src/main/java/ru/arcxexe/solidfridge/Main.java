package ru.arcxexe.solidfridge;

import java.time.LocalDate;
import java.util.ArrayList;

import ru.arcxexe.solidfridge.Food.Food;

public class Main {
  public static void main(String[] args) {
    LocalDate dateNow = LocalDate.now();
    LocalDate dateSome = dateNow.plusDays(10);
    FridgerInfo infoForFridge1 = new FridgerInfo("1000", "Samsung", 350, 2, 2);

    Food milk = new Food("Milk", dateSome);

    ShelfFactory factory = new ShelfFactory();
    ArrayList<ShelfInterface> shelf = new ArrayList<>();

    for (int i = 0; i < 2; i++) {
      shelf.add(factory.createShelf(2));
    }

    Fridge fridge1 = new Fridge(infoForFridge1 , shelf);
    ShelfInterface fridgeShelf1 = fridge1.getShelfByIndex(0);
    fridgeShelf1.getListFood();
    fridgeShelf1.addFood(milk, 1);
    fridgeShelf1.getListFood();
    System.out.println(fridge1.getInfo());
    System.out.println("Print all shelf: ");
    fridge1.printAllShelf();
  }
}
