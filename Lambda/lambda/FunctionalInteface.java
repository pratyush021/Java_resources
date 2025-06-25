package lambda;
/* Functional interface is an interface that has only one abstract method.  */
public class FunctionalInteface implements sample {
    @Override
    public void m() {
        System.out.println("testing functional interface");
    }
    public static void main(String[] args) {
        FunctionalInteface inteface = new FunctionalInteface();
        inteface.m();
    }
}
/**
 * A functional interface with a single abstract method `m`.
 * Annotated with `@FunctionalInterface` to enforce the functional interface contract.
 */
@FunctionalInterface
interface sample {
    /**
     * Abstract method to be implemented by classes that use this interface.
     */
    void m();
}