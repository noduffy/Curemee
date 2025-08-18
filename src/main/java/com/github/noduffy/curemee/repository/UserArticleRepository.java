package com.github.noduffy.curemee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.noduffy.curemee.model.UserArticle;
import com.github.noduffy.curemee.model.UserArticleId;

@Repository
public interface UserArticleRepository extends JpaRepository<UserArticle, UserArticleId> {
}