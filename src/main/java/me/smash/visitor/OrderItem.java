package me.smash.visitor;

public interface OrderItem {
  public void accept(Visitor visitor);
}
