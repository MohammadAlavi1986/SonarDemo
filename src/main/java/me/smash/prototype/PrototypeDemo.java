package me.smash.prototype;

public class PrototypeDemo {

  public static void main(String[] args) throws CloneNotSupportedException {
    SamplePrototype prototype = new PrototypeState1();
    System.out.println(prototype.getState());

    SamplePrototype prototype1 = prototype.clone();
    prototype1.setState("state2");
    System.out.println(prototype1.getState());
  }
}
