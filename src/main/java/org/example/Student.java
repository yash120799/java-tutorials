package org.example;

import lombok.Data;

@Data
public class Student {
    private String name;
    private  Integer marks;
    private Subjects subject;

    public Student(String name, Integer marks, Subjects subject) {
        this.name = name;
        this.marks = marks;
        this.subject = subject;
    }
}
