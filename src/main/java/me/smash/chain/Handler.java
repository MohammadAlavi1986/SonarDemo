package me.smash.chain;

public abstract class Handler {
  private final Handler next;

  public Handler(Handler next) {
    this.next = next;
  }

  public void process(int req) {
    if (next != null) {
      next.process(req);
    }
  }
}
