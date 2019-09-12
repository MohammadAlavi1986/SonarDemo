package me.smash.bridge;

class RefinedRemoteControl extends RemoteControl {

  /* default */ RefinedRemoteControl(TvImplementor implementor) {
    super(implementor);
  }

  void nextChannel() {
    setChannel(getCurrentChannel() + 1);
  }
}
