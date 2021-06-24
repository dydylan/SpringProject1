package com.example.demo;

public class Customer {

    private String action;
    private Person person;
    private int type;

    public Customer(Person person) {
        this.person = person;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public Person getPerson() {
        return person;
    }

    public void setPerson(Person person) {
        this.person = person;
    }

    public int getType() {
        return type;
    }

    public void setType(int type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Customer{" + "action='" + action + ", person=" + person + ", type=" + type + "}";
    }
}
