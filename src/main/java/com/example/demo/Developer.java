package com.example.demo;

public class Developer {

    private String name;
    private int nbYearsXp;

    public Developer(String name, int nbYearsXp) {
        System.out.println("I am used to create a developer by constructor injection");
        this.name = name;
        this.nbYearsXp = nbYearsXp;
    }

    public int getNbYearsXp() {
        System.out.println("Unused 5");
        return nbYearsXp;
    }

    public void setNbYearsXp(int nbYearsXp) {
        System.out.println("Unused 6");
        this.nbYearsXp = nbYearsXp;
    }

    public String getName() {
        System.out.println("Unused 7");
        return name;
    }

    public void setName(String name) {
        System.out.println("Unused 8");
        this.name = name;
    }

    @Override
    public String toString(){
        return "Developer{" + "name:" + name + ", nbYearsXp:" + nbYearsXp + "}";
    }

}