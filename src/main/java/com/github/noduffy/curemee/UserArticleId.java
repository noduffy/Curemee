package com.github.noduffy.curemee;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserArticleId implements Serializable {

    private Integer userId;
    private Integer articleId;

    // equals() と hashCode() メソッド
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserArticleId that = (UserArticleId) o;
        return Objects.equals(userId, that.userId) && Objects.equals(articleId, that.articleId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, articleId);
    }
}