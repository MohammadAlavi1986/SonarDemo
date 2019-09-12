package me.smash.state;

public class SilentState implements State {

  @Override
  public void vibrate() {
    System.out.println("silent...");
  }
}
