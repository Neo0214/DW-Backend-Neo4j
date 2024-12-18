package org.blue.dwbackendneo4j.service;


import org.blue.dwbackendneo4j.repository.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.Objects;

/*
 * @author Neo0214
 */
@Service
public class UserService {
    @Autowired
    private UserRepository userRepository;

    public HashMap<String, Object> getUser() {
        return userRepository.getUser();
    }
}
