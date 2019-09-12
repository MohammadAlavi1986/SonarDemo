package me.smash.abstractfactory;

public class MacOsButton implements Button {

  @Override
  public void click() {
    System.out.print("MacOSButton");
  }
}
