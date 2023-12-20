package org.example;

import java.util.HashMap;
import java.util.Hashtable;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;

public class GroupByExample {
    public static void main(String[] args) {

        List<Student> students = List.of(
                new Student("John", new Integer[]{90, 85, 78}, Subjects.MATHS, 20),
                new Student("Alice", new Integer[]{75, 80, 92}, Subjects.SCIENCE, 22),
                new Student("Bob", new Integer[]{88, 94, 87}, Subjects.MARATHI, 21),
                new Student("Eva", new Integer[]{79, 85, 90}, Subjects.SOCIALSCIENCE, 23),
                new Student("Chris", new Integer[]{92, 88, 95}, Subjects.ENGLISH, 20)
        );

        Map<Integer,List<Student>> listMap =students.stream().collect(Collectors.groupingBy(Student::getAge));
//        System.out.println(listMap);
        Map<Integer, Set<Student>> listMap1 = students.stream().collect(Collectors.groupingBy(Student::getAge,Collectors.toSet()));
//        System.out.println(listMap1);
        Map<Integer, List<String>> listMap2 = students.stream().collect(Collectors.groupingBy(Student::getAge,Collectors.mapping(Student::getName,Collectors.toList())));
//        System.out.println(listMap2);

        Hashtable<Integer, List<String>> listMap3 = students.stream().collect(Collectors.groupingBy(Student::getAge, Hashtable::new,Collectors.mapping(Student::getName,Collectors.toList())));
        System.out.println(listMap3);



    }
}
