package me.smash.state;

public class StateDemo {

  public static void main(String[] args) {
    Context context = new Context(new AlertState(), new SilentState());

    context.vibrate();
    context.putToSilent();
    context.vibrate();
  }
}
