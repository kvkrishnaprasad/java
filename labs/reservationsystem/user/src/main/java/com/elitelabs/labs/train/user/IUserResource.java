package com.elitelabs.labs.train.user;

import com.elitelabs.labs.train.user.response.User;

import java.util.List;

public interface IUserResource {
  List<User> getAllUsers();
  void addUser(User user);
  void updateUser(String userName, User user);
}
