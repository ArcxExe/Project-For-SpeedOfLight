package ru.arcxexe.solidfridge;

import java.util.ArrayList;
import java.util.List;

public class Fridge {

  private FridgerInfo info;

  public Fridge(FridgerInfo info) {
    this.info = info;
  }

  public void open() {
    // TODO: Logic open fridge . Требуется для для того чтобы положить еду . Без
    // изменения этого состояния не получится положить еду.
    System.out.println("Fridge open");
  }

  public void getStateFridge() {
    // TODO: Получение данных о состоянии холожильника .
    // Закрыт или открыт
    // Открыт или закрыт
    // Включен или нет
  }

  public void activate() {
    // TODO: Logic activate fridge
    System.out.println("Fridge is active");
  }

  public void close() {
    // TODO: Logic open fridge . Так же после того , как положил еду , и уйти , то
    // есть закрыть программу , требуется обязательно закрыть холожильник
    // То есть , требуется чтобы холодильник был всегда закрыт
    System.out.println("Fridge is close");
  }


  // Get info for Fridge
  public ArrayList<String> getInfo() {
    return new ArrayList<String>(List.of(info.brand(), info.model(), Integer.toString(info.elcUsing())));
  }
}
