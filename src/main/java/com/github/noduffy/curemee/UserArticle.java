package com.github.noduffy.curemee;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;
import java.time.LocalDateTime;

@Entity
@Table(name = "user_articles")
public class UserArticle {

    @EmbeddedId
    private UserArticleId id;

    private String comment;
    private LocalDateTime savedAt;

    // GetterとSetterメソッド
    public UserArticleId getId() {
        return id;
    }

    public void setId(UserArticleId id) {
        this.id = id;
    }

    public String getComment() {
        return comment;
    }

    public void setComment(String comment) {
        this.comment = comment;
    }

    public LocalDateTime getSavedAt() {
        return savedAt;
    }

    public void setSavedAt(LocalDateTime savedAt) {
        this.savedAt = savedAt;
    }
}