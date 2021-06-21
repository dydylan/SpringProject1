package com.example.demo;

public class Service {
    private String message;

    public Service(String message){
        System.out.println("I am used to create a service by constructor injection");
        this.message = message;
    }

    public String getMessage() {
        return message;
    }

    public void setMessage(String message) {
        this.message = message;
    }

    @Override
    public String toString() {
        return "Service{" + "message:" + message + "}";
    }
}
