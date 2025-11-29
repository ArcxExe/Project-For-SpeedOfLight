package ru.arcxexe.solidfridge;

import java.util.ArrayList;
import java.util.List;

public class Fridge {

  private ArrayList<Shelf> shelf = new ArrayList<Shelf>();
  private FridgerInfo info;
  private DoorStatus  stateDoor = DoorStatus.CLOSED;
  private PowerStatus stateIsWorking = PowerStatus.OFF;

  public Fridge(FridgerInfo info) {
    this.info = info;
    for (int i = 0; i < this.info.maxCountShelf(); i++) {
      Shelf a = new Shelf(this.info.maxCapacityShelf());
      this.shelf.add(a);
    }
  }

  public Shelf getShelfByIndex(int index) {
    return this.shelf.get(index);
  }

  public void printAllShelf() {
    int b = 0;
    for (Shelf a: this.shelf ) {
      System.out.println("Shelf number: " + Integer.toString(b));
      a.getListFood();
      b++;
    }
  }

  public void open() {
    if (stateDoor != DoorStatus.CLOSED) {
      this.stateDoor = DoorStatus.OPEN;
      System.out.println("Fridge open");
    } else {
      System.out.println("Fridge door is already open");
    }
  }

  public void shutdown() {
    if (this.stateIsWorking != PowerStatus.OFF) {
      this.stateIsWorking = PowerStatus.OFF;
      System.out.println("Fride is off");
    } else {
      System.out.println("Fride is already off");
    }
  }
  public String getStateFridge() {
    StringBuilder state = new StringBuilder();
    state.append("Stating position Door: " + this.stateDoor + "\n");
    state.append("Stating work: " + this.stateIsWorking + "\n");
    return state.toString();
  }

  public void activate() {
    if (this.stateIsWorking == PowerStatus.OFF) {
      this.stateIsWorking = PowerStatus.ON;
      System.out.println("Fridge is active");
    } else {
      System.out.println("Fride is already working");
    }
  }

  public void close() {
    if (this.stateDoor != DoorStatus.CLOSED) {
      this.stateDoor = DoorStatus.CLOSED;
      System.out.println("Fridge is close");
    } else {
      System.out.println("Fridge door is already close");
    }
  }

  public List<String> getInfo() {
    return info.getInfo();
  }
}
