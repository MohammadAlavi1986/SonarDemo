package me.smash.bridge;

public class SonyImplementor implements TvImplementor {

  @Override
  public void on() {
    System.out.println("Sony-On");
  }

  @Override
  public void off() {
    System.out.println("Sony-Off");
  }

  @Override
  public void tuneChannel(int channel) {
    System.out.println("Sony-tuneChannel-" + channel);
  }
}

