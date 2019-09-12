package me.smash.command;

public class CommandDemo {

  public static void main(String[] args) {
    Light light = new Light();
    LightOnCommand onCommand = new LightOnCommand(light);
    LightOffCommand offCommand = new LightOffCommand(light);

    RemoteController remoteController = new RemoteController();
    remoteController.setCommand(onCommand);
    remoteController.buttonPressed();

    remoteController.setCommand(offCommand);
    remoteController.buttonPressed();

    remoteController.undoLastCommand();
  }

}
