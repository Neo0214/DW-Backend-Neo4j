package org.blue.dwbackendneo4j.service;


import org.blue.dwbackendneo4j.dto.MoviesDTO;
import org.blue.dwbackendneo4j.repository.MovieRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
 * @author Neo0214
 */
@Service
public class MovieService {
    @Autowired
    private MovieRepository movieRepository;

    public HashMap<String, Object> getMovieByName(String movieName){
        HashMap<String, Object> map = new HashMap<>();
        // 获取当前时间
        long startTime = System.currentTimeMillis();
        int queryResult = movieRepository.getMovieByName(movieName);
        // 获取结束时间
        long endTime = System.currentTimeMillis();
        // 计算查询时间，单位换成秒
        double totalTime = (endTime - startTime);
        map.put("t_time", totalTime);
        return map;
    }

    public HashMap<String, Object> getMovieByScore(Float score){
        HashMap<String, Object> map = new HashMap<>();
        // 获取当前时间
        long startTime = System.currentTimeMillis();
        int queryResult = movieRepository.getMovieByScore(score);
        // 获取结束时间
        long endTime = System.currentTimeMillis();
        // 计算查询时间，单位换成秒
        double totalTime = (endTime - startTime);
        map.put("t_time", totalTime);

        return map;
    }

    public HashMap<String, Object> getMovieByYearAndMonth(Integer year, Integer month){
        HashMap<String, Object> map = new HashMap<>();
        // 获取当前时间
        long startTime = System.currentTimeMillis();
        int queryResult = movieRepository.getMovieByYearAndMonth(year, month);
        // 获取结束时间
        long endTime = System.currentTimeMillis();
        // 计算查询时间，单位换成秒
        double totalTime = (endTime - startTime);
        map.put("t_time", totalTime);
        return map;
    }

    public HashMap<String, Object> getMovieByYearAndScore(Integer year, Integer season){
        HashMap<String, Object> map = new HashMap<>();
        // 获取当前时间
        long startTime = System.currentTimeMillis();
        int base=3*(season-1);
        int queryResult = movieRepository.getMovieByYearAndScore(year, base+1, base+2, base+3);
        // 获取结束时间
        long endTime = System.currentTimeMillis();
        // 计算查询时间，单位换成秒
        double totalTime = (endTime - startTime);
        map.put("t_time", totalTime);
        return map;
    }

    public HashMap<String, Object> getMovieByYearMonthDay(Integer y1, Integer y2, Integer m1, Integer m2, Integer d1, Integer d2){
        HashMap<String, Object> map = new HashMap<>();
        // 获取当前时间
        long startTime = System.currentTimeMillis();
        int queryResult = movieRepository.getMovieByYearMonthDay(y1, y2, m1, m2, d1, d2);
        // 获取结束时间
        long endTime = System.currentTimeMillis();
        // 计算查询时间，单位换成秒
        double totalTime = (endTime - startTime);
        map.put("t_time", totalTime);
        return map;
    }

    public HashMap<String, Object> getMovieByType(String type){
        HashMap<String, Object> map = new HashMap<>();
        // 获取当前时间
        long startTime = System.currentTimeMillis();
        int queryResult = movieRepository.getMovieByType(type);
        // 获取结束时间
        long endTime = System.currentTimeMillis();
        // 计算查询时间，单位换成秒
        double totalTime = (endTime - startTime);
        map.put("t_time", totalTime);
        return map;
    }
}
