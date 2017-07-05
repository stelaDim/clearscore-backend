package com.clearscore.service;

import com.clearscore.model.user.User;

import java.time.LocalDate;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

import static com.clearscore.util.FileUtils.readLines;

public class UserService {

  private final List<User> data;

  public UserService() {
    this.data = loadUserData();
  }

  public List<User> getAllUsers() {
    return new ArrayList<>(data);
  }

  public Optional<User> findUserWithId(int id) {
    for (User user : data) {
      if (user.getId() == id) {
        return Optional.of(user);
      }
    }

    return Optional.empty();
  }

  private List<User> loadUserData() {
    List<User> users = new ArrayList<>();
    List<String> lines = readLines("data/users.csv");

    lines.remove(0);

    for(String line : lines) {
      String[] columns = line.split(",");

      User user = new User();
      user.setId(convertId(columns[0]));
      user.setTitle(columns[1]);
      user.setFirstName(columns[2]);
      user.setLastName(columns[3]);
      user.setEmail(columns[4]);
      user.setDob(convertDob(columns[5]));
      user.setAddress1(columns[6]);
      user.setAddress2(convertAddress2(columns[7]));
      user.setPostcode(columns[8]);

      users.add(user);
    }
    return users;
  }

  private int convertId(String rawValue) {
    return Integer.valueOf(rawValue);
  }

  private LocalDate convertDob(String rawValue) {
    DateTimeFormatter dateFormat = DateTimeFormatter.ofPattern("M/dd/yyyy");
    return LocalDate.parse(rawValue, dateFormat);
  }

  private Optional<String> convertAddress2(String rawValue) {
    if (rawValue.length() > 0) {
      return Optional.of(rawValue);
    } else {
      return Optional.empty();
    }
  }
}