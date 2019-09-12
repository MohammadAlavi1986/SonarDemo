package me.smash.command;

public class StereoPlayCommand implements Command {
  private final Stereo stereo;

  public StereoPlayCommand(Stereo stereo) {
    this.stereo = stereo;
  }

  @Override
  public void execute() {
    stereo.play();
  }

  @Override
  public void undo() {
    stereo.turnOff();
  }
}
