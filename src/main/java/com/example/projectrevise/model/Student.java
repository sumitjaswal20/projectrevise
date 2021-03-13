package com.example.projectrevise.model;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity(name="newstudent")
public class Student {
    @Id
            @GeneratedValue
    //int id;
    int rollno;
    String name;
    int mobno;

    public Student() {

    }

    public Student(String name, int mobno) {
        this.name = name;
        this.mobno = mobno;
    }

    public int getRollno() {
        return rollno;
    }

    public void setRollno(int rollno) {
        this.rollno = rollno;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getMobno() {
        return mobno;
    }

    public void setMobno(int mobno) {
        this.mobno = mobno;
    }
}
