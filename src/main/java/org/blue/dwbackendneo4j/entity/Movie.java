package org.blue.dwbackendneo4j.entity;


import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;
import org.springframework.stereotype.Repository;

/*
 * @author Neo0214
 */
@Node
@Data
public class Movie {
    @Id
    private Integer movie_id;
    private String title;
    private Integer runtime;
    private Integer comment_number;
    private String type;
    private Float score;
    private Integer year;
    private Integer month;
    private Integer day;
}
