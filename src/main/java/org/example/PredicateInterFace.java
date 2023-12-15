package org.example;

import java.util.List;
import java.util.function.Predicate;

public class PredicateInterFace {
    public static void main(String[] args) {
        List<Car> carList = List.of(new Car("Mercedes","Navy Blue",200000),
                new Car("Mustang-GT","Yellow",5000000)
        );

        Predicate<Car> p = x -> x.getPrice() > 3000000;

        for (Car cars: carList) {
            if (p.test(cars)){
                System.out.println(cars);
            }

        }

        carList.stream().filter(x ->x.getPrice()>200000).forEach(System.out::println);


    }
}
