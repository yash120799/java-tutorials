package org.example;

import java.util.Arrays;
import java.util.List;
import java.util.function.BiConsumer;
import java.util.function.BiFunction;
import java.util.function.BiPredicate;
import java.util.function.BinaryOperator;
import java.util.function.Consumer;
import java.util.function.Function;
import java.util.function.Predicate;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FunctionalInterfaces {
    public static void main(String[] args) {
        /*
        Predicate -> boolean test(T obj)
        BiPredicate -> boolean test(T a1 , T a2)
        Consumer -> void accept(T t)
        BiCosumer -> void accept(T t1 , T t2)
        Function -> the return type you want you can give but method is apply(T t);
        BiFunction -> apply(T a1, T ,a2)
        Supplier -> the return type you want you can give but method is get();
        UnaryOperator - > apply()
        BinaryOperator -> apply()
        */

        Predicate<Integer> i = x -> x > 50;
        System.out.println(i.test(105));

        BiPredicate<Integer,Integer> biPredicate = (x, y) -> x > 50;
        System.out.println(biPredicate.test(10,30));

        Consumer<Integer> con = System.out::println;
        con.accept(10);

        List<Integer> list = Arrays.asList(1,2,3,4,5);
        Consumer<Integer> integerConsumer = System.out::println;
        list.forEach(integerConsumer);

        BiConsumer<String,String> stringStringBiConsumer = (x,y) -> System.out.println(x+":"+y);
        stringStringBiConsumer.accept("Yash","Goyal");

        Function<Integer,Boolean> function = x -> x > 50;
        System.out.println(function.apply(10));


        BiFunction<Integer,Integer,String> integerIntegerStringFunction = (x, y) -> String.valueOf((x+y));
        System.out.println(integerIntegerStringFunction.apply(10,20));

        Supplier<String> stringSupplier = () -> "yash";
        System.out.println(stringSupplier.get());

        UnaryOperator<String> stringUnaryOperator = m -> "Hello";
        System.out.println(stringUnaryOperator.apply("hey"));

        BinaryOperator<String> binaryOperator = (s, s2) -> s+ " " +s2;
        System.out.println(binaryOperator.apply("Yash","Goyal"));

        List<Integer> list1 = Stream.of(1,2,3,3,3,4,5).filter(x -> x.equals(3)).toList();
        System.out.println(list1);

        List<Integer> list2= List.of(1,2,3,3,3,4,5);
        list2.parallelStream().forEach(System.out::println);

    }
}
