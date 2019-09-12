package me.smash.bridge;

class RefinedRemoteControl extends RemoteControl {

  /* default */ RefinedRemoteControl(TvImplementor implementor) {
    super(implementor);
  }

  String nextChannel() {
    return setChannel(getCurrentChannel() + 1);
  }
}
