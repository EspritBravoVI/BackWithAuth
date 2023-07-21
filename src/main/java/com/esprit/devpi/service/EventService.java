package com.esprit.devpi.service;




import com.esprit.devpi.entities.Event;

import java.util.List;

public interface EventService {
    Event saveEvent(Event event);
    Event getEventById(Long id);
    List<Event> getAllEvents();
    void deleteEvent(Long id);
}




