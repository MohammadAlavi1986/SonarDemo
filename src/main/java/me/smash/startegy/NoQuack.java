package me.smash.startegy;

public class NoQuack implements QuackBehavior {

  @Override
  public void quack() {
    System.out.println("NoQuack....");
  }
}
