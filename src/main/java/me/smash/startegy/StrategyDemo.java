package me.smash.startegy;

public class StrategyDemo {

  public static void main(String[] args) {
    Duck duck = new Duck(new NoQuack(), new NoFly());

    duck.fly();
    duck.quack();

    duck.setFlyBehavior(new FlyHigh());
    duck.setQuackBehavior(new LoudQuack());

    duck.fly();
    duck.quack();
  }
}
