package com.esprit.devpi.service;




import com.esprit.devpi.entities.Comment;

import java.util.List;

public interface CommentService {
    Comment saveComment(Comment comment);
    Comment getCommentById(Long id);
    List<Comment> getAllComments();
    void deleteComment(Long id);
}




