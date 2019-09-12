package me.smash.command;

public interface Command {
  public void execute();
  public void undo();
}
