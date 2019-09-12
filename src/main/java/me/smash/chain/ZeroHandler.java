package me.smash.chain;

public class ZeroHandler extends Handler {

  public ZeroHandler(Handler next) {
    super(next);
  }

  @Override
  public void process(int req) {
    if (req == 0) {
      System.out.println("ZeroHandler: " + req);
    } else {
      super.process(req);
    }
  }
}
