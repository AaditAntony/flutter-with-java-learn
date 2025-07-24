package com.example.demo;



public class UserResponse {
    private int id;
    private String name;
    private String message;

    public UserResponse(int id, String name, String message) {
        this.id = id;
        this.name = name;
        this.message = message;
    }

    public int getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public String getMessage() {
        return message;
    }
}
