import enums.Gender;
import models.Post;
import models.User;
import service.service.PostServiceImpl;
import service.service.UserServiceImpl;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        List<User>users=new ArrayList<>();
        List<Post>posts=new ArrayList<>();
        UserServiceImpl userService=new UserServiceImpl();
        PostServiceImpl postService=new PostServiceImpl();
         User user1= new User(1L, "alice@example.com", "password123", "Alice Johnson", Gender.FEMALE);
         Post post1=new Post(1L,"\"https://example.com/images/bob.jpg\"","in the sity");
        System.out.println(posts.add(post1));
        System.out.println(users.add(user1));
        System.out.println("USER_SERVICE");
        System.out.println("Registration");
         System.out.println(userService.register("alice@example.com", "password123"));
        System.out.println("Login");
        System.out.println(userService.login("alice@example.com"));
        System.out.println("Get user by email");
        System.out.println(userService.getUserByEmail("alice@example.com"));
        System.out.println("All users");
        System.out.println(userService.getAllUsers());

        System.out.println("Post_Service");
        System.out.println("Add post to user");
        System.out.println(postService.addPostToUser("alice@example.com", post1));
        System.out.println("delete Post By Id");
        System.out.println(postService.deletePostById(1L));

    }
}