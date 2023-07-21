package com.esprit.devpi.service;


import com.esprit.devpi.DAO.CommandRepository;
import com.esprit.devpi.entities.Command;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CommandServiceImpl implements CommandService {

    private final CommandRepository commandRepository;

    @Autowired
    public CommandServiceImpl(CommandRepository commandRepository) {
        this.commandRepository = commandRepository;
    }

    @Override
    public Command saveCommand(Command command) {
        return commandRepository.save(command);
    }

    @Override
    public Command getCommandById(Long id) {
        return commandRepository.findById(id).orElse(null);
    }

    @Override
    public List<Command> getAllCommands() {
        return commandRepository.findAll();
    }

    @Override
    public void deleteCommand(Long id) {
        commandRepository.deleteById(id);
    }
}
