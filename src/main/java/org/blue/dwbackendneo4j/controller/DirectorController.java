package org.blue.dwbackendneo4j.controller;


import org.blue.dwbackendneo4j.service.DirectorService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;
import java.util.List;

/*
 * @author Neo0214
 */
@RestController
@RequestMapping("/director")
public class DirectorController {
    @Autowired
    private DirectorService directorService;

    @GetMapping("/dirmovie")
    public HashMap<String,Object> getDirMovie(@Param("directorName") String directorName){
        return directorService.getDirMovie(directorName);
    }
}
