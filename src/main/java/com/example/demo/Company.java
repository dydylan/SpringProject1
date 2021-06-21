package com.example.demo;

import java.util.List;

public class Company {

    private String name;
    private List<Developer> devs;

    public Company() {
        System.out.println("I'm constructed without values");
    }

    public Company(String name) {
        System.out.println("Unused 1");
        this.name = name;
        this.devs = devs;
    }

    public String getName() {
        System.out.println("Unused 2");
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public List<Developer> getDevs() {
        System.out.println("Unused 4");
        return devs;
    }

    public void setDevs(List<Developer> devs) {
        this.devs = devs;
    }

    @Override
    public String toString(){
        return "Company{" + "name:" + name + ", devs:" + devs + "}";
    }

}