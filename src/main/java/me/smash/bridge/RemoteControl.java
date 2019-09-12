package me.smash.bridge;

public class RemoteControl {

  private final TvImplementor implementor;
  private int currentChannel;

  RemoteControl(TvImplementor implementor) {
    this.implementor = implementor;
  }

  void on() {
    implementor.on();
  }

  public void off() {
    implementor.off();
  }

  void setChannel(int channel) {
    this.currentChannel = channel;
    implementor.tuneChannel(channel);
  }

  int getCurrentChannel() {
    return currentChannel;
  }

}
