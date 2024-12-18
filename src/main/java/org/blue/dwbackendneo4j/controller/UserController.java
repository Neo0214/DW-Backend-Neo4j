package org.blue.dwbackendneo4j.controller;


import org.blue.dwbackendneo4j.service.UserService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/*
 * @author Neo0214
 */
@RestController
public class UserController {
    @Autowired
    private UserService userService;

    @GetMapping("/user")
    public HashMap<String, Object> getUser() {
        return userService.getUser();
    }
}
