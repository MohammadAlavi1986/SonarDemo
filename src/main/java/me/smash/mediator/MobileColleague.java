package me.smash.mediator;

public class MobileColleague extends Colleague {

  public MobileColleague(Mediator mediator, String name) {
    super(mediator, name);
  }

  @Override
  public void receiveMessage(String message) {
    System.out.println(String.format("MobileColleague %s received a message: %s", name, message));
  }
}
