package org.blue.dwbackendneo4j.repository;


import org.blue.dwbackendneo4j.entity.Actor;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

/*
 * @author Neo0214
 */
@Repository
public interface CoopRepository extends Neo4jRepository<Actor,Integer> {
    @Query("MATCH (a:Actor)-[:ACTED_IN]->(m:Movie)<-[:DIRECT_IN]-(d:Director) " +
    "WHERE a.actor_name <> 'Various' AND d.director_name <> 'Various' " +
    "WITH a, d, COUNT(m) AS collaboration_count " +
    "ORDER BY collaboration_count DESC " +
    "LIMIT 1 " +
    "RETURN collaboration_count")
    Integer getCoopMovie();

    @Query("MATCH (a:Actor)-[:ACTED_IN]->(m:Movie)<-[:ACTED_IN]-(a2:Actor) " +
    "WHERE a.actor_name <> 'Various' AND a2.actor_name <> 'Various' " +
    "WITH a, a2, COUNT(m) AS collaboration_count " +
    "ORDER BY collaboration_count DESC " +
    "LIMIT 1 " +
    "RETURN collaboration_count")
    Integer getCoopActorMovie();
}
