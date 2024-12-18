package org.blue.dwbackendneo4j.entity;


import lombok.Data;
import org.springframework.data.neo4j.core.schema.Id;
import org.springframework.data.neo4j.core.schema.Node;

/*
 * @author Neo0214
 */
@Node
@Data
public class User {
    private String email;
    private String name;
    @Id
    private Integer id;
}
