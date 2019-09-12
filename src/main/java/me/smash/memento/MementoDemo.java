package me.smash.memento;

public class MementoDemo {

  public static void main(String[] args) {
    Originator originator = new Originator();
    originator.doSomething(123);
    Memento memento = originator.save();
    originator.doSomething(546);
    System.out.println(originator.getState());

    originator.restore(memento);
    System.out.println(originator.getState());
  }
}
