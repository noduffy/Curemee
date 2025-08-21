package com.github.noduffy.curemee.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "article_tags")
public class ArticleTag {

    @EmbeddedId
    private ArticleTagId id;

    // GetterとSetterメソッド
    public ArticleTagId getId() {
        return id;
    }

    public void setId(ArticleTagId id) {
        this.id = id;
    }
}