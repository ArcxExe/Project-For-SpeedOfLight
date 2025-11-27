package ru.arcxexe.solidfridge;

import java.util.ArrayList;
import java.util.List;

public class Fridge {

  private final ArrayList<Shelf> shelf;
  private FridgerInfo info;
  private String stateDoor = "Close";
  private String stateIsWorking = "Enabled";

  public Fridge(FridgerInfo info, ArrayList<Shelf> listShelf) {
    this.info = info;
    if (listShelf.size() > info.maxCountShelf()) {
      throw new IllegalArgumentException("Shelf size , not more than max size");
    }else {
      this.shelf = listShelf;
    }
  }


  public void open() {
    if (stateDoor != "Close") {
      this.stateDoor = "Open";
      System.out.println("Fridge open");
    } else {
      System.out.println("Fridge door is already open");
    }
  }

  public void shutdown() {
    if (this.stateIsWorking != "Off") {
      this.stateIsWorking = "Off";
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
    if (this.stateIsWorking == "Off") {
      this.stateIsWorking = "Enabled";
      System.out.println("Fridge is active");
    } else {
      System.out.println("Fride is already working");
    }
  }

  public void close() {
    // TODO: Logic open fridge . Так же после того , как положил еду , и уйти , то
    // есть закрыть программу , требуется обязательно закрыть холожильник
    // То есть , требуется чтобы холодильник был всегда закрыт
    if (this.stateDoor != "Open") {
      this.stateDoor = "Close";
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
