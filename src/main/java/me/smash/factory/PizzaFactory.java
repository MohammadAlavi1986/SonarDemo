package me.smash.factory;

class PizzaFactory {
  static Pizza createPizza(String type) {
    switch (type) {
      case "Peperoni":
        return new PeperoniPizza();
      case "Veggie":
        return new VeggiePizza();
      default:
        throw new IllegalArgumentException("No pizza with the given type exists");
    }
  }
}
