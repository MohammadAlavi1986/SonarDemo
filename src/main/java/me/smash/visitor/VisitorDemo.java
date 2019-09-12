package me.smash.visitor;

public class VisitorDemo {

  public static void main(String[] args) {
    ShoppingCart cart = new ShoppingCart();
    cart.addOrderItem(new BookOrder(10, 30));
    cart.addOrderItem(new BookOrder(1, 20));
    cart.addOrderItem(new FruitOrder(3, 1));

    System.out.println("TotalCost: " + cart.getTotalCost());
  }
}
