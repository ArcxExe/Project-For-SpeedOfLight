package ru.arcxexe.solidfridge;

import java.time.LocalDate;

import ru.arcxexe.solidfridge.Food.Food;

public class Main {
  public static void main(String[] args) {
    LocalDate dateNow = LocalDate.now();
    LocalDate dateSome = dateNow.plusDays(10);
    FridgerInfo infoForFridge1 = new FridgerInfo("1000", "Samsung", 350, 2, 2);
    Food milk = new Food("Milk", dateNow, dateSome);
    Fridge fridge1 = new Fridge(infoForFridge1);
    Shelf fridgeShelf1 = fridge1.getShelfByIndex(0);
    fridgeShelf1.getListFood();
    fridgeShelf1.putFood(milk, 1);
    fridgeShelf1.getListFood();
    System.out.println(fridge1.getInfo());
    System.out.println("Print all shelf: ");
    fridge1.printAllShelf();
  }
}
