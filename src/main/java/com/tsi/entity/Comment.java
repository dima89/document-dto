package com.tsi.entity;

import java.util.UUID;

public class Comment {

    UUID id;
    UUID userId;
    String content;

    public Comment() {
    }

    public Comment(String content) {
        this.content = content;
    }

    public Comment(UUID id, UUID userId, String content) {
        this.id = id;
        this.userId = userId;
        this.content = content;
    }

    public UUID getId() {
        return id;
    }

    public void setId(UUID id) {
        this.id = id;
    }

    public UUID getUserId() {
        return userId;
    }

    public void setUserId(UUID userId) {
        this.userId = userId;
    }

    public String getContent() {
        return content;
    }

    public void setContent(String content) {
        this.content = content;
    }

}
