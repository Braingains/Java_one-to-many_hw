package com.codeclan.example.filemanager.models;

import com.fasterxml.jackson.annotation.JsonIgnoreProperties;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Entity
@Table(name = "folders")
public class Folder {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "title")
    private String title;

    @ManyToOne
    @JoinColumn(name = "user_id", nullable = false) //many folders have one user
    private User user;

    @JsonIgnoreProperties({"folder"})
    @OneToMany(mappedBy = "folder") //reference where I am, one folder has many files
    private List<File> files;

    public Folder(String title, User user) {
        this.title = title;
        this.user = user;
        this.files = new ArrayList<File>();
    }

    public Folder() {}



    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public List<File> getFiles() {
        return files;
    }

    public void setFiles(List<File> files) {
        this.files = files;
    }

    public User getUser() {
        return user;
    }

    public void setUser(User user) {
        this.user = user;
    }

    public void addFile(File file) {
        this.files.add(file);
    }
}
