package me.smash.factory;

public abstract class Pizza {
  private final String name;

  public Pizza(String name) {
    this.name = name;
  }

  public String getName() {
    return name;
  }



  @Override
  public String toString() {
    return "Pizza{" +
        "name='" + name + '\'' +
        '}';
  }
}
