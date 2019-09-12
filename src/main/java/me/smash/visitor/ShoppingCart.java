package me.smash.visitor;

import java.util.ArrayList;
import java.util.List;

public class ShoppingCart {
  final List<OrderItem> items = new ArrayList<>();

  public void addOrderItem(OrderItem item) {
    items.add(item);
  }

  public int getTotalCost() {
    CostVisitor visitor = new CostVisitor();
    for (OrderItem item : items) {
      item.accept(visitor);
    }
    return visitor.getTotalCost();
  }
}
