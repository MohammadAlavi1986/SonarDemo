package me.smash.abstractfactory;

public class MacOsWindow implements Window {

  @Override
  public void show() {
    System.out.println("MacOSWindow");
  }
}
