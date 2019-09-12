package me.smash.flyweight;

public class TreeManager {
  public static final int MAX_X = 100;
  public static final int MAX_Y = 100;
  private final Tree tree = new Tree();

  int age[][];

  public TreeManager() {
    age = new int[MAX_X][MAX_Y];
  }

  public void addTree(int x, int y, int age) {
    if (x >= MAX_X || y >= MAX_Y) {
      throw new IllegalArgumentException("invalid x or y");
    }
    this.age[x][y] = age;
  }

  public void showTree() {
    for (int i = 0; i < MAX_X; i++) {
      for (int j = 0; j < MAX_Y; j++) {
        if (age[i][j] > 0) {
          tree.show(i, j, age[i][j]);
        }
      }
    }
  }

}
