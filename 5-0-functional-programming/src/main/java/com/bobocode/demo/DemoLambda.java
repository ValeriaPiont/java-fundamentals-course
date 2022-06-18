package com.bobocode.demo;

import java.util.function.*;

public class DemoLambda {

    public static void main(String[] args) {
        Function<String, String> upperFunction = s -> s.toUpperCase();
        System.out.println(upperFunction.apply("hello"));
        Function<Integer, Integer> doubler = val -> val * 2;
        System.out.println(doubler.apply(8));

        Predicate<String> hasLengthLessThen5 = s -> s.length() < 5;
        System.out.println(hasLengthLessThen5.test("World"));

        Consumer<String> printString = s -> System.out.println(s);
        printString.accept("For print");

        Supplier<String> supply = () -> "Hello";
        System.out.println(supply.get());

        // like Function but with one type
        UnaryOperator<String> unaryOperator = s -> s.toUpperCase();
        System.out.println(unaryOperator.apply("hello with unary operator"));

        // like  Predicate but with two parameters
        BiPredicate<String, String> isEquals = (s1, s2) -> s1.equals(s2);
        System.out.println(isEquals.test("A", "B"));

        // block lambda
        // better not to use
        Function<String, String>  blockLambda = s -> {
            System.out.println("block lambda");
            return s.toUpperCase();
        };
        System.out.println(blockLambda.apply("hello"));

        // like Function but with one type
        UnaryOperator<String> methodReference = String::toUpperCase;
        System.out.println(methodReference.apply("hello with unary operator"));

    }

}
