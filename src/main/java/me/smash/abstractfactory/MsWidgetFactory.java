package me.smash.abstractfactory;

public class MsWidgetFactory implements WidgetFactory {

  @Override
  public Window createWindow() {
    return new MsWindow();
  }

  @Override
  public Button createButton() {
    return new MsButton();
  }
}
