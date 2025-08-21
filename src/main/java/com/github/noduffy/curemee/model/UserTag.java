package com.github.noduffy.curemee.model;

import jakarta.persistence.EmbeddedId;
import jakarta.persistence.Entity;
import jakarta.persistence.Table;

@Entity
@Table(name = "user_tags")
public class UserTag {

    @EmbeddedId
    private UserTagId id;

    private Boolean favorite;

    // GetterとSetterメソッド
    public UserTagId getId() {
        return id;
    }

    public void setId(UserTagId id) {
        this.id = id;
    }

    public Boolean getFavorite() {
        return favorite;
    }

    public void setFavorite(Boolean favorite) {
        this.favorite = favorite;
    }
}