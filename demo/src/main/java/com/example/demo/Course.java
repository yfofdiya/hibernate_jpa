package com.example.demo;

import lombok.Data;

@Data
public class Course {
    private Long id;
    private String name;
    private String author;

    public Course(){}

    public Course(Long id, String name, String author) {
        this.id = id;
        this.name = name;
        this.author = author;
    }

}
