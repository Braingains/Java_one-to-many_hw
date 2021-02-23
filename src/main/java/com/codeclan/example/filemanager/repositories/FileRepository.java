package com.codeclan.example.filemanager.repositories;

import com.codeclan.example.filemanager.models.File;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FileRepository extends JpaRepository<File, Long> {
}
