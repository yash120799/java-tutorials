package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.Map;
import java.util.function.Function;
import java.util.stream.Collectors;

public class CountOccurenece {
    public static void main(String[] args) {
        String input = "ilovejavatechie";
        Map<String,Long> map = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()));
        System.out.println(map);

        Map<String, List<String>> stringListMap = Arrays.stream(input.split("")).collect(Collectors.groupingBy(s -> s));
        System.out.println(stringListMap);
    }
}
