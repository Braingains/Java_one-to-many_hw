package com.codeclan.example.filemanager.repositories;

import com.codeclan.example.filemanager.models.File;
import com.codeclan.example.filemanager.models.User;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface UserRepository extends JpaRepository<User, Long> {
}
