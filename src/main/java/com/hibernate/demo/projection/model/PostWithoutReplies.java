package com.hibernate.demo.projection.model;

import com.fasterxml.jackson.annotation.JsonManagedReference;
import com.hibernate.demo.projection.model.projection.CommentWithoutReply;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;

@Entity
@Table(name = "post")
public class PostWithoutReplies {

    @Id
    private Long id;

    @Column(name = "content")
    private String content;

    @Column(name = "is_read")
    private String isRead;

    @JsonManagedReference
    @OneToMany(mappedBy = "post" , fetch = FetchType.LAZY)
    List<CommentWithoutReply> comments;

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

    public String getIsRead() {
        return isRead;
    }

    public void setIsRead(String isRead) {
        this.isRead = isRead;
    }

    public List<CommentWithoutReply> getComments() {
        return comments;
    }

    public void setComments(List<CommentWithoutReply> comments) {
        this.comments = comments;
    }
}
