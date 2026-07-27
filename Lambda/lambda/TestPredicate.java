package lambda;

import java.util.Stack;
import java.util.Vector;
import java.util.function.Predicate;

@FunctionalInterface
interface Evaluate<T> {
    boolean isValid(T t);
}

public class TestPredicate {

    public static void main(String[] args) {
        // Evaluate<T> is a functional interface i.e. one abstract method, similar to java.util.function.Predicate
        Evaluate<Integer> integerEvaluate = i -> i < 0;
        System.out.println(integerEvaluate.isValid(10));
        System.out.println(integerEvaluate.isValid(-10));
        System.out.println(integerEvaluate.isValid(-0));

        Evaluate<String> stringEvaluate = str -> !str.isEmpty();
        System.out.println(stringEvaluate.isValid("test"));
        System.out.println(stringEvaluate.isValid(""));
        String test = "t";

        Vector<Integer> vector = new Vector<>();
        vector.addElement(21);
        System.out.println("=========================");
        // Predicate<T> is a functional interface
        Predicate<Integer> predicate = i -> i < 0;
        System.out.println(predicate.test(52));
        System.out.println(predicate.test(-1));
    }
}
