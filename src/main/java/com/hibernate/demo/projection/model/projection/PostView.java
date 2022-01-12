package com.hibernate.demo.projection.model.projection;

import java.util.List;

public interface PostView {

    Long getId();
    String getContent();
    List<CommentView> getComments();
}
