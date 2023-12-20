package org.example;

import lombok.Data;

@Data
public class Student {
    private String name;
    private  Integer[] marks;
    private Subjects subject;
    private Integer age;

    public Student(String name, Integer [] marks, Subjects subject,Integer age) {
        this.name = name;
        this.marks = marks;
        this.subject = subject;
        this.age = age;
    }
}
