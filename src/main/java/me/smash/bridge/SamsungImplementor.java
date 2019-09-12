package me.smash.bridge;

public class SamsungImplementor implements TvImplementor {

  @Override
  public void on() {
    System.out.println("Samsung-On");
  }

  @Override
  public void off() {
    System.out.println("Samsung-Off");
  }

  @Override
  public void tuneChannel(int channel) {
    System.out.println("Samsung-tuneChannel-" + channel);
  }
}
