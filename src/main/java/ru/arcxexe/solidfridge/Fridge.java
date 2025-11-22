package ru.arcxexe.solidfridge;

import java.util.ArrayList;
import java.util.List;

public class Fridge {
  
  private FridgerInfo info;

  public Fridge(FridgerInfo info) {
    this.info = info;
  }

  // Get info for Fridge
  public ArrayList<String> getInfo() {
    return new ArrayList<String>(List.of(info.brand() , info.model() , Integer.toString(info.elcUsing())));
  }
}
