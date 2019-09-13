package me.smash.mediator;

public interface Mediator {

  void register(Colleague colleague);

  void unregister(Colleague colleague);

  void sendMessage(String message, Colleague colleague);
}
