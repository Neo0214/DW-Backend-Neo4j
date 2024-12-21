package org.blue.dwbackendneo4j.repository;

import org.blue.dwbackendneo4j.dto.MoviesDTO;
import org.blue.dwbackendneo4j.entity.Director;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

/*
 * @author Neo0214
 */
@Repository
public interface DirectorRepository extends Neo4jRepository<Director, Integer> {
    @Query("MATCH (d:Director)-[:DIRECTED_IN]->(m:Movie) " +
            "WHERE d.director_name = $directorName " +
            "RETURN COUNT(m) AS movieCount")
    Integer getDirectorMovies(String directorName);

}
