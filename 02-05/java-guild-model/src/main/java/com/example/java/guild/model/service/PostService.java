package com.example.java.guild.model.service;
import java.util.List;

import com.example.java.guild.model.model.Post;


public interface PostService {
    List<Post> getAllPosts();

    Post createPost(Post post);

    Post updatePost(long id, Post post);

    void deletePost(long id);

    Post getPostById(long id);
}
