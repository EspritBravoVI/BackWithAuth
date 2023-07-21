package com.esprit.devpi.service;



import com.esprit.devpi.DAO.CustomUserRepository;
import com.esprit.devpi.entities.CustomUser;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomUserServiceImpl implements CustomUserService {

    private final CustomUserRepository customUserRepository;

    @Autowired
    public CustomUserServiceImpl(CustomUserRepository customUserRepository) {
        this.customUserRepository = customUserRepository;
    }

    @Override
    public CustomUser saveCustomUser(CustomUser customUser) {
        return customUserRepository.save(customUser);
    }

    @Override
    public CustomUser getCustomUserById(Long id) {
        return customUserRepository.findById(id).orElse(null);
    }

    @Override
    public List<CustomUser> getAllCustomUsers() {
        return customUserRepository.findAll();
    }

    @Override
    public void deleteCustomUser(Long id) {
        customUserRepository.deleteById(id);
    }
}

