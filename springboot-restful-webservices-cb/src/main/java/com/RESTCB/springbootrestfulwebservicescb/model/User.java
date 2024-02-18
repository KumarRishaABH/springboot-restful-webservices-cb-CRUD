package com.RESTCB.springbootrestfulwebservicescb.model;

import jakarta.annotation.Generated;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import org.springframework.data.annotation.Id;
import org.springframework.data.couchbase.core.mapping.Document;
import org.springframework.data.couchbase.core.mapping.id.GeneratedValue;

import static org.springframework.data.couchbase.core.mapping.id.GenerationStrategy.UNIQUE;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Document
public class User {
    @Id @GeneratedValue(strategy = UNIQUE)
    private String id;
    private String firstName;
    private String lastName;
    private String email;
}
