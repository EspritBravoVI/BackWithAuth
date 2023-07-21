package com.esprit.devpi.service;



import com.esprit.devpi.entities.Post;

import java.util.List;

public interface PostService {
    Post savePost(Post post);
    Post getPostById(Long id);
    List<Post> getAllPosts();
    void deletePost(Long id);
}




