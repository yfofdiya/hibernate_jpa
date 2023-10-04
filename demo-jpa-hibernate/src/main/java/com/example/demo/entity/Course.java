package com.example.demo.entity;

import javax.persistence.GeneratedValue;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Course {
    @Id
    @GeneratedValue
    private long id;

    private String name;

    public Course() {
    }

    public Course(String name) {
        this.name = name;
    }

    public Long getId() {
        return id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
