package service.service;

import enums.Gender;
import models.Post;
import models.User;
import service.UserService;

import java.util.ArrayList;
import java.util.List;

public class UserServiceImpl implements UserService {
    List<User>users=new ArrayList<>();
    List<Post>posts=new ArrayList<>();
    @Override
    public User register (String email, String password) {
        for (User user:users){
            if (user.getEmail().equals(email)){
                System.out.println("Mynday email eje bar");

            }
            else {
                User newUser=new User(email,password);
                users.add(newUser);
                return newUser;
            }
        }

        return null;
    }

    @Override
    public User login(String email) {
        for (User user:users){
            if (user.getEmail().equals(email)){
                return user;

            }}
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        for (User user:users){
            if (user.getEmail().equals(email)){
                return user;

            }}
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return users;
    }
}
