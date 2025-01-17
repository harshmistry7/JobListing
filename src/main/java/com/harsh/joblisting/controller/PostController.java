package com.harsh.joblisting.controller;

import com.harsh.joblisting.model.Post;
import com.harsh.joblisting.repo.PostRepo;
import jakarta.servlet.http.HttpServletResponse;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.io.IOException;
import java.util.List;

@RestController
public class PostController {

    @Autowired
    PostRepo repo;

    @GetMapping("/")
    public void redirect(HttpServletResponse response) throws IOException {
        response.sendRedirect("/swagger-ui.html");
    }

    @GetMapping("/posts")
    public List<Post> getAllPosts() throws IOException {
        System.out.println(repo.findAll());
        return repo.findAll();
    }
}
