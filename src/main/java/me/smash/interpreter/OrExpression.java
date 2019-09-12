package me.smash.interpreter;

public class OrExpression implements Expression {
  private final Expression expression1;
  private final Expression expression2;

  public OrExpression(Expression expression1, Expression expression2) {
    this.expression1 = expression1;
    this.expression2 = expression2;
  }

  @Override
  public boolean evaluate(String data) {
    return expression1.evaluate(data) || expression2.evaluate(data);
  }
}
