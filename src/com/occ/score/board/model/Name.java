package com.occ.score.board.model;

/** Model class representing each name String */
public class Name {

  private String firstName;
  private String lastName;

  public Name(String firstName) {
    this.firstName = firstName;
  }

  public Name(String firstName, String lastName) {
    this.firstName = firstName;
    this.lastName = lastName;
  }

  /** @return string first Name. */
  public String getFirstName() {
    return firstName;
  }

  /** @return string last Name. */
  public String getLastName() {
    return lastName;
  }
}
