package org.blue.dwbackendneo4j.controller;


import org.blue.dwbackendneo4j.service.CoopService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/*
 * @author Neo0214
 */
@RestController
@RequestMapping("/coop")
public class CoopController {
    @Autowired
    private CoopService coopService;

    @GetMapping("/da")
    public HashMap<String, Object> getCoopMovie(){
        return coopService.getCoopMovie();
    }

    @GetMapping("/aa")
    public HashMap<String, Object> getCoopActor(){
        return coopService.getCoopActor();
    }
}
