package com.harsh.joblisting.repo;

import com.harsh.joblisting.model.Post;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface PostRepo extends MongoRepository<Post, String> {
}
