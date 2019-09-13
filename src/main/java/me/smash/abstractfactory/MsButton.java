package me.smash.abstractfactory;

public class MsButton implements Button {

  @Override
  public void click() {
    System.out.println("MSButton");
  }
}
