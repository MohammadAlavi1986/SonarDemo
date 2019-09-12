package me.smash.abstractfactory;

public class MacOSWidgetFactory implements WidgetFactory {

  @Override
  public Window createWindow() {
    return new MacOSWindow();
  }

  @Override
  public Button createButton() {
    return new MacOsButton();
  }
}
