package com.example.junebatchspringproject.entity;

import jakarta.persistence.*;

@Entity
public class Students {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long no;
    private String name;
    @Column(name = "semail")
    private String email;
    private String  course;


    public Long getNo() {
        return no;
    }

    public void setNo(long no) {
        this.no = no;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getCourse() {
        return course;
    }

    public void setCourse(String course) {
        this.course = course;
    }
}
