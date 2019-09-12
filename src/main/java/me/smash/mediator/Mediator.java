package me.smash.mediator;

public interface Mediator {
  public void register(Colleague colleague);
  public void unregister(Colleague colleague);
  public void sendMessage(String message, Colleague colleague);
}
