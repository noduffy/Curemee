package com.github.noduffy.curemee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.noduffy.curemee.model.ArticleTag;
import com.github.noduffy.curemee.model.ArticleTagId;

@Repository
public interface ArticleTagRepository extends JpaRepository<ArticleTag, ArticleTagId> {
}