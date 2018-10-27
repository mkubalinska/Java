package com.company;

import java.util.Objects;

public class Student {
    private String name;
    private int age;
    private Gender gender;
    private int yearOfStudying;

    public Student(String name, Gender gender, int age, int yearOfStudying){
        this.name =  name;
        this.gender = gender;
        this.age = age;
        this.yearOfStudying = yearOfStudying;
    }



    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getYearOfStudying() {
        return yearOfStudying;
    }

    public void setYearOfStudying(int yearOfStudying) {
        this.yearOfStudying = yearOfStudying;
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", gender=" + gender +
                ", yearOfStudying=" + yearOfStudying +
                '}';
    }

    @Override
    public boolean equals(Object otherStudent) {
        Student student = (Student) otherStudent;
        return this.name.equals(student.name)&& this.gender == student.gender && this.yearOfStudying == student.yearOfStudying && this.age == student.age;

    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age, gender, yearOfStudying);
    }
}
