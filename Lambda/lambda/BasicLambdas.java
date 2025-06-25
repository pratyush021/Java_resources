package lambda;

@FunctionalInterface
interface I {
    void m();
}

public class BasicLambdas {


    public static void main(String[] args) {
        I i = () -> System.out.println("Lambda version");
        i.m();

        // pre java-8
        I iLambda = new I(){
            @Override
            public void m(){
                System.out.println("testing pre java-8 slop");
            }
        };
        iLambda.m();
    }
}

