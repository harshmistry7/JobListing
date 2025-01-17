package com.harsh.joblisting.model;

import com.fasterxml.jackson.annotation.JsonIgnore;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JobPost")
public class Post {

    private String profile;
    private String desc;
    private int exp;
    @JsonIgnore
    private String tech[];
}
