package com.esprit.devpi.service;




import com.esprit.devpi.entities.CustomUser;

import java.util.List;

public interface CustomUserService {
    CustomUser saveCustomUser(CustomUser customUser);
    CustomUser getCustomUserById(Long id);
    List<CustomUser> getAllCustomUsers();
    void deleteCustomUser(Long id);
}




