package me.smash.abstractfactory;

public class WidgetLibrary implements WidgetFactory {

  private final WidgetFactory factory;

  public WidgetLibrary(WidgetFactory factory) {
    this.factory = factory;
  }

  public Window createWindow() {
    return factory.createWindow();
  }

  public Button createButton() {
    return factory.createButton();
  }


}
