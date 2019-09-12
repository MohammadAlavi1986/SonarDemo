package me.smash.chain;

public class PositiveHandler extends Handler {

  public PositiveHandler(Handler next) {
    super(next);
  }

  @Override
  public void process(int req) {
    if (req > 0) {
      System.out.println("positive handler: " + req);
    } else {
      super.process(req);
    }
  }
}
