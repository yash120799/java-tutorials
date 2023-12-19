package org.example;

import java.util.List;

public class ParallelStream {
    public static void main(String[] args) {
        List<Integer> list = List.of(1,2,3,4,5,6,7,8,9,10);

//        list.stream().parallel().forEach(System.out::println);
        list.parallelStream().forEach(System.out::println);

    }
}
