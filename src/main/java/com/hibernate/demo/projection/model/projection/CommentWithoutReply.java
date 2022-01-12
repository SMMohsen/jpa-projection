package com.hibernate.demo.projection.model.projection;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.hibernate.demo.projection.model.Post;

import javax.persistence.*;
import java.time.LocalDate;

@Entity
@Table(name = "post_comment")
public class CommentWithoutReply {

    @Id
    private Long id;

    @Column(name = "content")
    private String content;

    @Column(name = "created_at")
    private LocalDate createdAt;

    @ManyToOne
    @JsonBackReference
    private Post post;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

    public LocalDate getCreatedAt() {
        return createdAt;
    }

    public void setCreatedAt(LocalDate createdAt) {
        this.createdAt = createdAt;
    }

    public Post getPost() {
        return post;
    }

    public void setPost(Post post) {
        this.post = post;
    }
}
