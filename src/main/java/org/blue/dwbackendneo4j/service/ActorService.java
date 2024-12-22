package org.blue.dwbackendneo4j.service;


import org.blue.dwbackendneo4j.dto.MoviesDTO;
import org.blue.dwbackendneo4j.entity.Actor;
import org.blue.dwbackendneo4j.repository.ActorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/*
 * @author Neo0214
 */
@Service
public class ActorService {
    @Autowired
    private ActorRepository actorRepository;

    public HashMap<String, Object> getStarMovie(String actorName){
        HashMap<String, Object> map = new HashMap<>();
        // 获取当前时间
        long startTime = System.currentTimeMillis();
        List<MoviesDTO> queryResult = actorRepository.getStarMovie(actorName);
        // 获取结束时间
        long endTime = System.currentTimeMillis();
        // 计算查询时间，单位换成秒
        double totalTime = (endTime - startTime);
        map.put("t_time", totalTime);
        return map;
    }

    public HashMap<String, Object> getActMovie(String actorName){
        HashMap<String, Object> map = new HashMap<>();
        // 获取当前时间
        long startTime = System.currentTimeMillis();
        List<MoviesDTO> queryResult = actorRepository.getActMovie(actorName);
        // 获取结束时间
        long endTime = System.currentTimeMillis();
        // 计算查询时间，单位换成秒
        double totalTime = (endTime - startTime);
        map.put("t_time", totalTime);
        return map;
    }

    public HashMap<String, Object> getInMovie(String actorName){
        HashMap<String, Object> map = new HashMap<>();
        // 获取当前时间
        long startTime = System.currentTimeMillis();
        List<MoviesDTO> queryResult = actorRepository.getInMovie(actorName);
        // 获取结束时间
        long endTime = System.currentTimeMillis();
        // 计算查询时间，单位换成秒
        double totalTime = (endTime - startTime);
        map.put("t_time", totalTime);
        return map;
    }
}
