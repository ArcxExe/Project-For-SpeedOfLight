package ru.arcxexe.solidfridge;

import java.time.LocalDate;
import java.util.List;

import ru.arcxexe.solidfridge.Food.Food;

public class Main {
  public static void main(String[] args) {
    LocalDate dateNow = LocalDate.now();
    LocalDate dateSome = dateNow.plusDays(10);
    FridgerInfo infoForFridge1 = new FridgerInfo("1000", "Samsung", 350, 2);
    Food milk = new Food("Milk", dateNow, dateSome);
    Shelf shelf1 = new Shelf(3);
    Shelf shelf2 = new Shelf(3);
    Fridge fridge1 = new Fridge(infoForFridge1, List.of(shelf1, shelf2));
    Shelf fridgeShelf1 = fridge1.getShelfByIndex(0);
    fridgeShelf1.getListFood();
    fridgeShelf1.putFood(milk , 1);
    fridgeShelf1.getListFood();
    System.out.println(fridge1.getInfo());
  }
}
