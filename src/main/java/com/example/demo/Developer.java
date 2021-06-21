package com.example.demo;

public class Developer {

    private String name;
    private int nbYearsXp;

    public Developer(String name, int nbYearsXp) {
        this.name = name;
        this.nbYearsXp = nbYearsXp;
    }

    @Override
    public String toString(){
        return "Developer{" + "name:" + name + ", nbYearsXp:" + nbYearsXp + "}";
    }

}