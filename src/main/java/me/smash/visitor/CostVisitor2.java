package me.smash.visitor;

public class CostVisitor2 implements Visitor2 {

  private int totalCost;

  @Override
  public void visit(OrderItem order) {
    if (order instanceof BookOrder) {
      visit((BookOrder) order);
    } else if (order instanceof FruitOrder) {
      visit((FruitOrder) order);
    } else {
      throw new UnsupportedOperationException("unsupported order item");
    }
  }

  private void visit(BookOrder order) {
    int cost = order.getPricePerUnit() * order.getQuantity();

    if (cost > 50) {
      cost *= .95;
    }
    totalCost += cost;
  }

  private void visit(FruitOrder order) {
    totalCost += order.getPricePerKG() * order.getWeight();
  }

  public int getTotalCost() {
    return totalCost;
  }
}
