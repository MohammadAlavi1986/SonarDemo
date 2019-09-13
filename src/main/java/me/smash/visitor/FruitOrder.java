package me.smash.visitor;

public class FruitOrder implements OrderItem {

  private final int pricePerKg;
  private final int weight;

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public FruitOrder(int pricePerKg, int weight) {
    this.pricePerKg = pricePerKg;
    this.weight = weight;
  }

  public int getPricePerKg() {
    return pricePerKg;
  }

  public int getWeight() {
    return weight;
  }
}
