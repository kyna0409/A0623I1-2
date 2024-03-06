package com.example.e2_upload_songs.model;

import org.springframework.web.multipart.MultipartFile;

public class UploadForm {
    private int id;

    private String name;

    private String actor;
    private String genre;

    private MultipartFile link;

    public UploadForm() {
    }

    public UploadForm(int id, String name, String actor, String genre, MultipartFile link) {
        this.id = id;
        this.name = name;
        this.actor = actor;
        this.genre = genre;
        this.link = link;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getActor() {
        return actor;
    }

    public void setActor(String actor) {
        this.actor = actor;
    }

    public String getGenre() {
        return genre;
    }

    public void setGenre(String genre) {
        this.genre = genre;
    }

    public MultipartFile getLink() {
        return link;
    }

    public void setLink(MultipartFile link) {
        this.link = link;
    }
}
