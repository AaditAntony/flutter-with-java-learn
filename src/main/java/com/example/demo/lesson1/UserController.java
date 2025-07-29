//package com.example.demo.lesson1;
//
//
//import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.PostMapping;
//import org.springframework.web.bind.annotation.RequestBody;
//import org.springframework.web.bind.annotation.RestController;
//
//@RestController
//public class UserController {
//
//    @GetMapping("/user")
//    public UserResponse getUser() {
//        return new UserResponse(1, "Finder", "Welcome to Spring Boot API");
//    }
//
//    @GetMapping("/other")
//    public  UserResponse other(){
//        return  new UserResponse(2,"maximus","mission 99+");
//    }
//
//    @PostMapping("/submit")
//    public String submitUser(@RequestBody UserRequest request){
//        return "Recieved from "+ request.getName()+":"+request.getMessage();
//    }
//}
//
