package me.smash.bridge;

public class SonyImplementor implements TvImplementor {

  @Override
  public String on() {
    return "Sony-On";
  }

  @Override
  public String off() {
    return "Sony-Off";
  }

  @Override
  public String tuneChannel(int channel) {
    return "Sony-tuneChannel-" + channel;
  }
}

