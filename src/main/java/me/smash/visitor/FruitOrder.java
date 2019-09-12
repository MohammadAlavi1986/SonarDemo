package me.smash.visitor;

public class FruitOrder implements OrderItem {
  private final int pricePerKG;
  private final int weight;

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }

  public FruitOrder(int pricePerKG, int weight) {
    this.pricePerKG = pricePerKG;
    this.weight = weight;
  }

  public int getPricePerKG() {
    return pricePerKG;
  }

  public int getWeight() {
    return weight;
  }
}
