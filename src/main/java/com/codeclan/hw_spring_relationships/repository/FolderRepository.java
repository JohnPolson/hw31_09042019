package com.codeclan.hw_spring_relationships.repository;

import com.codeclan.hw_spring_relationships.models.Folder;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FolderRepository extends JpaRepository<Folder, Long> {
}
