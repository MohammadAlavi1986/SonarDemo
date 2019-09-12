package me.smash.flyweight;

public class FlyweightDemo {

  public static void main(String[] args) {
    TreeManager manager = new TreeManager();
    manager.addTree(1, 2, 100);
    manager.addTree(11, 20, 56);
    manager.addTree(13, 2, 33);
    manager.addTree(1, 21, 7);
    manager.addTree(59, 2, 4);

    manager.showTree();
  }

}
