package com.PetAdoption.API.rest;

import com.PetAdoption.API.dao.Comment;
import com.PetAdoption.API.service.CommentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
import java.util.Optional;

@RestController
@RequestMapping("comment")
public class CommentController {

    @Autowired
    CommentService commentService;

    @GetMapping
    List<Comment> getAllComments() {
        return commentService.getAllComments();
    }

    @PostMapping
    Comment createComment(@RequestBody Comment comment) {
        return commentService.createComment(comment);
    }

    @PutMapping
    Comment updateComment(@RequestBody Comment comment) {
        return commentService.updateComment(comment);
    }

    @GetMapping("/{id}")
    Optional<Comment> getCommentById(@PathVariable("id") Long id) {
        return commentService.getCommentById(id);
    }

    @DeleteMapping("/{id}")
    void deleteComment(@PathVariable("id") Long id) {
        commentService.deleteComment(id);
    }

    @GetMapping("/pet/{petId}")
    List<Comment> findByPetId(@PathVariable("petId") Long petId) {
        return commentService.findByPetId(petId);
    }
}
