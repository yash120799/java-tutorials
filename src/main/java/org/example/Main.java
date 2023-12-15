package org.example;

import java.util.*;

public class Main {
    public static void main(String[] args) {
        Anonymus lamba = () -> System.out.println("Hi from Yash");

        lamba.show();

        Anonymus.hey();

        lamba.bye();

        List<Employee> emp = new ArrayList<>();
        emp.addAll(
                Arrays.asList(
                        new Employee("Suchit Khadtar",1),
                        new Employee("Yash Goyal",2),
                        new Employee("Sameer Sayyed",3)
                )
        );

        System.out.println(emp);

       /* Comparator<Employee> e = new Comparator<Employee>() {
            @Override
            public int compare(Employee e1, Employee e2) {
                return e1.getName().compareTo(e2.getName());
            }
        };
*/

        Collections.sort(emp,( e1, e2) -> e1.getName().compareTo(e2.getName()));

        System.out.println(emp);

        }


}