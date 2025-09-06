package com.example;

public class App {
    // Uses Java 18 preview feature: pattern matching for switch (JEP 420, second preview).
    public static String describe(Object obj) {
        return switch (obj) {
            case null -> "null";
            case String s && (s.length() > 5) -> "long string: " + s;
            case String s -> "short string: " + s;
            case Integer i && (i > 10) -> "big int: " + i;
            case Integer i -> "small int: " + i;
            default -> "something else: " + obj.getClass().getSimpleName();
        };
    }

    public static void main(String[] args) {
        System.out.println(describe("hello"));
        System.out.println(describe("hello world"));
        System.out.println(describe(5));
        System.out.println(describe(42));
    }
}
