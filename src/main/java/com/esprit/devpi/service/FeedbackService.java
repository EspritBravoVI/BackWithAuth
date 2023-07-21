package com.esprit.devpi.service;



import com.esprit.devpi.entities.Feedback;

import java.util.List;

public interface FeedbackService {
    Feedback saveFeedback(Feedback feedback);
    Feedback getFeedbackById(Long id);
    List<Feedback> getAllFeedbacks();
    void deleteFeedback(Long id);
}




