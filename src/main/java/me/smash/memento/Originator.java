package me.smash.memento;

public class Originator {
  private String state;

  public Memento save() {
    return new Memento(state);
  }

  public void doSomething(int arg) {
    state += "doingSomething " + arg;
  }

  public void restore(Memento memento) {
    state = memento.getState();
  }

  public String getState() {
    return state;
  }
}
