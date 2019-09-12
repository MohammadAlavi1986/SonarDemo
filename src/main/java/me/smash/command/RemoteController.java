package me.smash.command;

public class RemoteController {
  private Command command;

  public Command getCommand() {
    return command;
  }

  public void setCommand(Command command) {
    this.command = command;
  }

  public void buttonPressed() {
    if (command != null) {
      command.execute();
    }
  }

  public void undoLastCommand() {
    if (command != null) {
      command.undo();
    }
  }
}

