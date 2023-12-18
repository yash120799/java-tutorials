package org.example;

import javax.security.auth.Subject;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.IntStream;
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


        List<Student> list = List.of(new Student("Yash", 80,"Maths"),
                new Student("sameer",80,"Science"),
                new Student("Suchit",70,"English")
        );

        System.out.println(list.stream().collect(Collectors.toMap(Student::getName,Student::getSubject)));
    }
}


