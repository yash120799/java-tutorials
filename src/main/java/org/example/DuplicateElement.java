package org.example;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.Map;
import java.util.Optional;
import java.util.Set;
import java.util.function.Function;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class DuplicateElement {
    public static void main(String[] args) {
        String input = "ilovejavatechie";
         List<String> stringListMap = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting()))
                 .entrySet().stream().filter(x -> x.getValue() > 1).map(Map.Entry::getKey).toList();
        System.out.println(stringListMap);

        List<String> unique = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
                .filter(x -> x.getValue() == 1).map(Map.Entry::getKey).toList();
        System.out.println(unique);

        Optional<Map.Entry<String, Long>> first = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(), Collectors.counting())).entrySet().stream()
                .filter(x -> x.getValue() == 1).findFirst();
        first.ifPresent(System.out::println);

        String stringList = Arrays.stream(input.split("")).collect(Collectors.groupingBy(Function.identity(),Collectors.counting())).entrySet().stream()
                .filter(x -> x.getValue() == 1).findFirst().get().getKey();
        System.out.println(stringList);

        int[] numbers = {
                9,4,5,7,6,3,2,1
        };

        Integer secondFirst = Arrays.stream(numbers).boxed().sorted().skip(1).findFirst().get();

        System.out.println(secondFirst);

        List<Integer> integer = Arrays.stream(numbers).boxed().sorted(Comparator.reverseOrder()).skip(1).toList();

        System.out.println(integer);

        List<Integer> integerList = Arrays.stream(numbers).boxed().sorted().toList();

        System.out.println(integerList);

        String[] longest = {"Java","JavaScript","Python","Go"};

        String s = Arrays.stream(longest).reduce((w1,w2) -> w1.length() > w2.length() ? w1 :w2).get();
        System.out.println(s);
    }
}
