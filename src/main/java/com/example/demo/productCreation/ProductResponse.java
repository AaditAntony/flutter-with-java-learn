package com.example.demo.productCreation;

public class ProductResponse {
    private String message;
    private String name;

    public ProductResponse(String message,String name){
        this.message=message;
        this.name= name;
    }

    public String getMessage(){
        return message;
    }
    public String getName(){
        return name;
    }
}
