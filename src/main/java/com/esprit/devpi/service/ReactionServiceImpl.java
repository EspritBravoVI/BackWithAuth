package com.esprit.devpi.service;


import com.esprit.devpi.DAO.ReactionRepository;
import com.esprit.devpi.entities.Reaction;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ReactionServiceImpl implements ReactionService {

    private final ReactionRepository reactionRepository;

    @Autowired
    public ReactionServiceImpl(ReactionRepository reactionRepository) {
        this.reactionRepository = reactionRepository;
    }

    @Override
    public Reaction saveReaction(Reaction reaction) {
        return reactionRepository.save(reaction);
    }

    @Override
    public Reaction getReactionById(Long id) {
        return reactionRepository.findById(id).orElse(null);
    }

    @Override
    public List<Reaction> getAllReactions() {
        return reactionRepository.findAll();
    }

    @Override
    public void deleteReaction(Long id) {
        reactionRepository.deleteById(id);
    }
}
