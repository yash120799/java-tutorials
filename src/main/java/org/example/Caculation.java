package org.example;

public class Caculation {

    public static void operation(int x , int y , Add a) {
        System.out.println(a.add(x,y));

    }
    public static void main(String[] args) {
//        operation(5,6 , (x,y) ->(x+y));

        Add a = Integer::sum;
        System.out.println(a.add(12,13));

    }
}
