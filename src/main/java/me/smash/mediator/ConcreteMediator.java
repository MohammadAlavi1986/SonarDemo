package me.smash.mediator;

import java.util.ArrayList;
import java.util.List;

public class ConcreteMediator implements Mediator {

  private final List<Colleague> colleagueList = new ArrayList<>();

  @Override
  public void register(Colleague colleague) {
    if (!colleagueList.contains(colleague)) {
      colleagueList.add(colleague);
    }
  }

  @Override
  public void unregister(Colleague colleague) {
    colleagueList.remove(colleague);
  }

  @Override
  public void sendMessage(String message, Colleague colleague) {
    for (Colleague colleague1 : colleagueList) {
      if (!colleague.equals(colleague1)) {
        colleague1.receiveMessage(message);
      }
    }
  }
}
