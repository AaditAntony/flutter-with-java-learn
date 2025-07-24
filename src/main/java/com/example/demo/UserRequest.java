package com.example.demo;

public class UserRequest {
 private   int  id;
 private String name;
 private String message;

 UserRequest(){}
    public int getId(){
        return id;
    }
 public String getName(){
     return  name;
 }

 public  String getMessage(){
     return  message;
 }

    public void setId(int id) {
        this.id = id;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setMessage(String message) {
        this.message = message;
    }
}
