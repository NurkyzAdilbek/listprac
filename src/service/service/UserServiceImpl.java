package service.service;

import models.User;
import service.UserService;

import java.util.List;

public class UserServiceImpl implements UserService {
    @Override
    public String register (String email, String password) throws RuntimeException{
        try {
        if (password.length()<8){
            throw new RuntimeException();
        }
            System.out.println(password);
        }
        catch (RuntimeException runtimeException){
            return "Password az ";
        }
        return " Sie haben erfolgreich registiert";
    }

    @Override
    public String login(String email) {
        return null;
    }

    @Override
    public User getUserByEmail(String email) {
        return null;
    }

    @Override
    public List<User> getAllUsers() {
        return null;
    }
}
