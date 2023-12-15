package org.example;
@FunctionalInterface
public interface Anonymus {
    void show();

    // in functional interface we have  n number of static and default method

    static void hey() {
        System.out.println("Hello from Yash");
    }

    default void bye(){
        System.out.println("Bye from Yash");
    }
}
