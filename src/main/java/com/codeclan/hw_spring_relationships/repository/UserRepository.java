package com.codeclan.hw_spring_relationships.repository;

import com.codeclan.hw_spring_relationships.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
