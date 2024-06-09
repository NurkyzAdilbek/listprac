package service.service;

import models.Post;
import models.User;
import service.PostService;

import java.util.ArrayList;
import java.util.List;

public class PostServiceImpl implements PostService {
    List<User>users=new ArrayList<>();
    List<Post>posts=new ArrayList<>();


    @Override
    public String addPostToUser(String userName, Post post) {
        for (User user1:users){
            if (user1.getFullName().equals(userName)){
                user1.addPost(post);
                return "Es wurde erfolgreich hinzugefugt";


            }
        }

        return null;
    }

    @Override
    public String deletePostById(Long postId) {
        for (Post post:posts){
            if (post.getUniqueId().equals(postId)){
                posts.remove(post);
            }
        }

        return "Ishtegen jok";
    }

    @Override
    public List<Post> getAllPostByUserId(Long userId) {
        for (User user:users){
            if (user.getUniqueId().equals(userId)){
                return posts;
            }
        }
        return null;
    }
}
