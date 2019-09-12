package me.smash.visitor;

public interface Visitor {
  public void visit(BookOrder order);
  public void visit(FruitOrder order);
}
