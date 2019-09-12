package me.smash.singleton;

public enum HeavyClass {
  INSTANCE;

  HeavyClass() {
    System.out.println("HeavyClass::ctor");
  }

  public void doSomething() {
    System.out.println("doSomething");
  }

}
