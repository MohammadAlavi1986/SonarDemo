package me.smash.mediator;

public class ConcreteColleague extends Colleague {

  public ConcreteColleague(Mediator mediator, String name) {
    super(mediator, name);
  }

  @Override
  public void receiveMessage(String message) {
    System.out.println(String.format("ConcreteColleague %s received a message: %s", name, message));
  }
}
