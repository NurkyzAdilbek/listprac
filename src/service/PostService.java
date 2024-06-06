package service;

import models.Post;
import models.User;

import java.util.List;

public interface PostService {
  String addPostToUser(Post post, User user);
  String deletePostById(Long id);
  List<Post>getAllPostByUserId(Long userId);
}
