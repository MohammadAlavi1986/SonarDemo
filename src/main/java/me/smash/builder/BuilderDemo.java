package me.smash.builder;

import java.util.Date;

public class BuilderDemo {

  public static void main(String[] args) {
    User user = new UserBuilder("mohammad", "alavi").address("address")
        .birthDate(new Date(1_213_214_324)).education("education").build();
    System.out.println(user);
  }
}
