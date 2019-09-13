package me.smash.flyweight;

class TreeManager {

  private static final int MAX_X = 100;
  private static final int MAX_Y = 100;
  private final Tree tree = new Tree();

  private int age[][];

  TreeManager() {
    age = new int[MAX_X][MAX_Y];
  }

  void addTree(int x, int y, int age) {
    if (x >= MAX_X || y >= MAX_Y) {
      throw new IllegalArgumentException("invalid x or y");
    }
    this.age[x][y] = age;
  }

  void showTree() {
    for (int i = 0; i < MAX_X; i++) {
      for (int j = 0; j < MAX_Y; j++) {
        if (age[i][j] > 0) {
          tree.show(i, j, age[i][j]);
        }
      }
    }
  }

}
