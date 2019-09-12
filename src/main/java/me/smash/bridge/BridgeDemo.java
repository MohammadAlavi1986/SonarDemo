package me.smash.bridge;

public class BridgeDemo {

  /**
   * This is a demo.
   * @param args arguments passed to app
   */
  public static void main(String[] args) {
    TvImplementor implementor1 = new SonyImplementor();
    TvImplementor implementor2 = new SamsungImplementor();

    RemoteControl remoteControl1 = new RemoteControl(implementor1);
    RemoteControl remoteControl2 = new RemoteControl(implementor2);

    remoteControl1.on();
    remoteControl2.on();

    remoteControl1.off();
    remoteControl2.off();

    RefinedRemoteControl refinedController = new RefinedRemoteControl(implementor2);
    refinedController.nextChannel();
    refinedController.nextChannel();
  }
}
