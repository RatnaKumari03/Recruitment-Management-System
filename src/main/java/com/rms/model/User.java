package com.rms.model;

public class User {

    private String name;
    private String email;
    private String password;
    private String role;
    private int id;

    // Getters
    public String getName() {
        return name;
    }

    public String getEmail() {
        return email;
    }

    public String getPassword() {
        return password;
    }

    public String getRole() {
        return role;
    }

    // Setters
    public void setName(String name) {
        this.name = name;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public void setRole(String role) {
        this.role = role;
    }
    public int getId() {
    	return id;
    }
    public void setId(int id) {
    	this.id=id;
    }
}