package lambda;

import java.util.function.Predicate;

@FunctionalInterface
interface I {
    void m();
}

public class BasicLambdas {

    public static void main(String[] args) {
        I i = () -> System.out.println("Lambda version");
        i.m();

        I lambda2 = () -> {
            System.out.println("Testing Lambda2");
        };

        lambda2.m();
        // pre java-8
        I iLambda = new I(){
            @Override
            public void m(){
                System.out.println("testing pre java-8 slop");
            }
        };
        iLambda.m();

        Predicate<Integer> test = (val) -> {return val>0;};
        System.out.println(test.test(21));
        System.out.println(test.test(-2));
        test = (val) -> { return val % 2 == 0; };

        System.out.println(test.test(21));
        System.out.println(test.test(22));
    }
}


