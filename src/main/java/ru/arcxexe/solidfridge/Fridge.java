package ru.arcxexe.solidfridge;

import java.util.List;

import ru.arcxexe.solidfridge.Exceprions.DoorStateException;
import ru.arcxexe.solidfridge.Exceprions.FridgeStateException;

public class Fridge {

  private List<ShelfInterface> shelf;
  private FridgerInfo info;
  private DoorStatus  stateDoor = DoorStatus.CLOSED;
  private PowerStatus stateIsWorking = PowerStatus.OFF;

  public Fridge(FridgerInfo info , List<ShelfInterface> shelf ) {
    this.info = info;
    this.shelf = shelf;
  }

  public ShelfInterface getShelfByIndex(int index) {
    return this.shelf.get(index);
  }

  public void printAllShelf() {
    int b = 0;
    for (ShelfInterface a: this.shelf  ) {
      System.out.println("Shelf number: " + Integer.toString(b));
      System.out.println(a.getListFood());
      b++;
    }
  }

  public void open() {
    if (stateDoor == DoorStatus.CLOSED) {
      this.stateDoor = DoorStatus.OPEN;
    } else {
      throw new DoorStateException("Door already opened");
    }
  }

  public void shutdown() {
    if (this.stateIsWorking != PowerStatus.OFF) {
      this.stateIsWorking = PowerStatus.OFF;
    } else {
      throw new FridgeStateException("Fride already off");
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
    } else {
      throw new FridgeStateException("Fride already activate");
    }
  }

  public void close() {
    if (this.stateDoor != DoorStatus.CLOSED) {
      this.stateDoor = DoorStatus.CLOSED;
    } else {
      throw new DoorStateException("Door already closed");
    }
  }

  public List<String> getInfo() {
    return info.getInfo();
  }
}
