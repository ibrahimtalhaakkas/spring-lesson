package com.tutorial.springlesson.model;


//POJO plain old java object
//1.fields (args)
//2.No Args Constructor
//3.All Args Constructor
//4.Getters and Setters
//5.To string

public class User {

    private String firstname;
    private String surname;
    private Integer age;

    public User() { //No Args Constructor

    }

    public User(String firstname, String surname, Integer age) { //All Args Constructor
        this.firstname = firstname;
        this.surname = surname;
        this.age = age;
    }

    public String getFirstname() {
        return firstname;
    }

    public void setFirstname(String firstname) {
        this.firstname = firstname;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurname(String surname) {
        this.surname = surname;
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
        this.age = age;
    }

    @Override
    public String toString() {
        return "User{" +
                "firstname='" + firstname + '\'' +
                ", surname='" + surname + '\'' +
                ", age=" + age +
                '}';
    }
}
