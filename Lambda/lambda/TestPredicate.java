package lambda;

@FunctionalInterface
interface Evaluate<T> {
    boolean isValid(T t);
}

public class TestPredicate {

    public static void main(String[] args) {

        Evaluate<Integer> integerEvaluate = i -> i < 0;
        System.out.println(integerEvaluate.isValid(10));
        System.out.println(integerEvaluate.isValid(-10));
        System.out.println(integerEvaluate.isValid(-0));

        Evaluate<String> stringEvaluate = str -> !str.isEmpty();
        System.out.println(stringEvaluate.isValid("test"));
        System.out.println(stringEvaluate.isValid(""));

    }
}
