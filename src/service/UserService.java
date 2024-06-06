package service;

import models.User;

import java.util.List;

public interface UserService {
String register(String email, String password);
String login(String email);
User getUserByEmail(String email);
List<User>getAllUsers();

}
