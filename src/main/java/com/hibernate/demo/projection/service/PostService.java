package com.hibernate.demo.projection.service;

import com.fasterxml.jackson.core.type.TypeReference;
import com.hibernate.demo.projection.model.Post;
import com.hibernate.demo.projection.model.PostWithoutReplies;
import com.hibernate.demo.projection.model.projection.PostDTO;
import com.hibernate.demo.projection.model.projection.PostView;
import com.hibernate.demo.projection.model.projection.PostWithoutRelation;
import com.hibernate.demo.projection.repository.PostRepository;
import com.hibernate.demo.projection.repository.PostWithoutRepliesRepository;
import org.hibernate.criterion.Example;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class PostService {

    @Autowired
    private PostRepository postRepository;

    @Autowired
    private PostWithoutRepliesRepository postWithoutRepliesRepository;

    public List<PostWithoutRelation> getAll() {

        return postRepository.findByIsReadEquals("T");
    }

    public Post getById(Long id) {

        return postRepository.findById(id).get();
    }

    public List<PostWithoutReplies> getAllWithoutReplies() {

        return postWithoutRepliesRepository.findAll();
    }

    public List<PostView> getPostView() {

        return postRepository.findByIsReadIs("T");
    }

    public PostDTO getDTO(Long id) {


        return postWithoutRepliesRepository.findByIdIs(id, PostDTO.class);
    }
}
