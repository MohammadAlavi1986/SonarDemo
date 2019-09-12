package me.smash.interpreter;

public class ContainExpression implements Expression {

  private final String text;

  public ContainExpression(String text) {
    this.text = text;
  }

  @Override
  public boolean evaluate(String data) {
    return data.contains(text);
  }
}
