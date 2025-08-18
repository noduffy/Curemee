package com.github.noduffy.curemee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.noduffy.curemee.model.Tag;

@Repository
public interface TagRepository extends JpaRepository<Tag, Integer> {
    Tag findByName(String name);
}