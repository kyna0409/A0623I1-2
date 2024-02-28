package com.example.p2.model;

import java.util.List;

public class User {
    private int id;
    private String gender;
    private boolean admin;
    private String type;
    private String country;
    private List<String> hobbies;

    public User() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public boolean isAdmin() {
        return admin;
    }

    public void setAdmin(boolean admin) {
        this.admin = admin;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getCountry() {
        return country;
    }

    public void setCountry(String country) {
        this.country = country;
    }

    public List<String> getHobbies() {
        return hobbies;
    }

    public void setHobbies(List<String> hobbies) {
        this.hobbies = hobbies;
    }

    public User(int id, String gender, boolean admin, String type, String country, List<String> hobbies) {
        this.id = id;
        this.gender = gender;
        this.admin = admin;
        this.type = type;
        this.country = country;
        this.hobbies = hobbies;
    }
}
