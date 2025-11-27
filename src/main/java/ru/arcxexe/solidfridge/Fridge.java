package ru.arcxexe.solidfridge;

import java.util.ArrayList;
import java.util.List;

public class Fridge {

  private final List<Shelf> shelf;
  private FridgerInfo info;
  private DoorStatus  stateDoor = DoorStatus.CLOSED;
  private PowerStatus stateIsWorking = PowerStatus.OFF;

  public Fridge(FridgerInfo info, List<Shelf> listShelf) {
    this.info = info;
    if (listShelf.size() > info.maxCountShelf()) {
      throw new IllegalArgumentException("Shelf size , not more than max size");
    }else {
      this.shelf = listShelf;
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

  // Get info for Fridge
  public ArrayList<String> getInfo() {
    return new ArrayList<String>(List.of(info.brand(), info.model(), Integer.toString(info.elcUsing())));
  }
}
