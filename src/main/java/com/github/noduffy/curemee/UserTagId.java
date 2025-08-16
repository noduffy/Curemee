package com.github.noduffy.curemee;

import jakarta.persistence.Embeddable;
import java.io.Serializable;
import java.util.Objects;

@Embeddable
public class UserTagId implements Serializable {

    private Integer userId;
    private Integer tagId;

    // equals() と hashCode() メソッド
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        UserTagId that = (UserTagId) o;
        return Objects.equals(userId, that.userId) && Objects.equals(tagId, that.tagId);
    }

    @Override
    public int hashCode() {
        return Objects.hash(userId, tagId);
    }
}