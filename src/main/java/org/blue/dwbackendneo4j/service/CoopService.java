package org.blue.dwbackendneo4j.service;


import org.blue.dwbackendneo4j.repository.CoopRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;

/*
 * @author Neo0214
 */
@Service
public class CoopService {
    @Autowired
    private CoopRepository coopRepository;

    public HashMap<String, Object> getCoopMovie(){
        HashMap<String, Object> map = new HashMap<>();
        // 获取当前时间
        long startTime = System.currentTimeMillis();
        int queryResult = coopRepository.getCoopMovie();
        // 获取结束时间
        long endTime = System.currentTimeMillis();
        // 计算查询时间，单位换成秒
        double totalTime = (endTime - startTime);
        map.put("t_time", totalTime);
        return map;
    }

    public HashMap<String, Object> getCoopActor(){
        HashMap<String, Object> map = new HashMap<>();
        // 获取当前时间
        long startTime = System.currentTimeMillis();
        int queryResult = coopRepository.getCoopActorMovie();
        // 获取结束时间
        long endTime = System.currentTimeMillis();
        // 计算查询时间，单位换成秒
        double totalTime = (endTime - startTime);
        map.put("t_time", totalTime);
        return map;
    }

}
