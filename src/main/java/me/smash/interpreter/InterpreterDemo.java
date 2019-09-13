package me.smash.interpreter;

public class InterpreterDemo {

  public static void main(String[] args) {
    Expression expression = new AndExpression(new ContainExpression("Mohammad"),
        new ContainExpression("Alavi"));

    System.out.println(expression.evaluate("Mohammad Sadeghi"));
    System.out.println(expression.evaluate("Mohammad Alavi"));
  }
}
