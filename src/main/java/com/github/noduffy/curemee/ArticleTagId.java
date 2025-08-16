package com.github.noduffy.curemee;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class ArticleTagId implements Serializable {

    private Integer articleId;
    private Integer tagId;

    // equals() と hashCode() メソッド
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        ArticleTagId that = (ArticleTagId) o;
        return Objects.equals(articleId, that.articleId) && Objects.equals(tagId, that.tagId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(articleId, tagId);
    }
}