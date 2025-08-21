package com.github.noduffy.curemee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.noduffy.curemee.model.Article;

@Repository
public interface ArticleRepository extends JpaRepository<Article, Integer> {
    Article findByUrl(String url);
}