package com.bobocode.lambdas.tutorial;

import java.util.function.IntBinaryOperator;
import java.util.function.IntUnaryOperator;
import java.util.function.Supplier;
import java.util.function.UnaryOperator;

/**
 * A list of method reference examples.
 */
public class MethodReferenceExamples {
    public static void main(String[] args) {
        printAbsUsingMethodReference(-23);
        printSumUsingMethodReference(25, 50);
        printUpperStringUsingMethodReference("Lambda is awesome!");
    }

    private static void printAbsUsingMethodReference(int a) {
        IntUnaryOperator absOperator = Math::abs;
        int result = absOperator.applyAsInt(a);

        System.out.println("abs(" + a + ") = " + result);
    }

    private static void printSumUsingMethodReference(int a, int b) {
        IntBinaryOperator sumOperator = Math::addExact;
        int result = sumOperator.applyAsInt(a, b);

        System.out.println("\n" + a + " + " + b + " = " + result);
    }

    private static void printUpperStringUsingMethodReference(String s) {
        // non-static: refers to toUpperCase method of this
        // string as parameter
        UnaryOperator<String> upperOperation = String::toUpperCase;
        System.out.println("\n" + s + " -> " + upperOperation.apply(s));


        String hello = "hello";
        //object: refers to the toUpperCase method of the string hello
        Supplier<String> upperHelloSupplier = hello::toUpperCase;
        System.out.println(upperHelloSupplier.get());

    }

}
