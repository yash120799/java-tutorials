package org.example;

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

        Stream.generate(Math::random).limit(4).forEach(System.out::println);
    }
}


