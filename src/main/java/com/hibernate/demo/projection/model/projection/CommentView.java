package com.hibernate.demo.projection.model.projection;

import java.time.LocalDate;

public interface CommentView {

    String getContent();
    LocalDate getCreatedAt();
}
