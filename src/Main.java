import enums.Gender;
import models.User;
import service.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.Collections;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        User[] users = {
                new User(1L, "alice@example.com", "password123", "Alice Johnson", Gender.FEMALE),
                new User(2L, "bob@example.com", "password123", "Bob Smith", Gender.MALE),
                new User(3L, "charlie@example.com", "password123", "Charlie Brown", Gender.MALE),
                new User(4L, "diana@example.com", "password123", "Diana Prince", Gender.FEMALE),
                new User(5L, "eve@example.com", "password123", "Eve Adams", Gender.FEMALE),
                new User(6L, "frank@example.com", "password123", "Frank White", Gender.MALE),
                new User(7L, "grace@example.com", "password123", "Grace Hopper", Gender.FEMALE),
                new User(8L, "hank@example.com", "password123", "Hank Pym", Gender.MALE),
                new User(9L, "ivy@example.com", "password123", "Ivy Lee", Gender.FEMALE)};

        UserServiceImpl userService=new UserServiceImpl();
        System.out.println(userService.register("alice@example.com", "passwor"));

    }
}