package service;

import models.User;

import java.util.List;

public interface UserService {
User register(String email, String password);
User login(String email);
User getUserByEmail(String email);
List<User>getAllUsers();

}
