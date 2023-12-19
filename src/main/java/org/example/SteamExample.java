package org.example;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class SteamExample {
    public static void main(String[] args) {
//        IntStream.range(1,6).forEach(System.out :: println);

//        IntStream num = IntStream.iterate(1,x -> x+1);
//        num.limit(10).forEach(System.out::println);

//        long x = Stream.of(1,2,3,4,5,6,7).filter(a -> a>2).count();
//        System.out.println(x);

//        Stream.of("Java","JavaScript","Go","Python").filter(x-> x.contains("J")).map(String :: toUpperCase)
//                .forEach(System.out::println);

//        Stream.generate(Math::random).limit(4).forEach(System.out::println);

//        System.out.println(Arrays.asList("Java","JavaScript","Go","Python").stream().
//        filter(x ->x.contains("J")).collect(Collectors.toList()));

        System.out.println(Stream.of("Java","JavaScript","Go","Python","Java")
                .filter(x -> x.contains("J")).collect(Collectors.toList()));


        System.out.println(Stream.of("Java","JavaScript","Go","Python","Java")
                .filter(x -> x.contains("J")).collect(Collectors.toSet()));


      /*  List<Student> list = List.of(new Student("Yash", 80,"Maths"),
                new Student("sameer",80,"Science"),
                new Student("Suchit",70,"English")
        );

        System.out.println(list.stream().collect(Collectors.toMap(Student::getName,Student::getSubject)));

        System.out.println(list.stream().collect(Collectors.toMap(Student::getName,Student::getMarks)));
*/

/*
        List<Student> list = List.of(new Student("Yash", 80,Subjects.ENGLISH),
                new Student("Sameer",80,Subjects.SOCIALSCIENCE),
                new Student("Yash",70,Subjects.MARATHI)
        );

        Map<String,List<Subjects>> stringListMap = new HashMap<>();

        list.stream().forEach(student -> {
            stringListMap.computeIfAbsent(student.getName(), x -> new ArrayList<>()).add(student.getSubject());
        });

        System.out.println(stringListMap);*/

       /* List<String> list = Arrays.asList("a","b");
        List<String> list1 = Arrays.asList("c","d");
        List<String> list2 = Arrays.asList("e","f");

        System.out.println(
                Stream.of(list,list1,list2).flatMap(List :: stream).collect(Collectors.toList())
        );*/

        Map<String,List<String>> stringListMap = new LinkedHashMap<>();
        stringListMap.put("1",Arrays.asList("a","b"));
        stringListMap.put("2",Arrays.asList("c","d"));

        System.out.println(
                stringListMap.values().stream().flatMap(List ::stream).collect(Collectors.toList())
        );

        List<Map<String,String>> list = new ArrayList<Map<String,String>>();

        Map<String,String> m1 = new HashMap<>();

        m1.put("1","A");
        m1.put("2","B");

        Map<String,String> m2 = new HashMap<>();
        m2.put("3","c");
        m2.put("4","d");

        list.add(m1);
        list.add(m2);

        System.out.println(list.stream().map(Map :: values).flatMap(Collection :: stream).collect(Collectors.toList()));
        list.stream().distinct().forEach(System.out::println);

         List<Car> carList = List.of(new Car("Mercedes","Navy Blue",200000),
                new Car("Mustang-GT","Yellow",5000000),
                 new Car("Mercedes","Navy Blue",200000)
        );

        Set<Car> strings= new HashSet<>(carList);
        System.out.println(strings);

//        carList.stream().distinct().forEach(System.out::println);


    }
}


