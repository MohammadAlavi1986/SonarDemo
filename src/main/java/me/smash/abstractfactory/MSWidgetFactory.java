package me.smash.abstractfactory;

public class MSWidgetFactory implements WidgetFactory {

  @Override
  public Window createWindow() {
    return new MSWindow();
  }

  @Override
  public Button createButton() {
    return new MSButton();
  }
}
