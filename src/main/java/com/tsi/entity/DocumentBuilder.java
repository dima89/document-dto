package com.tsi.entity;

import java.util.*;

public class DocumentBuilder {

    Document document;

    public DocumentBuilder() {
        document = new Document();
        Map<String, String> indexMap = new HashMap<String, String>();
        document.setIndexMap(indexMap);
        document.setComments(new ArrayList<Comment>());
    }

    public DocumentBuilder setId(UUID id) {
        document.id = id;
        return this;
    }

    public DocumentBuilder setName(String name) {
        document.name = name;
        return this;
    }

    public DocumentBuilder setTitle(String title) {
        document.title = title;
        return this;
    }

    public DocumentBuilder setIndexMap(final String indexName, final String indexValue) {
        document.getIndexMap().put(indexName, indexValue);
        return this;
    }

    public DocumentBuilder setContent(String content) {
        document.content = content;
        return this;
    }

    public DocumentBuilder setComments(List<Comment> comments) {
        document.getComments().addAll(comments);
        return this;
    }

    public DocumentBuilder addComment(Comment comment) {
        document.getComments().add(comment);
        return this;
    }

    public Document build() {
        return document;
    }
}
