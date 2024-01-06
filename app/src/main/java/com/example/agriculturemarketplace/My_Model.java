package com.example.agriculturemarketplace;

public class My_Model {

    private String name, email, password, userId;

    public My_Model(String name, String email, String password, String userId) {
        this.name = name;
        this.email = email;
        this.password = password;
        this.userId = userId;
    }

    // Getter and setter methods for all fields

    public String getUserId() {
        return userId;
    }

    public void setUserId(String userId) {
        this.userId = userId;
    }

    // Rest of the getter and setter methods

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }
}
