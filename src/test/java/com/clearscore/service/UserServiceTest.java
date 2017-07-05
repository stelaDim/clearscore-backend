package com.clearscore.service;

import com.clearscore.model.user.User;
import org.junit.Before;
import org.junit.Test;
import java.util.List;
import java.util.Optional;

import static org.junit.Assert.*;

public class UserServiceTest {

  private UserService service;

  @Before
  public void setupTest() {
    this.service = new UserService();
  }

  @Test
  public void testAllUsers() {
    List<User> allUsers = service.getAllUsers();

    assertTrue(allUsers.size() > 0);
  }

  @Test
  public void testGetASingleUser() {
    Optional<User> user = service.findUserWithId(6);

    assertTrue(user.isPresent());
    assertEquals(user.get().getFirstName(), "Lily");
  }
}
