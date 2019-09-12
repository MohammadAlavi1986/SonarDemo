package me.smash.bridge;

public class SamsungImplementor implements TvImplementor {

  @Override
  public String on() {
    return "Samsung-On";
  }

  @Override
  public String off() {
    return "Samsung-Off";
  }

  @Override
  public String tuneChannel(int channel) {
    return "Samsung-tuneChannel-" + channel;
  }
}
