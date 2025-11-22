package ru.arcxexe.solidfridge;

public class Main {
  public static void main(String[] args) {
    FridgerInfo infoForFridge1 = new FridgerInfo("1000", "Samsung" , 350);
    Fridge fridge1 = new Fridge(infoForFridge1);
    System.out.println(fridge1.getInfo());
  }
}
