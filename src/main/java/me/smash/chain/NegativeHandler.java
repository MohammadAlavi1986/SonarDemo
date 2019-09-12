package me.smash.chain;

public class NegativeHandler extends Handler {

  public NegativeHandler(Handler next) {
    super(next);
  }

  @Override
  public void process(int req) {
    if (req < 0) {
      System.out.println("NegativeHandler: " + req);
    } else {
      super.process(req);
    }
  }
}
