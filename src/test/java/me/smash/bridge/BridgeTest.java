package me.smash.bridge;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class BridgeTest {
  @Test
  public void testBridge() {
    TvImplementor implementor1 = new SonyImplementor();
    TvImplementor implementor2 = new SamsungImplementor();

    RemoteControl remoteControl1 = new RemoteControl(implementor1);
    RemoteControl remoteControl2 = new RemoteControl(implementor2);

    assertEquals("Sony-On",  remoteControl1.on());
    assertEquals("Samsung-On",  remoteControl2.on());


    assertEquals("Sony-Off",  remoteControl1.off());
    assertEquals("Samsung-Off",  remoteControl2.off());

    RefinedRemoteControl refinedController = new RefinedRemoteControl(implementor2);

    assertEquals("Samsung-tuneChannel-1",  refinedController.nextChannel());
    assertEquals("Samsung-tuneChannel-2",  refinedController.nextChannel());
  }
}
