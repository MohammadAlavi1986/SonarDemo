package me.smash.abstractfactory;

public class MacOsWidgetFactory implements WidgetFactory {

  @Override
  public Window createWindow() {
    return new MacOsWindow();
  }

  @Override
  public Button createButton() {
    return new MacOsButton();
  }
}
