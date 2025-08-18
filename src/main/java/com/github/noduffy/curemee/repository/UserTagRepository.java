package com.github.noduffy.curemee.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.github.noduffy.curemee.model.UserTag;
import com.github.noduffy.curemee.model.UserTagId;

@Repository
public interface UserTagRepository extends JpaRepository<UserTag, UserTagId> {
}