package me.smash.prototype;

public abstract class SamplePrototype implements Cloneable {
  private String state;

  public SamplePrototype(String state) {
    this.state = state;
  }

  public String getState() {
    return state;
  }

  public void setState(String state) {
    this.state = state;
  }

  @Override
  public SamplePrototype clone() throws CloneNotSupportedException {
    return (SamplePrototype) super.clone();
  }
}
