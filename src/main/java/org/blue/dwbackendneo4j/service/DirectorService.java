package org.blue.dwbackendneo4j.service;


import org.blue.dwbackendneo4j.dto.MoviesDTO;
import org.blue.dwbackendneo4j.repository.DirectorRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.HashMap;
import java.util.List;

/*
 * @author Neo0214
 */
@Service
public class DirectorService {
    @Autowired
    private DirectorRepository directorRepository;

    public HashMap<String, Object> getDirMovie(String directorName){
        HashMap<String, Object> map = new HashMap<>();
        // 获取当前时间
        long startTime = System.currentTimeMillis();
        int queryResult = directorRepository.getDirectorMovies(directorName);
        // 获取结束时间
        long endTime = System.currentTimeMillis();

        double totalTime = (endTime - startTime);
        map.put("t_time", totalTime);
        return map;
    }
}
