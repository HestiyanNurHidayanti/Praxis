package com.example.java.guild.model.controller;

import com.example.java.guild.model.model.Post;
import com.example.java.guild.model.payload.ApiResponse;
import com.example.java.guild.model.payload.PostDto;
import com.example.java.guild.model.service.PostService;
import org.modelmapper.ModelMapper;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import java.util.List;
import java.util.stream.Collectors;

@RestController
@RequestMapping("/api/post")
public class PostController {
    private final ModelMapper modelMapper;
    private final PostService postService;

    public PostController(ModelMapper modelMapper, PostService postService) {
        super();
        this.modelMapper = modelMapper;
        this.postService = postService;
    }

    @PostMapping("")
    public ResponseEntity<PostDto> createPost(@RequestBody PostDto postDto) {

        // convert DTO to entity
        Post postRequest = modelMapper.map(postDto, Post.class);

        Post post = postService.createPost(postRequest);

        // convert entity to DTO
        PostDto postResponse = modelMapper.map(post, PostDto.class);

        return new ResponseEntity<>(postResponse, HttpStatus.CREATED);
    }

    @GetMapping
    public List<PostDto> getAllPosts() {

        return postService.getAllPosts().stream().map(post -> modelMapper.map(post, PostDto.class))
                .collect(Collectors.toList());
    }

    @GetMapping("/{id}")
    public ResponseEntity<PostDto> getPostById(@PathVariable(name = "id") Long id) {
        Post post = postService.getPostById(id);

        // convert entity to DTO
        PostDto postResponse = modelMapper.map(post, PostDto.class);

        return ResponseEntity.ok().body(postResponse);
    }

    // change the request for DTO
    // change the response for DTO
    @PutMapping("/{id}")
    public ResponseEntity<PostDto> updatePost(@PathVariable long id, @RequestBody PostDto postDto) {

        // convert DTO to Entity
        Post postRequest = modelMapper.map(postDto, Post.class);

        Post post = postService.updatePost(id, postRequest);

        // entity to DTO
        PostDto postResponse = modelMapper.map(post, PostDto.class);

        return ResponseEntity.ok().body(postResponse);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<ApiResponse> deletePost(@PathVariable(name = "id") Long id) {
        postService.deletePost(id);
        ApiResponse apiResponse = new ApiResponse(Boolean.TRUE, "Post deleted successfully", HttpStatus.OK);
        return new ResponseEntity<>(apiResponse, HttpStatus.OK);
    }
}
