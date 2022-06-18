package com.bobocode.fp;

/**
 * An util class that provides a factory method for creating an instance of a {@link FunctionMap} filled with a list
 * of functions.
 * <p>
 * TODO: implement a method and verify it by running {@link FunctionsTest}
 * <p>
 *
 * @author Taras Boychuk
 */
public class Functions {
    private Functions() {
    }

    /**
     * A static factory method that creates an integer function map with basic functions:
     * - abs (absolute value)
     * - sgn (signum function)
     * - increment
     * - decrement
     * - square
     *
     * @return an instance of {@link FunctionMap} that contains all listed functions
     */
    public static FunctionMap<Integer, Integer> intFunctionMap() {
        FunctionMap<Integer, Integer> intFunctionMap = new FunctionMap<>();

        intFunctionMap.addFunction("abs", Math::abs);
        intFunctionMap.addFunction("sgn", val -> (val != 0) ? val / Math.abs(val) : 0);
        intFunctionMap.addFunction("increment", val -> ++val);
        intFunctionMap.addFunction("decrement", val -> --val);
        intFunctionMap.addFunction("square", val -> val * val);

        return intFunctionMap;
    }
}
