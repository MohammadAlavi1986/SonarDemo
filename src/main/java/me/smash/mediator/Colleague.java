package me.smash.mediator;

public abstract class Colleague {
  private final Mediator mediator;
  final String name;

  public Colleague(Mediator mediator, String name) {
    this.mediator = mediator;
    this.name = name;
    mediator.register(this);
  }

  public void sendMessage(String message) {
    mediator.sendMessage(message, this);
  }

  public abstract void receiveMessage(String message);
}
