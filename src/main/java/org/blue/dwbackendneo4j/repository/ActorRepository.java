package org.blue.dwbackendneo4j.repository;


import org.blue.dwbackendneo4j.dto.MoviesDTO;
import org.blue.dwbackendneo4j.entity.Actor;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * @author Neo0214
 */
@Repository
public interface ActorRepository extends Neo4jRepository<Actor,Integer> {
    @Query("MATCH (a:Actor)-[r:ACTED_IN]->(m:Movie) " +
            "WHERE a.actor_name = $actorName and r.role=1 " +
            "RETURN m.title AS movieTitle, m.year AS releaseYear, m.score AS score")
    List<MoviesDTO> getStarMovie(String actorName);

    @Query("MATCH (a:Actor)-[r:ACTED_IN]->(m:Movie) " +
            "WHERE a.actor_name = $actorName and r.role=0 " +
            "RETURN m.title AS movieTitle, m.year AS releaseYear, m.score AS score")
    List<MoviesDTO> getActMovie(String actorName);

    @Query("MATCH (a:Actor)-[r:ACTED_IN]->(m:Movie) " +
            "WHERE a.actor_name = $actorName " +
            "RETURN m.title AS movieTitle, m.year AS releaseYear, m.score AS score")
    List<MoviesDTO> getInMovie(String actorName);
}
