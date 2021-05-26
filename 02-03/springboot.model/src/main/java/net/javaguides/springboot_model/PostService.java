package net.javaguides.springboot_model;
import java.util.List;

import net.javaguides.springboot_model.Post;

public interface PostService {
    List<Post> getAllPosts();

    Post createPost(Post post);

    Post updatePost(long id, Post post);

    void deletePost(long id);

    Post getPostById(long id);

}
