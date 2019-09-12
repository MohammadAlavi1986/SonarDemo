package me.smash.builder;

import java.util.Date;

public class User {

  private final String name;
  private final String family;
  private final Date birthDate;
  private final String education;
  private final String address;

  User(UserBuilder userBuilder) {
    name = userBuilder.getName();
    family = userBuilder.getFamily();
    birthDate = userBuilder.getBirthDate();
    education = userBuilder.getEducation();
    address = userBuilder.getAddress();
  }

  public String getName() {
    return name;
  }

  public String getFamily() {
    return family;
  }

  public Date getBirthDate() {
    return (Date) birthDate.clone();
  }

  public String getEducation() {
    return education;
  }

  public String getAddress() {
    return address;
  }

  @Override
  public String toString() {
    return String
        .format("User{name='%s', family='%s', birthDate=%s, education='%s', address='%s'}", name,
            family, birthDate, education, address);
  }
}
