package com.codeclan.example.filemanager.components;

import com.codeclan.example.filemanager.models.File;
import com.codeclan.example.filemanager.models.Folder;
import com.codeclan.example.filemanager.models.User;
import com.codeclan.example.filemanager.repositories.FileRepository;
import com.codeclan.example.filemanager.repositories.FolderRepository;
import com.codeclan.example.filemanager.repositories.UserRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.stereotype.Component;

@Component
public class DataLoader implements ApplicationRunner {
    @Autowired
    FileRepository fileRepository;
    @Autowired
    FolderRepository folderRepository;
    @Autowired
    UserRepository userRepository;

    public DataLoader() {}

    public void run(ApplicationArguments args) {
        User ewan = new User("Ewan");
        userRepository.save(ewan);
        User shufan = new User("Shufan");
        userRepository.save(shufan);
        Folder pics = new Folder("Pics", ewan);
        folderRepository.save(pics);
        ewan.addFolder(pics);
        userRepository.save(ewan);
        File party1 = new File("Party1", "jpeg", 128 ,pics);
        fileRepository.save(party1);
        File party1edit = new File("Party1edit", "PSD", 350, pics);
        fileRepository.save(party1edit);



    }
}
