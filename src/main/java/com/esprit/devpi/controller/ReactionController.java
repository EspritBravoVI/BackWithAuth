package com.esprit.devpi.controller;


import com.esprit.devpi.entities.Reaction;
import com.esprit.devpi.service.ReactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/reactions")
public class ReactionController {

    private final ReactionService reactionService;

    @Autowired
    public ReactionController(ReactionService reactionService) {
        this.reactionService = reactionService;
    }

    @PostMapping
    public ResponseEntity<Reaction> createReaction(@RequestBody Reaction reaction) {
        Reaction createdReaction = reactionService.saveReaction(reaction);
        return new ResponseEntity<>(createdReaction, HttpStatus.CREATED);
    }

    @GetMapping("/{id}")
    public ResponseEntity<Reaction> getReactionById(@PathVariable Long id) {
        Reaction reaction = reactionService.getReactionById(id);
        if (reaction != null) {
            return new ResponseEntity<>(reaction, HttpStatus.OK);
        } else {
            return new ResponseEntity<>(HttpStatus.NOT_FOUND);
        }
    }

    @GetMapping
    public ResponseEntity<List<Reaction>> getAllReactions() {
        List<Reaction> reactions = reactionService.getAllReactions();
        return new ResponseEntity<>(reactions, HttpStatus.OK);
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deleteReaction(@PathVariable Long id) {
        reactionService.deleteReaction(id);
        return new ResponseEntity<>(HttpStatus.NO_CONTENT);
    }
}
