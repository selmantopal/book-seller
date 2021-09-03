package com.sha.springbootbookseller.service;

import com.sha.springbootbookseller.model.User;
import org.springframework.transaction.annotation.Transactional;

import java.util.Optional;

public interface IUserService {

    User saveUser(User user);

    Optional<User> findByUsername(String username);

    @Transactional
        //Bir silme veya güncelleme işlemi yürütülürken @Transactional zorunludur.
    void makeAdmin(String username);
}
