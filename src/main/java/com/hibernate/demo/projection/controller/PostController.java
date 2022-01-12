package com.hibernate.demo.projection.controller;

import com.hibernate.demo.projection.model.Post;
import com.hibernate.demo.projection.model.PostWithoutReplies;
import com.hibernate.demo.projection.model.projection.PostDTO;
import com.hibernate.demo.projection.model.projection.PostView;
import com.hibernate.demo.projection.model.projection.PostWithoutRelation;
import com.hibernate.demo.projection.service.PostService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
@RequestMapping("/posts")
public class PostController {

    @Autowired
    private PostService postService;

    @GetMapping
    public List<PostWithoutRelation> getAll() {

        return postService.getAll();
    }

    @GetMapping("/no-replies")
    public List<PostWithoutReplies> getAllWithoutReplies() {

        return postService.getAllWithoutReplies();
    }

    @GetMapping("/post-view")
    public List<PostView> getPostView() {

        return postService.getPostView();
    }

    @GetMapping("/dto/{id}")
    public PostDTO getDTO(@PathVariable Long id) {

        return postService.getDTO(id);
    }

    @GetMapping("/{id}")
    public Post getById(@PathVariable Long id){

        return postService.getById(id);
    }
}
