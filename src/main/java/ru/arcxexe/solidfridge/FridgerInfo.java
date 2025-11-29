package ru.arcxexe.solidfridge;

import java.util.List;

public record FridgerInfo(String model, String brand, int elcUsing, int maxCountShelf, int maxCapacityShelf) {

  public List<String> getInfo() {
    return List
        .of("Model: " + model + "; Brand: " + brand + "; Electic using: " + Integer.toString(elcUsing) + "; Max count shelf: "
            + Integer.toString(maxCountShelf) + "; Max capacity shelfs: " + Integer.toString(maxCapacityShelf));
  }
}
