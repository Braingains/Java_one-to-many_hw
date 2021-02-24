package com.codeclan.example.filemanager;

import com.codeclan.example.filemanager.models.File;
import com.codeclan.example.filemanager.models.Folder;
import com.codeclan.example.filemanager.models.User;
import com.codeclan.example.filemanager.repositories.FileRepository;
import com.codeclan.example.filemanager.repositories.FolderRepository;
import com.codeclan.example.filemanager.repositories.UserRepository;
import org.junit.jupiter.api.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.autoconfigure.jdbc.AutoConfigureTestDatabase;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@AutoConfigureTestDatabase
@SpringBootTest
class FilemanagerApplicationTests {

	@Autowired
	FileRepository fileRepository;

	@Autowired
	FolderRepository folderRepository;

	@Autowired
	UserRepository userRepository;

	@Test
	void contextLoads() {
	}

	@Test
	public void createUser() {
		User user = new User("Ewan");
		userRepository.save(user);
	}

}
