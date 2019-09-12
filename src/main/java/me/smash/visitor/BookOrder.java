package me.smash.visitor;

public class BookOrder implements OrderItem {
  private final int quantity;
  private final int pricePerUnit;

  public BookOrder(int quantity, int pricePerUnit) {
    this.quantity = quantity;
    this.pricePerUnit = pricePerUnit;
  }

  public int getQuantity() {
    return quantity;
  }

  public int getPricePerUnit() {
    return pricePerUnit;
  }

  @Override
  public void accept(Visitor visitor) {
    visitor.visit(this);
  }
}
