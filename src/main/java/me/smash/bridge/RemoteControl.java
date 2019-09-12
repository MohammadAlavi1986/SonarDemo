package me.smash.bridge;

public class RemoteControl {

  private final TvImplementor implementor;
  private int currentChannel;

  RemoteControl(TvImplementor implementor) {
    this.implementor = implementor;
  }

  String on() {
    return implementor.on();
  }

  public String off() {
    return implementor.off();
  }

  String setChannel(int channel) {
    this.currentChannel = channel;
    return implementor.tuneChannel(channel);
  }

  int getCurrentChannel() {
    return currentChannel;
  }

}
