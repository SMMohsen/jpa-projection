package com.hibernate.demo.projection.repository;

import com.fasterxml.jackson.core.type.TypeReference;
import com.hibernate.demo.projection.model.PostWithoutReplies;
import org.springframework.data.jpa.repository.JpaRepository;

public interface PostWithoutRepliesRepository extends JpaRepository<PostWithoutReplies,Long> {

    //dynamic projection
    <T> T findByIdIs(Long id, Class<T> type);

}
