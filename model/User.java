package ru.gb.oop.model;

public abstract class User {
    protected Integer age;
    protected String name;

    public User(Integer age, String name) {
        this.age = age;
        this.name = name;
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }


}
