package me.smash.chain;

public class ChainOfResponsibilityDemo {

  public static void main(String[] args) {
    Handler handler = new PositiveHandler(new NegativeHandler(new ZeroHandler(null)));

    handler.process(-34);
    handler.process(32);
    handler.process(-0);
  }
}
