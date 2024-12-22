package org.blue.dwbackendneo4j.repository;


import org.blue.dwbackendneo4j.dto.MoviesDTO;
import org.blue.dwbackendneo4j.entity.Movie;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;
import java.util.Map;

/*
 * @author Neo0214
 */
@Repository
public interface MovieRepository extends Neo4jRepository<Movie,Integer> {
    @Query("MATCH (m:Movie) " +
            "WHERE m.score >= toFloat($score) " +
            "RETURN COUNT(m) AS movieCount")
    Integer getMovieByScore(float score);

    @Query("MATCH (m:Movie) " +
            "WHERE m.year = $year AND m.month = $month " +
            "RETURN COUNT(m) AS movieCount")
    Integer getMovieByYearAndMonth(int year, int month);

    @Query("MATCH (m:Movie) " +
            "WHERE m.year = $year AND (m.month = $month1 or m.month = $month2 or m.month = $month3) " +
            "RETURN COUNT(m) AS movieCount")
    Integer getMovieByYearAndScore(int year, int month1, int month2, int month3);

    @Query("MATCH (m:Movie) " +
            "WHERE m.year >= $startYear AND m.year <= $endYear AND " +
            "m.month >= $startMonth AND m.month <= $endMonth AND " +
            "m.day >= $startDay AND m.day <= $endDay " +
            "RETURN COUNT(m) AS movieCount")
    Integer getMovieByYearMonthDay(int startYear, int endYear, int startMonth, int endMonth, int startDay, int endDay);

    @Query("MATCH (m:Movie) " +
            "WHERE m.title = $movieName " +
            "RETURN COUNT(m) AS movieCount")
    Integer getMovieByName(String movieName);

    @Query("MATCH (m:Movie) " +
            "WHERE m.type = $type " +
            "RETURN COUNT(m) AS movieCount")
    Integer getMovieByType(String type);
}
