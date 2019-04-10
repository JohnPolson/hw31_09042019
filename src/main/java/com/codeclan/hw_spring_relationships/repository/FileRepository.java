package com.codeclan.hw_spring_relationships.repository;


import com.codeclan.hw_spring_relationships.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
