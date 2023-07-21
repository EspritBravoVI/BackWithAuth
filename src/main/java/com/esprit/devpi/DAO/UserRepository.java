package com.esprit.devpi.DAO;


import java.util.Optional;

import com.esprit.devpi.entities.User;
import org.springframework.data.jpa.repository.JpaRepository;

public interface UserRepository extends JpaRepository<User, Integer> {

  Optional<User> findByEmail(String email);

}
