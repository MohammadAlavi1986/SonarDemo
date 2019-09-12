package me.smash.state;

public class AlertState implements State {

  @Override
  public void vibrate() {
    System.out.println("vibrating....");
  }
}
