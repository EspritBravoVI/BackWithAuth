package com.esprit.devpi.service;




import com.esprit.devpi.entities.Command;

import java.util.List;

public interface CommandService {
    Command saveCommand(Command command);
    Command getCommandById(Long id);
    List<Command> getAllCommands();
    void deleteCommand(Long id);
}



