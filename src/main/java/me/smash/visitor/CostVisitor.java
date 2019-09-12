package me.smash.visitor;

public class CostVisitor implements Visitor {

  private int totalCost;

  @Override
  public void visit(BookOrder order) {
    int cost = order.getPricePerUnit() * order.getQuantity();
    if (cost > 50) {
      cost *= .95;
    }
    totalCost +=  cost;
  }

  @Override
  public void visit(FruitOrder order) {
    totalCost += order.getPricePerKG() * order.getWeight();
  }

  public int getTotalCost() {
    return totalCost;
  }
}
