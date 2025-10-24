package com.PetAdoption.API.service;

import com.PetAdoption.API.dao.Comment;
import com.PetAdoption.API.dao.CommentRepository;
import com.PetAdoption.API.dao.Pet;
import jakarta.transaction.Transactional;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
@Transactional
public class CommentService {

    @Autowired
    private CommentRepository commentRepository;

    public Comment createComment(Comment comment){
        return commentRepository.save(comment);
    }

    public Comment updateComment(Comment comment){
        return commentRepository.save(comment);
    }

    public List<Comment> getAllComments(){
        return commentRepository.findAll();
    }

    public Optional<Comment> getCommentById(Long id){
        return commentRepository.findById(id);
    }

    public void deleteComment(Long id){
        commentRepository.deleteById(id);
    }

    public List<Comment> findByPetId(Long petId){
        return commentRepository.findByPetId(petId);
    }
}
