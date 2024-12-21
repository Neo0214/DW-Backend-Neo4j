package org.blue.dwbackendneo4j.controller;


import org.blue.dwbackendneo4j.service.MovieService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import java.util.HashMap;

/*
 * @author Neo0214
 */
@RestController
@RequestMapping("/movie")
public class MovieController {
    @Autowired
    private MovieService movieService;

    @GetMapping("/byname")
    public HashMap<String, Object> getMovieByName(@Param("movieName") String movieName){
        return movieService.getMovieByName(movieName);
    }

    @GetMapping("/score")
    public HashMap<String, Object> getMovieByScore(@RequestParam("value") Float score){
        return movieService.getMovieByScore(score);
    }

    @GetMapping("/ym")
    public HashMap<String, Object> getMovieByYearAndMonth(@RequestParam("year") Integer year, @RequestParam("month") Integer month){
        return movieService.getMovieByYearAndMonth(year, month);
    }

    @GetMapping("/ys")
    public HashMap<String, Object> getMovieByYearAndScore(@RequestParam("year") Integer year, @RequestParam("season") Integer season){
        return movieService.getMovieByYearAndScore(year, season);
    }

    @GetMapping("/ymd")
    public HashMap<String, Object> getMovieByYearMonthDay(@RequestParam("startYear") Integer y1, @RequestParam("endYear") Integer y2, @RequestParam("startMonth") Integer m1,
                                                          @RequestParam("endMonth") Integer m2, @RequestParam("startDay") Integer d1, @RequestParam("endDay") Integer d2){
        return movieService.getMovieByYearMonthDay(y1, y2, m1, m2, d1, d2);
    }

}
