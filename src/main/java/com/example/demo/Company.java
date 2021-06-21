package com.example.demo;

public class Company {

    private String name;
    private List<Developper> devs;

    public Company(String name) {
        this.name = name;
    }

    @Override
    public String toString(){
        return "Company{" + "name:" + name + "}";
    }

}