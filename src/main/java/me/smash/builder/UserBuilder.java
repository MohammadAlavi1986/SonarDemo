package me.smash.builder;

import java.util.Date;

class UserBuilder {
  private final String name;
  private final String family;
  private Date birthDate;
  private String education;
  private String address;

  UserBuilder(String name, String family) {
    this.name = name;
    this.family = family;
  }

  UserBuilder birthDate(Date birthDate) {
    this.birthDate = birthDate;
    return this;
  }
  UserBuilder education(String education) {
    this.education = education;
    return this;
  }
  UserBuilder address(String address) {
    this.address = address;
    return this;
  }

  User build() {
    return new User(this);
  }

  String getName() {
    return name;
  }

  String getFamily() {
    return family;
  }

  Date getBirthDate() {
    return birthDate;
  }

  String getEducation() {
    return education;
  }

  String getAddress() {
    return address;
  }
}
