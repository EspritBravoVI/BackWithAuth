package com.esprit.devpi.service;


import com.esprit.devpi.entities.Reaction;

import java.util.List;

public interface ReactionService {
    Reaction saveReaction(Reaction reaction);
    Reaction getReactionById(Long id);
    List<Reaction> getAllReactions();
    void deleteReaction(Long id);
}




