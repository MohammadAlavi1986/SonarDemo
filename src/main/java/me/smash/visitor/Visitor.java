package me.smash.visitor;

public interface Visitor {

  void visit(BookOrder order);

  void visit(FruitOrder order);
}
