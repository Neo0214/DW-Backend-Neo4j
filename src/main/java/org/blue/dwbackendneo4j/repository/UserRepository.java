package org.blue.dwbackendneo4j.repository;


import org.blue.dwbackendneo4j.entity.User;
import org.springframework.data.neo4j.repository.Neo4jRepository;
import org.springframework.data.neo4j.repository.query.Query;
import org.springframework.stereotype.Repository;

import java.util.HashMap;

/*
 * @author Neo0214
 */
@Repository
public interface UserRepository extends Neo4jRepository<User, Integer> {
    @Query("MATCH (n:User) RETURN n")
    public HashMap<String, Object> getUser();
}
