package com.hibernate.demo.projection.repository;

import com.hibernate.demo.projection.model.Post;
import com.hibernate.demo.projection.model.projection.PostView;
import com.hibernate.demo.projection.model.projection.PostWithoutRelation;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PostRepository extends JpaRepository<Post,Long> {

    List<PostWithoutRelation> findByIsReadEquals(String s);

    List<PostView> findByIsReadIs(String s);

}
