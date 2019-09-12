package me.smash.startegy;

public class NoFly implements FlyBehavior {

  @Override
  public void fly() {
    System.out.println("NoFly");
  }
}
