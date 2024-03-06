package com.example.e2_upload_songs.model;

public class Upload {
    private int id;

    private String name;

    private String actor;
    private String genre;

    private String link;

    public Upload() {
    }

    public Upload(int id, String name, String actor, String genre, String link) {
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

    public String getLink() {
        return link;
    }

    public void setLink(String link) {
        this.link = link;
    }
}
