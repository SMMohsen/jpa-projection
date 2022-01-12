package com.hibernate.demo.projection.model.projection;

import java.time.LocalDate;
import java.util.Objects;

public class PostDTO {

    private Long id;

    private String content;


    // constructor is mandatory not providing it will cause  runtime exception
    public PostDTO(Long id, String content) {
        this.id = id;
        this.content = content;
    }

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

    @Override
    public int hashCode() {
        return Objects.hashCode(id);
    }

    @Override
    public boolean equals(Object obj) {

        if(!(obj instanceof PostDTO))
            return false;

        PostDTO other = (PostDTO) obj;

        return this.id.equals(other.getId());
    }
}
