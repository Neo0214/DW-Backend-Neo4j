package org.blue.dwbackendneo4j.controller;


import org.blue.dwbackendneo4j.service.ActorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/*
 * @author Neo0214
 */
@RestController
@RequestMapping("/actor")
public class ActorController {
    @Autowired
    private ActorService actorService;

    @GetMapping("/starmovie")
    public HashMap<String,Object> getStarMovie(String actorName){
        return actorService.getStarMovie(actorName);
    }

    @GetMapping("/actmovie")
    public HashMap<String,Object> getActMovie(String actorName){
        return actorService.getActMovie(actorName);
    }

    @GetMapping("/inmovie")
    public HashMap<String,Object> getInMovie(String actorName){
        return actorService.getInMovie(actorName);
    }


}
