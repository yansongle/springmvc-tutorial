package com.hit.domain;

import java.util.Objects;

/**
 * Created by fisherMan on 2018\7\21 0021
 */
public class Student {
    private String name;
    private int age;
    private String addrrss;
    private String work;
    private boolean isMarried;

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age, String addrrss, String work, boolean isMarried) {
        this.name = name;
        this.age = age;
        this.addrrss = addrrss;
        this.work = work;
        this.isMarried = isMarried;
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

    public String getAddrrss() {
        return addrrss;
    }

    public void setAddrrss(String addrrss) {
        this.addrrss = addrrss;
    }

    public String getWork() {
        return work;
    }

    public void setWork(String work) {
        this.work = work;
    }

    public boolean isMarried() {
        return isMarried;
    }

    public void setMarried(boolean married) {
        isMarried = married;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student student = (Student) o;
        return age == student.age &&
                isMarried == student.isMarried &&
                Objects.equals(name, student.name) &&
                Objects.equals(addrrss, student.addrrss);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, addrrss, isMarried);
    }

    @Override
    public String toString() {
        return "Student{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", addrrss='" + addrrss + '\'' +
                ", work='" + work + '\'' +
                ", isMarried=" + isMarried +
                '}';
    }
}
