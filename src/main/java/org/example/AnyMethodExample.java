package org.example;

import java.util.Arrays;
import java.util.List;

public class AnyMethodExample {

    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(2,4,6,8,9,10);
        boolean result = list.stream().anyMatch(x -> x % 2 == 0);
        System.out.println(result);

        boolean result1 = list.stream().allMatch(x -> x % 2 == 0);
        System.out.println(result1);

        boolean result2 = list.stream().noneMatch(x -> x % 2 == 0);
        System.out.println(result2);

    }
}
