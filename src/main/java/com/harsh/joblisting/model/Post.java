package com.harsh.joblisting.model;

import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "JobPost")
public class Post {

    private String profile;
    private String desc;
    private int exp;
    private String tech[];
}
