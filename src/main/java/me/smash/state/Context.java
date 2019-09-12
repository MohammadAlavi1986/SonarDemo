package me.smash.state;

public class Context {
  private final State alertState;
  private final State silentState;
  private State currentState;

  public Context(State alertState, State silentState) {
    this.alertState = alertState;
    this.silentState = silentState;
    currentState = alertState;
  }

  public void vibrate() {
    currentState.vibrate();
  }

  public void putToSilent() {
    currentState = silentState;
  }

  public void putToAlert() {
    currentState = alertState;
  }

}
