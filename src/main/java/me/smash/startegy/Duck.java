package me.smash.startegy;

public class Duck {

  private QuackBehavior quackBehavior;
  private FlyBehavior flyBehavior;

  public Duck(QuackBehavior quackBehavior, FlyBehavior flyBehavior) {
    this.quackBehavior = quackBehavior;
    this.flyBehavior = flyBehavior;
  }

  public void fly() {
    flyBehavior.fly();
  }

  public void quack() {
    quackBehavior.quack();
  }

  public void setQuackBehavior(QuackBehavior quackBehavior) {
    this.quackBehavior = quackBehavior;
  }

  public void setFlyBehavior(FlyBehavior flyBehavior) {
    this.flyBehavior = flyBehavior;
  }
}
